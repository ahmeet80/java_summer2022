package day36_inheritanceDataTypeKullanimi;


public class EYanHizmetliler extends BMuhasebe{
    int saatUcreti = 9;
    int gunlukMesai = 8;


    protected void maas() {
        System.out.println("Yan Hizmetliler :" + (30 * saatUcreti * gunlukMesai) + "maas alir");
    }

    protected void issizlikSigorta() {
        System.out.println("Yan Hizmetliler %30 ishsizlik sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        /*
        overridding child class'daki bir method'un
        parent class'daki ayni isimdeki methodu
        etkisiz hale getirerek
        kendisinin spesifik ozalligini ortaya cikarmasidir.

        Overridding'i nerede dikkate aliyoruz?
        bir obje olusturulurken data turu ve constructor farkli ise

        eger bir obbje olusturulurken
        data turu ve constructor farkli ise
        objenin ozelliklerini belirlerken
        3 konuya dikkat cekmeliyiz
        1- Obje constructor'in oldugu class'da olusur
        2- Objenin ozelliklerini aramaya data turunun oldugu class'dan bashlariz
           bu class'da aranan ozellik bulunmazsa parent class'lara bakilir
           orada bulamazsa CTE verir

            eger aranan ozellik variable ise buldugumuz ilk degeri yazdiririz
         3-eger aranan ozellik variable ise buldugumuz ilk degeri yazdiririz
           aranan ozellik method ise
           degeri yazdirmadan once
           override edilmis mi diye kontrol etmemiz gerekir
           eger override edildiyse en guncel degeri yazdiriz

         */

        BMuhasebe yh1 = new EYanHizmetliler();
        System.out.println(yh1.gunlukMesai); // M 8
        System.out.println(yh1.saatUcreti); // M 10
        yh1.maas(); // YH Yan Hizmetliler :2160 maas alir
        yh1.ozelSigorta(); // M Isteyen calisanlar %50 indirimli sigorta yapilir
        yh1.sigorta(); // P Tum personelimiz sigorta yapilir
        System.out.println(yh1.isim); // P
        System.out.println(yh1.soyisim); // P
        System.out.println(yh1.departman); // P
        // System.out.println(yh1.issizlikSigorta);
        // Aramaay muhasebeden basladigimizdan
        // issizlik sigortasi bulamadik CTE
    }
}
