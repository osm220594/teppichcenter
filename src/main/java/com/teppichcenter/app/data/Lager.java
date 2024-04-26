package com.teppichcenter.app.data;

public class Lager extends AbstractEntity{


    private String art;
    private String bezeichnung;
    private String handy;
    private String adresse;
    private boolean status;


    public Lager(String art, String bezeichnung, String handy, String adresse, boolean status) {
        setArt(art);
        setBezeichnung(bezeichnung);
        setHandy(handy);
        setAdresse(adresse);
        setStatus(status);
    }


    public String getArt() {
        return art;
    }


    public void setArt(String art) {
        this.art = art;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }


    public String getHandy() {
        return handy;
    }


    public void setHandy(String handy) {
        this.handy = handy;
    }


    public String getAdresse() {
        return adresse;
    }


    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


    public boolean isStatus() {
        return status;
    }


    public void setStatus(boolean status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Lager{" +
                "art='" + art + '\'' +
                ", bezeichnung='" + bezeichnung + '\'' +
                ", handy='" + handy + '\'' +
                ", adresse='" + adresse + '\'' +
                ", status=" + status +
                "} " + super.toString();
    }
}