package day36_inheritanceDataTypeKullanimi;

public class APersonel {

    String isim="Isim belirtilmedi";
    String soyisim="Soyisim belirtilmedi";
    String departman="Departman belirtilmedi";

    protected void maas(){
        System.out.println("Tum personelimiz maas alir0");
    }

    protected void sigorta(){
        System.out.println("Tum personelimiz sigorta yapilir");
    }

}
