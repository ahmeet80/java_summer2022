package day36_inheritanceDataTypeKullanimi;

import java.util.*;

public class DIsci extends BMuhasebe{
    int saatUcreti=11;
    int gunlukMesai=7;


    protected void maasIsci(){
        System.out.println("Isciler :" + (30*saatUcreti*gunlukMesai) + "maas alir");
    }

    protected void ozelSigortaIsci(){
        System.out.println("sciler %70 ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        BMuhasebe isc1=new DIsci();
        /*
        Bir obje olusturulurken
        data turu ve constructor ayni class'dan ise
        direkt o class'a gidiyorduk

        Eger data turu ve cons farkli ise
        Obje constructor'in oldugu class'in objesidir
        ancak, bizden istenen
        Isci class'indaki spesifik ozellikler degil
        Bir iscinin muhasebe class'indaki
        tum calisanlar ile berabersahip oldugu
        genel ozellikleri yazdirir
        */

        System.out.println(isc1.gunlukMesai); // M 8
        System.out.println(isc1.saatUcreti); // M 10
        isc1.maas(); // M Personel minimum :2400maas alir
        isc1.ozelSigorta(); // M Isteyen calisanlar %50 indirimli sigorta yapilir
        isc1.sigorta(); // P Tum personelimiz sigorta yapilir
        System.out.println(isc1.isim); // P Isim belirtilmedi
        System.out.println(isc1.soyisim); // P Soyisim belirtilmedi
        System.out.println(isc1.departman); // P Departman belirtilmedi

        APersonel isci2=new DIsci();

        // System.out.println(isci2.gunlukMesai);    CTE
        // System.out.println(isci2.saatUcreti);    CTE
        // isci2.ozelSigorta(); //    CTE
        isci2.sigorta(); //  P
        System.out.println(isci2.soyisim); // P
        System.out.println(isci2.departman); // P

        /*
        Eger data turu olan class'da aradigimiz ozellik yoksa
        varsa onun parent'ina gidebilir
        ama chil'da yoksa donus olmaz
        Aradigi ozelligi bulamazsa CTE verir
         */

        List<String> list1=new LinkedList<>();
        Deque<String> list2=new LinkedList<>();
        Queue<String> list3=new LinkedList<>();

        /*
        Hepsi LinkedList olsa da
        list1 List gibi davranir
        list2 Deque gibi davranir
        list3 Queue gibi davranir
         */



    }
}
