package day33_encapsulation;

public class Tasit {

    private String tasitTuru;
    private boolean muayemesiVarMi;
    private int yil;

    public String getTasitTuru() {
        return tasitTuru;
    }

    // getter method'u tek bir satirlik islem yapiyor
    // baska class'larin private oldugu icin erisemedigi
    // tasitTuru bilgisini, class icinden alip
    // istenen farkli clas

    public void setTasitTuru(String tasitTuru) {
        this.tasitTuru = tasitTuru;
    }

    //return olmadığı icin bu methodun cağırıldığı tasitrunner classinden yazdirilamaz
    //burada bir satırlık islem yapıyor o bir satırlık islemde bizim gönderdiğimiz parametreyi instence variable a atıyor.

    public boolean isMuayemesiVarMi() {
        return muayemesiVarMi;
    }

    // boolean variabe'ler icin olusturulan methodlarin ismi
    // isVariableIsmi seklinde olur

    public void setMuayemesiVarMi(boolean muayemesiVarMi) {
        this.muayemesiVarMi = muayemesiVarMi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
}
