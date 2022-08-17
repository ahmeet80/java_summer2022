package day07_ifStatements.odev;

import java.util.Scanner;

public class S5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir gun ismi giriniz");
        String gunIsmi = scan.next().toLowerCase();
        if (gunIsmi.equals("cuma")) {
            System.out.println("Muslumanlar icin kutsal gun");
        } else if (gunIsmi.equals("cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");
        } else if (gunIsmi.equals("pazar")) {
            System.out.println("Yahudiler icin kutsal gun");
        }else System.out.println("Bir gun ismi girmediniz veya Kutsal olmayan bir gun girdiniz");
    }
}
