package practice_day6;

import java.util.Scanner;

public class Q01_WhileLoop {

    // girilen sayının basamaklarındaki rakamların toplamını bulunuz.(interwiew sorusu)

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();

        System.out.println("Girilen sayilarin basamak toplami :"+basamakToplama(sayi));

    }

    private static int basamakToplama(int sayi) {
        int toplam=0;
        while (sayi!=0){
            toplam+=sayi%10;
            sayi/=10;
        }

        return  toplam;
    }
}
