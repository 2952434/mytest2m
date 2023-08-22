package yz.com.impala.bean.meta;

import java.math.BigDecimal;

/**
 * @Author: 李君祥
 * @create: 2023-08-22 15:17
 * @description:
 */
public class BigStatCod {
    private static final long serialVersionUID = 1L;
    private Integer v01000;
    private String cStatName;
    private String cPrvoName;
    private BigDecimal v05001;
    private BigDecimal v06001;
    private BigDecimal v07001;
    private String cMeteosta;
    private String cAgmesta;
    private String cCropsta;
    private String cSoilsta;
    private String cAutosoilsta;
    private String cTypestation;
    private String cAera;
    private String cCity;
    private String cCode;
    private Integer cTownCode;

    @Override
    public String toString() {
        return "BigStatCod{" +
                "v01000=" + v01000 +
                ", cStatName='" + cStatName + '\'' +
                ", cPrvoName='" + cPrvoName + '\'' +
                ", v05001=" + v05001 +
                ", v06001=" + v06001 +
                ", v07001=" + v07001 +
                ", cMeteosta='" + cMeteosta + '\'' +
                ", cAgmesta='" + cAgmesta + '\'' +
                ", cCropsta='" + cCropsta + '\'' +
                ", cSoilsta='" + cSoilsta + '\'' +
                ", cAutosoilsta='" + cAutosoilsta + '\'' +
                ", cTypestation='" + cTypestation + '\'' +
                ", cAera='" + cAera + '\'' +
                ", cCity='" + cCity + '\'' +
                ", cCode='" + cCode + '\'' +
                ", cTownCode=" + cTownCode +
                '}';
    }

    public BigStatCod() {
    }

    public BigStatCod(Integer v01000, String cStatName, String cPrvoName, BigDecimal v05001, BigDecimal v06001, BigDecimal v07001, String cMeteosta, String cAgmesta, String cCropsta, String cSoilsta, String cAutosoilsta, String cTypestation, String cAera, String cCity, String cCode, Integer cTownCode) {
        this.v01000 = v01000;
        this.cStatName = cStatName;
        this.cPrvoName = cPrvoName;
        this.v05001 = v05001;
        this.v06001 = v06001;
        this.v07001 = v07001;
        this.cMeteosta = cMeteosta;
        this.cAgmesta = cAgmesta;
        this.cCropsta = cCropsta;
        this.cSoilsta = cSoilsta;
        this.cAutosoilsta = cAutosoilsta;
        this.cTypestation = cTypestation;
        this.cAera = cAera;
        this.cCity = cCity;
        this.cCode = cCode;
        this.cTownCode = cTownCode;
    }

    public Integer getV01000() {
        return v01000;
    }

    public void setV01000(Integer v01000) {
        this.v01000 = v01000;
    }

    public String getcStatName() {
        return cStatName;
    }

    public void setcStatName(String cStatName) {
        this.cStatName = cStatName;
    }

    public String getcPrvoName() {
        return cPrvoName;
    }

    public void setcPrvoName(String cPrvoName) {
        this.cPrvoName = cPrvoName;
    }

    public BigDecimal getV05001() {
        return v05001;
    }

    public void setV05001(BigDecimal v05001) {
        this.v05001 = v05001;
    }

    public BigDecimal getV06001() {
        return v06001;
    }

    public void setV06001(BigDecimal v06001) {
        this.v06001 = v06001;
    }

    public BigDecimal getV07001() {
        return v07001;
    }

    public void setV07001(BigDecimal v07001) {
        this.v07001 = v07001;
    }

    public String getcMeteosta() {
        return cMeteosta;
    }

    public void setcMeteosta(String cMeteosta) {
        this.cMeteosta = cMeteosta;
    }

    public String getcAgmesta() {
        return cAgmesta;
    }

    public void setcAgmesta(String cAgmesta) {
        this.cAgmesta = cAgmesta;
    }

    public String getcCropsta() {
        return cCropsta;
    }

    public void setcCropsta(String cCropsta) {
        this.cCropsta = cCropsta;
    }

    public String getcSoilsta() {
        return cSoilsta;
    }

    public void setcSoilsta(String cSoilsta) {
        this.cSoilsta = cSoilsta;
    }

    public String getcAutosoilsta() {
        return cAutosoilsta;
    }

    public void setcAutosoilsta(String cAutosoilsta) {
        this.cAutosoilsta = cAutosoilsta;
    }

    public String getcTypestation() {
        return cTypestation;
    }

    public void setcTypestation(String cTypestation) {
        this.cTypestation = cTypestation;
    }

    public String getcAera() {
        return cAera;
    }

    public void setcAera(String cAera) {
        this.cAera = cAera;
    }

    public String getcCity() {
        return cCity;
    }

    public void setcCity(String cCity) {
        this.cCity = cCity;
    }

    public String getcCode() {
        return cCode;
    }

    public void setcCode(String cCode) {
        this.cCode = cCode;
    }

    public Integer getcTownCode() {
        return cTownCode;
    }

    public void setcTownCode(Integer cTownCode) {
        this.cTownCode = cTownCode;
    }
}
