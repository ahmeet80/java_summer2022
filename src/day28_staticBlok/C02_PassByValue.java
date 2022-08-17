package day28_staticBlok;

public class C02_PassByValue {

    public static void main(String[] args) {
        double satisFiyati=100;

        System.out.println(indirimliFiyat(satisFiyati)); // 90.0

        System.out.println(satisFiyati); //100

        System.out.println(indirimliFiyat(satisFiyati)); // 90.0

        // iki farkli method'da satis fiyati isminde variable olabilir
        // Java buna itiraz etmez cunku scopelari farklidir.
    }

    public static double indirimliFiyat(double orjinalFiyat){
        // methodumuz % 10 indirim yapip
        // yeni fiyati dondursun

        double satisFiyati=orjinalFiyat*0.9;

        return satisFiyati;
    }
}
