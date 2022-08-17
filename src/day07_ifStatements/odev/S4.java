package day07_ifStatements.odev;

import java.util.Scanner;

public class S4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dikdoortgenin kenar uzunluklarini aralarda enter'a basarak giriniz");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        if(kenar1==kenar2){
            System.out.println("Girilen Dikdortgen bir karedir");
        }else System.out.println("Girilen Dikdortgen bir kare degildir!!!");
    }
}
