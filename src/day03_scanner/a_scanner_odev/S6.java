package day03_scanner.a_scanner_odev;

import java.util.Scanner;

public class S6 {
    public static void main(String[] args) {

        // İsim Soyisim isteyip bir kalipta yazdirma2

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen isim ve soyisminizi aralarda enter tusuna basarak giriniz:");

        String isim= scan.nextLine();
        String soyisim= scan.nextLine();

        System.out.println("Isim - Soyisim: "+isim+" "+soyisim);

    }
}
