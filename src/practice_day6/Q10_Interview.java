package practice_day6;

import java.util.Scanner;

public class Q10_Interview {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("lutfen bir string giriniz :");
        String input = scanner.nextLine();
        System.out.print("lutfen bir sayi giriniz :");
        int sayi = scanner.nextInt();

        System.out.println("ilkSonharf(input, sayi) "+ilkSonharf(input, sayi));


    }

    private static String  ilkSonharf(String str, int n) {
        String s = str.substring(0,1) + str.substring(str.length()-1);
        String sonuc ="";

        for (int i = 1; i <=n ; i++) {
            sonuc=sonuc+s;
        }
        return sonuc;
    }
}
