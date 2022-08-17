package day37_overridding;

public class FSupra extends EToyota{

    void yakit(){
        System.out.println("Supra benzin kullanir");
        /*
        eger private method'lar @override edilemez
        Eger Child class'da parent class'daki private method ile
        ayni signature'da bir method olusturursaniz
        bu overridding method OLMAZ
         */
    }

    @Override
    void motor() {
       /*
       @Override notasyonu Java'ya bir gorev verir
       Java, bu notasyonla birbirine bagli olan iki method'u
       surekli kontrol eder
       Eger parent class'daki overridden method'u silerseniz
       CTE verir

       @Override notasyonu kullanmak mecburi degildir
       Eger Override method silinirse, kodun CTE vermesini istersek
       @Override notasyonu kullanabiliriz
        */
    }
}
