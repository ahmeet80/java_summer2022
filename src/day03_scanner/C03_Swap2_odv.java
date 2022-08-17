package day03_scanner;

public class C03_Swap2_odv {
    public static void main(String[] args) {

        int sayi1 = 15;
        int sayi2 = 30;

        System.out.println("swaptan once  sayi1 : " + sayi1 + "     sayi2 : " + sayi2);

        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;

        System.out.println("swaptan sonra sayi1 : " + sayi1 + "    sayi2 : " + sayi2);
    }
}
