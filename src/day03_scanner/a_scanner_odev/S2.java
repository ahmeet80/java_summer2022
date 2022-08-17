package day03_scanner.a_scanner_odev;

import java.util.Scanner;

public class S2 {

    public static void main(String[] args) {

        // Kullanicidan karenin bir kenar uzunlugunu alip karenin cevresini ve alanini yazdirma

        Scanner scan= new Scanner(System.in);

        System.out.println("Karenin bir kenar uzunlugunu giriniz");
        int kenar=scan.nextInt();

        System.out.println("Krenin cevresi= "+4*kenar);
        System.out.println("Krenin alani= "+(kenar*kenar));


    }
}
