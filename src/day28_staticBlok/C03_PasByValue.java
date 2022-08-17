package day28_staticBlok;

public class C03_PasByValue {
    public static void main(String[] args) {
        /*
         %25 indirimli fiyati hesaplayip bize donduren bir method olusturun
         */

        double satisFiyati=100;
        double indirimOrani=60;

        double indirimliFiyat= indirimliFiyatHesapla(satisFiyati, indirimOrani);

        System.out.println("indirimliFiyat :" +indirimliFiyat);
        System.out.println("indirimliFiyat :" +indirimliFiyat);
        System.out.println("indirimliFiyat :" +indirimliFiyat);
        System.out.println("indirimliFiyat :" +indirimliFiyat);

    }

    public static double indirimliFiyatHesapla(double satisFiyati,double indirimOrani) {
        double indirimliFiyat=satisFiyati*(1-indirimOrani/100);

        return indirimliFiyat;
    }
}
