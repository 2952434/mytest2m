package yz.com.impala.bean.meta;

/**
 * 牧草名称编码(TPAgmeE002Cod)实体类
 */
public class AgmeE002Cod extends AgmeE002CodKey {

    /**
     * 牧草名称
     */
    private String cGrassname;
    /**
     * 科别
     */
    private String cFamily;
    /**
     * 学名
     */
    private String cScientificname;

    public String getcGrassname() {
        return cGrassname;
    }

    public void setcGrassname(String cGrassname) {
        this.cGrassname = cGrassname;
    }

    public String getcFamily() {
        return cFamily;
    }

    public void setcFamily(String cFamily) {
        this.cFamily = cFamily;
    }

    public String getcScientificname() {
        return cScientificname;
    }

    public void setcScientificname(String cScientificname) {
        this.cScientificname = cScientificname;
    }

    @Override
    public String toString() {
        return "AgmeE002Cod{" +
                "cGrassname='" + cGrassname + '\'' +
                ", cFamily='" + cFamily + '\'' +
                ", cScientificname='" + cScientificname + '\'' +
                "} " + super.toString();
    }
}
