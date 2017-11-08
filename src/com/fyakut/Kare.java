package com.fyakut;

public class Kare  extends GeometrikSekiller{
    private  double kenar1;

    public Kare(double kenar1) {
        this.kenar1 = kenar1;
    }

    public double getKenar1() {
        return kenar1;
    }

    public void setKenar1(double kenar1) {
        this.kenar1 = kenar1;
    }

    @Override
    public double alanbul() {
        return kenar1*kenar1;
    }
}
