package day03_scanner.a_scanner_odev;

import java.util.Scanner;

public class S4 {
    public static void main(String[] args) {

        // Dikdörtgenler prizmasinin ayritlarini kullanicidan isteyip hacmini ekrana yazdirma
        Scanner scan= new Scanner(System.in);
        System.out.println("Dikdlrtgenler prizmasinin 3 ayritini entera basarak giriniz");

        double en= scan.nextDouble();
        double boy= scan.nextDouble();
        double yukseklik= scan.nextDouble();

        System.out.println("Prizmanin hacmi= "+(en*boy*yukseklik));

    }
}
