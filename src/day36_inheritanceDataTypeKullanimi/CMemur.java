package day36_inheritanceDataTypeKullanimi;

import java.util.ArrayList;

public class CMemur extends BMuhasebe {

    int saatUcreti=12;
    int gunlukMesai=9;


    protected void maas(){
        System.out.println("Memurlar :" + (30*saatUcreti*gunlukMesai) + "maas alir");
    }

    protected void ozelSigorta(){
        System.out.println("Memurlar %60 ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {

        CMemur mmr1=new CMemur();
        System.out.println(mmr1.gunlukMesai); // 9
        System.out.println(mmr1.saatUcreti); // 12
        mmr1.maas(); // Memurlar :3240maas alir
        mmr1.ozelSigorta(); // Memurlar %60 ozel sigorta yaptirabilir
        mmr1.sigorta(); //Personel
        System.out.println(mmr1.isim); // Personel
        System.out.println(mmr1.soyisim); // Personel
        System.out.println(mmr1.departman); // Personel


        BMuhasebe mhsb1=new BMuhasebe();
        /*
        Her ne kadar memur class'inin icindeolsak da
        olustyrdugumuz obje Muhasebe class'indan;
        cunku dat turu ve constructor Muhasebe

        String str="Murat";

        ArrayList <Integer>  list = new ArrayList<>;
        Integer sayi=20;
        BMuhasebe class'i da obje olusturulabilen bir class'dir yani data turudur
         */

        System.out.println(mhsb1.gunlukMesai); // 8 Muhasebe
        System.out.println(mhsb1.saatUcreti); // 10 Muhasebe
        mhsb1.maas(); // Muhasebe Personel minimum :2400maas alir
        mhsb1.ozelSigorta(); // Isteyen calisanlar %50 indirimli sigorta yapilir
        mhsb1.sigorta(); //Personel Tum personelimiz sigorta yapilir
        System.out.println(mhsb1.isim); // Personel
        System.out.println(mhsb1.soyisim); // Personel
        System.out.println(mhsb1.departman); // Personel

    }

}
