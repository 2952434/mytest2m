package yz.com.mytestresource.resource;

import org.springframework.stereotype.Service;
import yz.com.impala.bean.meta.AgmeE002Cod;
import yz.com.impala.bean.meta.criteria.AgmeE002CodCriteria;
import yz.com.impala.bean.meta.criteria.AgmeE002CodCriteriaFactory;
import yz.com.impala.bean.znq.criteria.SurfDayEleCriteria;
import yz.com.impala.bean.znq.criteria.SurfDayEleCriteriaFactory;
import yz.com.impala.dao.meta.BigAgmeE002CodDao;
import yz.com.impala.dao.znq.BigSurfDayEleDao;

/**
 * 判据
 */
@Service
public class My2Resource {

    private final BigAgmeE002CodDao bigAgmeE002CodDao;
    private final BigSurfDayEleDao surfDayEleDao;

    public My2Resource(BigAgmeE002CodDao bigAgmeE002CodDao, BigSurfDayEleDao surfDayEleDao) {
        this.bigAgmeE002CodDao = bigAgmeE002CodDao;
        this.surfDayEleDao = surfDayEleDao;
    }


    public long getCount() {
        SurfDayEleCriteriaFactory instance = SurfDayEleCriteriaFactory.getInstance();
        SurfDayEleCriteria criteria = instance.createCriteria();
        criteria.andNdateBetween(20220101, 20220110);
        criteria.andV01000EqualTo(50136);

        long count = surfDayEleDao.countByCriteria(instance);
        return count;
    }

    public AgmeE002Cod getOne() {
        AgmeE002CodCriteriaFactory instance = AgmeE002CodCriteriaFactory.getInstance();

        AgmeE002CodCriteria criteria = instance.createCriteria();
        criteria.andCCodeEqualTo("02010001");

        return bigAgmeE002CodDao.selectOneByCriteria(instance);
    }
}
