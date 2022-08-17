package day03_scanner.a_scanner_odev;

import java.util.Scanner;

public class S3 {
    public static void main(String[] args) {

        // Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini ekrana yazdirma

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen yaricapi girniz:");

        double r= scan.nextDouble();
        System.out.println("cemberin cevresi= "+2*3.14*r);
        System.out.println("cemberin alani= "+3.14*r*r);
    }
}
