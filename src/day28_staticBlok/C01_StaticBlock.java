package day28_staticBlok;

public class C01_StaticBlock {

    static int sayi ;
    static {
        /* static block class uyelerinin tamamindan once calisir
         (main method'dan bile once)

         static blok class olusturuldugunda calisir
         genellikle de class ile ilgili on ayarlamalar
         veya static variable'lara degeratamak icin kullanilir

         static bloklarin class icerisinde nerede oldugu onemli degildir
         once static bloklar calisir

         birden fazla static blok varsa, yukaridan asagi dogru calisir
         */
        System.out.println("static blok calisti");
    }

    public static void main(String[] args) {
        System.out.println("Main method calisti");
        System.out.println(sayi);
    }
    static{
        System.out.println("main method altindaki static blok calisti");
    }
}
