package day10_stringManipulation;

import java.util.Locale;

public class C02_toLoverCase_toUpperCase {
    public static void main(String[] args) {

        String str="Benı psıkopata baglamayın";

        System.out.println(str.toUpperCase()); //BENI PSIKOPATA BAGLAMAYIN

        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));
        /*

         */

    }
}
