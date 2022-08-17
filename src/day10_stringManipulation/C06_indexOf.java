package day10_stringManipulation;

public class C06_indexOf {

    public static void main(String[] args) {

        String str= "Java ogrenmek cok guzel";

        System.out.println(str.indexOf("o")); // 5
        System.out.println(str.indexOf("g")); // 6
        System.out.println(str.indexOf("t"));   // bana integer donduruyor
                                                //int'de yok diye bir deger bulunmuyor
                                                //0 dersek J'nin index'idir
                                                // -1 deger donerse biz aranan string'in str'da olmadigini
                                                // Java -1 dondurmeyi tercih etmistir


    }
}
