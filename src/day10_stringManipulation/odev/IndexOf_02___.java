package day10_stringManipulation.odev;

import java.util.Scanner;

public class IndexOf_02___ {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir cumle ve kelime giriniz");

        String cumle = scan.nextLine();
        String kelime = scan.next().toLowerCase();

        int kontrol = cumle.indexOf(kelime);
        int kontrol2 = cumle.indexOf(kelime, kontrol);
        if (kontrol == -1) {
            System.out.println(kelime + " kelimesi girilen cumle icerisinde yoktur");
        } else if (kontrol != -1) {
            if (kontrol2 != -1) {
                System.out.println(kelime + " kelimesi girilen cumle icerisinde 1'den fazla gecmektedir");
            }
        } else System.out.println(kelime + " kelimesi girilen cumle icerisinde 1 defa gecmektedir");
    }
}