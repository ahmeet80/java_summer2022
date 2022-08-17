package day10_stringManipulation.odev;

import java.util.Scanner;

public class IndexOf_01 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Bir cumle ve harf giriniz");

        String  cumle= scan.nextLine();
        char harf= scan.next().charAt(0);

        int kontrol= cumle.indexOf(harf);
        if(kontrol==-1){
            System.out.println(harf+" harfi girilen cumle icerisinde yoktur");
        }else {
            System.out.println(harf+" harfi girilen cumle icerisinde vardir");
        }

    }
}
