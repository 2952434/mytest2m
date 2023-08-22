package yz.com.impala.bean.meta.criteria;

import yz.com.dao.AbstractCriteriaFactory;

public class AgmeE002CodCriteriaFactory extends AbstractCriteriaFactory<AgmeE002CodCriteria> {

    public static AgmeE002CodCriteriaFactory getInstance() {
        return new AgmeE002CodCriteriaFactory();
    }

    @Override
    protected AgmeE002CodCriteria createCriteriaInternal() {
        return new AgmeE002CodCriteria();
    }

}
