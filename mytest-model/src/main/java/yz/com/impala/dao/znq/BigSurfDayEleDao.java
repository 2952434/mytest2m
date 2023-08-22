package yz.com.impala.dao.znq;


import java.util.Map;

public interface BigSurfDayEleDao extends SurfDayEleDao {
    long getCountByMap(Map<String, Object> params);
}