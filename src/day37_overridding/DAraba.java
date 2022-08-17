package day37_overridding;

public class DAraba {

    private void yakit(){
        System.out.println("Tum rabalar yakit kullanir");
        /*
        Parent class'dan override edilmsini istemedigimiz method'lari
        private veya static yapabiliriz
         */
    }

    void marka(){
        System.out.println("Tum arabalarin markasi vardir");
    }

    void motor(){
        System.out.println("Tum arabalarin motoru vardir");
    }
}
