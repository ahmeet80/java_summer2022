package day03_scanner;


import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        // kullanicidan ismini isteyin
        // girilen ismi
        // isminiz : Ahmet   seklinde yazdirin

        // insanlarin dunyasindan kod'larimizin bulundugu class'a deger almak icin
        // Scanner class'ini kullaniriz

        //1- Scanner objesini olusturalim
        Scanner scan =new Scanner(System.in);

        // 2- Kullanicidan ne istedigimizi soleyelim
        System.out.println("Lutfen isminizi giriniz");

        // 3- olusturdugumuz scan objesi ile kullanicinin girdigi degeri alip
        //    olusturacagimiz uygun bir variable'a atayalim

        String kullaniciIsimi=scan.next();

        System.out.println("isminiz: "+kullaniciIsimi);
    }
}
