package day07_ifStatements.odev;

import java.util.Locale;
import java.util.Scanner;

public class S3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir gun ismi giriniz");
        String gunIsmi = scan.next().toLowerCase();
        if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") ||
                gunIsmi.equals("persembe") || gunIsmi.equals("Cuma")) {
            System.out.println("Hafta ici");
        } else if (gunIsmi.equals("cumartesi") || gunIsmi.equals("Pazar")) {
            System.out.println("Hafta sonu");
        } else System.out.println("Lutfen grcerli bir gun giriniz");
    }
}
