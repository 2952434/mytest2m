package yz.com.impala.dao.znq;


import yz.com.impala.bean.znq.SurfDayEle;

import java.util.List;
import java.util.Map;

public interface BigSurfDayEleDao extends SurfDayEleDao {

    long getCountByMap(Map<String, Object> params);

//    /**
//     * 根据时间范围查询SurfDayEle
//     * @param startDate 开始时间
//     * @param endDate 结束时间
//     * @return SurfDayEle
//     */
    List<SurfDayEle> getSurfDayEleByDate(Map<String, Integer> params);

}