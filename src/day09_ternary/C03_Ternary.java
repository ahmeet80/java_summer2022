package day09_ternary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        // kullanicidan bir sayi isteyin
        // sayi poztifse sayiyi yazdirin
        // sayi sifir veya negatifse, bir sayi daha isteyin ve ikisinin carpimini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi1= scan.nextDouble();

        if(sayi1>0){
            System.out.println(sayi1);
        } else {
            System.out.println("Lutfen bir sayi daha giriniz");
            double  sayi2= scan.nextDouble();
            System.out.println(sayi1*sayi2);
        }

        /*
        Eger if else icerisinde yeni kodlar varsa
        ternary ile yapmamiz mumkun olmaz
        */

    }
}
