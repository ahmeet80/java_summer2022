package day03_scanner.a_scanner_odev;

import java.util.Scanner;

public class S7 {

    public static void main(String[] args) {

        // Kullanicidan isim alip ismin bas harfini yazdirma

        Scanner scan= new Scanner(System.in);

        System.out.println("isminizi giriniz:");

        char ilkHarf=scan.next().toUpperCase().charAt(0);

        System.out.println("isminizin bas harfi: "+ilkHarf);

    }
}
