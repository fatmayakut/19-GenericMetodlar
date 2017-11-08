package com.fyakut;

public class Main2 {
    public static void main(String... args){

        Kare k1=new Kare(5);
        Kare k2=new Kare(6);

        Dikdortgen d1=new Dikdortgen(5,6);
        Dikdortgen d2=new Dikdortgen(7,6);
/** Generic yok ise
    Kare buyukolanalan=alanKarsılastır(k1,k2);
        System.out.println(buyukolanalan.alanbul());

        Dikdortgen buyukolanalanDik=alanKarsılastır(d1,d2);
        System.out.println(buyukolanalanDik.alanbul());
        */
        //generic var ise
        System.out.println(alankarsilasrtrGeneric(d1,d2).alanbul());
        System.out.println(alankarsilasrtrGeneric(k1,k2).alanbul());
    }

/**generc yok ise
 *
    public static Kare  alanKarsılastır(Kare k1,Kare k2){
        if (k1.alanbul()>k2.alanbul()){
            return k1;
        }else
            return k2;
    }

    public static Dikdortgen  alanKarsılastır(Dikdortgen k1,Dikdortgen k2){
        if (k1.alanbul()>k2.alanbul()){
            return k1;
        }else
            return k2;
    }
**/
//generic var ise
public static <Genel extends GeometrikSekiller> Genel alankarsilasrtrGeneric(Genel g1,Genel g2){
    if (g1.alanbul()>g2.alanbul()){
        return g1;
    }else
        return g2;
}
}
