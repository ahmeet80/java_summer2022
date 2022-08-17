package day10_stringManipulation;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;

public class C05_length {

    public static void main(String[] args) {

        String str= "Java ogren isi kap";

        System.out.println(str.length()); // str'nin karakter sayisini dondurur 19

        System.out.println(str.charAt(str.length()-1)); // son karakteri yazdiralim

        System.out.println(str.charAt(str.length()-3)); // sondan 3. karakteri yazdiralim

        /*
        Java'da null pointer (isaretleyici) bir deger degil,
        karsisina yazildigi
         */

        String str2= "" ;   //
                            //

        System.out.println(str2.length()); //

        String str3=null;   //
                            //
        System.out.println(str3.length());  //
                                            //




    }
}
