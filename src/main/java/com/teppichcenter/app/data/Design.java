package com.teppichcenter.app.data;

public class Design extends AbstractEntity{

    private String code;
    private String beschreibung;

    public Design(String code, String beschreibung) {
        setCode(code);
        setBeschreibung(beschreibung);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }


    @Override
    public String toString() {
        return "Design{" +
                "id='" + code + '\'' +
                ", beschreibung='" + beschreibung + '\'' +
                "} " + super.toString();
    }
}