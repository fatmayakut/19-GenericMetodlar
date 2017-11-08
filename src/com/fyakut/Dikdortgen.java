package com.fyakut;

public class Dikdortgen extends GeometrikSekiller {
private double en;
private double boy;

    public Dikdortgen() {
    }

    public Dikdortgen(double en, double boy) {
        this.en = en;
        this.boy = boy;
    }

    public double getEn() {
        return en;
    }

    public void setEn(double en) {
        this.en = en;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    @Override
    public double alanbul() {
        return en*boy;
    }
}
