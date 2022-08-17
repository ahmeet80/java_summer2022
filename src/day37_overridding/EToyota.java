package day37_overridding;

public class EToyota extends DAraba{


    @Override
    void marka() {
        /* super.marka();
        eger hem overridden hemde overriding method'un calismasini istersek
        ilk satira super.Merka() yazabiliriz
         */

    }

    void motor(){
        System.out.println("Toyota araclar Toyota marka motor kullanir");
    }
}
