package day20_arrays;

import java.util.Arrays;

public class C03_Length {
    public static void main(String[] args) {

        // iki sekilde array olusturabiliriz
        int sayilar[]={1, 2, 3};

        String harfler[]=new String[4];

        System.out.println("sayilar array'inin uzunlugu : "+ sayilar.length); // 3
        // String length() method'unda parantez var, array'de yok
        System.out.println("harfler array'inin uzunlugu : " + harfler.length); //4
        System.out.println(Arrays.toString(harfler)); // [null, null, null, null]

        // hafler array'inin son elementini yazdiralim
        System.out.println(harfler[harfler.length-1]);

        System.out.println(harfler[5]); // ArrayIndexOutOfBoundsException
    }
}
