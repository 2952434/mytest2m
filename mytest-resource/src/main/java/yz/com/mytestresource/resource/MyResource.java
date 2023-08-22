package yz.com.mytestresource.resource;

import org.springframework.stereotype.Service;
import yz.com.impala.bean.meta.AgmeE002Cod;
import yz.com.impala.bean.znq.SurfDayEle;
import yz.com.impala.dao.meta.BigAgmeE002CodDao;
import yz.com.impala.dao.znq.BigSurfDayEleDao;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class MyResource {

    private final BigAgmeE002CodDao bigAgmeE002CodDao;
    private final BigSurfDayEleDao surfDayEleDao;

    public MyResource(BigAgmeE002CodDao bigAgmeE002CodDao, BigSurfDayEleDao surfDayEleDao) {
        this.bigAgmeE002CodDao = bigAgmeE002CodDao;
        this.surfDayEleDao = surfDayEleDao;
    }


    public List<Integer> getData() {
        return IntStream.range(1, 11)
                .boxed()
                .collect(Collectors.toList());
    }

    public List<AgmeE002Cod> getE02() {
        return bigAgmeE002CodDao.getByMap(null);
    }


    public List<SurfDayEle> getSurf() {
        Map<String, Object> param = new HashMap<>();
        param.put("statIds", Arrays.asList(50136));
        param.put("v04001", Arrays.asList(2022));
        List<SurfDayEle> byMap = surfDayEleDao.getByMap(param);
        return byMap;
    }

    public long getCount() {
        Map<String, Object> param = new HashMap<>();
        param.put("statIds", Arrays.asList(50136));
        param.put("v04001", Arrays.asList(2022));
        return surfDayEleDao.getCountByMap(param);
    }
}
