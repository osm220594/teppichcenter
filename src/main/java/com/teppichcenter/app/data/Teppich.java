package com.teppichcenter.app.data;

public class Teppich extends AbstractEntity{
    private String produktbild;
    private String farbe;
    private String design;
    private String qualitaet;
    private String eanCode;
    private String dimension;


    public Teppich(String produktbild, String farbe, String design, String qualitaet, String eanCode, String dimension) {
        setProduktbild(produktbild);
        setFarbe(farbe);
        setDesign(design);
        setQualitaet(qualitaet);
        setEanCode(eanCode);
        setDimension(dimension);
    }

    public String getProduktbild() {
        return produktbild;
    }

    public void setProduktbild(String produktbild) {
        this.produktbild = produktbild;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public String getQualitaet() {
        return qualitaet;
    }

    public void setQualitaet(String qualitaet) {
        this.qualitaet = qualitaet;
    }

    public String getEanCode() {
        return eanCode;
    }

    public void setEanCode(String eanCode) {
        this.eanCode = eanCode;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return "Teppich{" +
                "produktbild='" + produktbild + '\'' +
                ", farbe='" + farbe + '\'' +
                ", design='" + design + '\'' +
                ", qualitaet='" + qualitaet + '\'' +
                ", eanCode='" + eanCode + '\'' +
                ", dimension='" + dimension + '\'' +
                "} " + super.toString();
    }
}