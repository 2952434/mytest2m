package yz.com.impala.bean.meta;

/**
 * 牧草名称编码(TPAgmeE002Cod)实体类Key
 */
public class AgmeE002CodKey {
    /**
     * 编码
     */
    private String cCode;

    public String getcCode() {
        return cCode;
    }

    public void setcCode(String cCode) {
        this.cCode = cCode;
    }

    @Override
    public String toString() {
        return "AgmeE002CodKey{" +
                "cCode='" + cCode + '\'' +
                '}';
    }
}
