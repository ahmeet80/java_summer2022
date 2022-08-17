package day04_dataCasting.data_casting_odev;

public class S1 {

    public static void main(String[] args) {
        // Soru 1

        // byet veri tipinde bir degisken olustuturup
        // short,int,float ve double data tiplerinde wideninig yapip yazdirma

        byte sayi= 125;
        short short_sayi= sayi;
        int int_sayi= sayi;
        float float_sayi= sayi;
        double double_sayi= sayi;

        System.out.println(short_sayi+" "+int_sayi+" "+float_sayi+" "+double_sayi);

    }
}
