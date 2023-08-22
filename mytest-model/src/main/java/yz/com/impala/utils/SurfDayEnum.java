package yz.com.impala.utils;

/**
 * @Author: 李君祥
 * @create: 2023-08-21 15:51
 * @description:
 */
public enum SurfDayEnum {

    TAVTMP("平均气温", "v12001", "TAV"),

    TMXTMP("最高气温", "v12052", "TMX"),

    TMITMP("最低气温", "v12053", "TMI"),

    RAINFALL("降雨量", "v13201", "RRR");

    private String name;
    private String code;
    private String type;

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    SurfDayEnum(String name, String code, String type) {
        this.name = name;
        this.code = code;
        this.type = type;
    }


    public static SurfDayEnum getTmpEnumByCode(String code) {
        for (SurfDayEnum value : values()) {
            if (value.code.equals(code)) {
                return value;
            }
        }
        return null;
    }
}
