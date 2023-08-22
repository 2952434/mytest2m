package yz.com.mytestresource.resource;

import org.springframework.stereotype.Service;
import yz.com.core.models.gdal.Point3D;
import yz.com.impala.bean.meta.BigStatCod;
import yz.com.impala.bean.znq.SurfDayEle;
import yz.com.impala.dao.meta.BigStatCodDao;
import yz.com.impala.dao.znq.BigSurfDayEleDao;
import yz.com.impala.utils.DateUtil;
import yz.com.impala.utils.SurfDayEnum;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: 李君祥
 * @create: 2023-08-22 14:24
 * @description:
 */
@Service
public class DisasterIndexrResource {

    @Resource
    private BigStatCodDao bigStatCodDao;
    @Resource
    private BigSurfDayEleDao bigSurfDayEleDao;

    public String interpolationByProvince(String startDate, String endDate, String province, String tmpCode) {
        String tifName;
        SurfDayEnum surfDayEnum = SurfDayEnum.getTmpEnumByCode(tmpCode);
        if (surfDayEnum == null) {
            return "不存在该类型：" + tmpCode + "，插值失败";
        }
        tifName = String.format("Z_AGME_C_BABJ_%s_P_CAGMSS_WCRM_ONED-%s_5KM_CHN_L88_PD_000_00.tif", "000000", surfDayEnum.getType());

        List<String> dateList = DateUtil.getDateList(startDate, endDate);
        for (String date : dateList) {
            List<Point3D> point3DList = getPoint3DListBySeDate(date, province, surfDayEnum);
            System.out.println(point3DList);
        }
        return null;
    }

    /**
     * 根据日期和省份获取Point3D
     * @param date 开始时间
     * @param province 省份
     * @param tmpType 天气类型
     * @return List<Point3D>
     */
    public List<Point3D> getPoint3DListBySeDate(String date, String province, SurfDayEnum tmpType) {
        // znqdb.t_r_surf_day_ele
        List<SurfDayEle> surfDayEle = getSurfDayEle(date);
        // znqdb_meta.t_p_mang_stat_cod
        List<BigStatCod> statCodList = getBigStatCodByProvinceName(province);
        Set<Integer> v01000s = statCodList.stream().map(BigStatCod::getV01000).collect(Collectors.toSet());
        surfDayEle = surfDayEle.stream().filter(itme -> v01000s.contains(itme.getV01000())).collect(Collectors.toList());
        // znqdb_meta.t_p_mang_stat_cod
        return getPoint3dList(surfDayEle, statCodList, tmpType);
    }

    /**
     * 获得 Point3D 集合进行插值
     * @param surfDayEle 观测点数据结合
     * @param statCodList 地区信息集合
     * @param tmpType 插值类型
     * @return List<Point3D>
     */
    private List<Point3D> getPoint3dList(List<SurfDayEle> surfDayEle, List<BigStatCod> statCodList, SurfDayEnum tmpType) {
        Map<Integer, BigStatCod> statCodMap = statCodList.stream().collect(Collectors.toMap(BigStatCod::getV01000, item -> item));
        List<Point3D> point3dList = new ArrayList<>();
        surfDayEle.forEach(item -> {
            if (statCodMap.containsKey(item.getV01000())) {
                BigStatCod bigStatCod = statCodMap.get(item.getV01000());
                Point3D point3D = new Point3D();
                point3D.setId(item.getV01000());
                point3D.setLat(bigStatCod.getV05001().doubleValue());
                point3D.setLon(bigStatCod.getV06001().doubleValue());
                if (tmpType == SurfDayEnum.TAVTMP) {
                    point3D.setData(item.getV12001());
                } else if (tmpType == SurfDayEnum.TMXTMP) {
                    point3D.setData(item.getV12052());
                } else if (tmpType == SurfDayEnum.TMITMP) {
                    point3D.setData(item.getV12053());
                } else if (tmpType == SurfDayEnum.RAINFALL) {
                    point3D.setData(item.getV13201());
                }
                point3dList.add(point3D);
            }
        });
        return point3dList;
    }


    /**
     * 根据省的名称获取 BigStatCod 集合
     * @param province 省名
     * @return List<BigStatCod>
     */
    private List<BigStatCod> getBigStatCodByProvinceName(String province) {
        Map<String, Object> map = new HashMap<>();
        List<String> typeList = new ArrayList<>();
        typeList.add("基本站");
        typeList.add("基准站");
        typeList.add("一般站");
        map.put("cTypestation", typeList);
        map.put("cPrvoName", province);
        return bigStatCodDao.getByMap(map);
    }

    /**
     * 根据日期查询 SurfDayEle
     * @param date 日期
     * @return List<SurfDayEle>
     */
    public List<SurfDayEle> getSurfDayEle(String date) {
        Map<String,Integer> params = new HashMap<>();
        params.put("date", Integer.valueOf(date));
        return bigSurfDayEleDao.getSurfDayEleByDate(params);
    }



}
