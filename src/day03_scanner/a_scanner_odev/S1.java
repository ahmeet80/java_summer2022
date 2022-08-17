package day03_scanner.a_scanner_odev;

import java.util.Scanner;

public class S1 {

    public static void main(String[] args) {

        // Kullanicidan alinan iki sayinin toplam, fark ve çarpımlarını yazdirma
        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen 1.Tam sayiyi giriniz");
        int sayi1= scan.nextInt();

        System.out.println("Lutfen 2.Tam sayiyi giriniz");
        int sayi2= scan.nextInt();

        System.out.println("Girilen sayilarin toplami: "+(sayi1+sayi2));
        System.out.println("Girilen sayilarin carpimi: "+(sayi1*sayi2));
        System.out.println("Girilen sayilarin farki: "+(sayi1-sayi2));
    }
}
