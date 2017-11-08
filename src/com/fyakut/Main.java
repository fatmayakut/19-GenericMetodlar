package com.fyakut;

public class Main {

    public static void main(String[] args) {
	// write your code here


        String[] dizistring = {"berfin", "rojda", "avşin"};
        Integer[] diziint1 = {21, 25, 28};
        Double[] dizidouble2 = {10.0, 11.0, 12.0};
        Character[] dizichar = {'a', 'b', 'c'};
       /**
        yazdır(dizistring);
        yazdır(diziint1);
        yazdır(dizidouble2);
        yazdır(dizichar);
        */

        yazdırGeneric(dizichar);
        yazdırGeneric(dizidouble2);
        yazdırGeneric(diziint1);
        yazdırGeneric(dizistring);

    }
    public static<Genel> void yazdırGeneric(Genel[] dizi){
        for (Genel a:dizi)
            System.out.println(a);
    }
 /** Generc tip ile tek bir metot ile bu işlem yapılabilir
  *
public static  void yazdır(String[] dizi){
        for (String a:dizi)
            System.out.println(a);
    }

    public static  void yazdır(Integer[] dizi){
        for (Integer a:dizi)
            System.out.println(a);
    }

    public static  void yazdır(Character[] dizi){
        for (Character a:dizi)
            System.out.println(a);
    }

    public static  void yazdır(Double[] dizi){
        for (Double a:dizi)
            System.out.println(a);
    }**/


}
