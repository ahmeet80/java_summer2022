package day31_timeFormatter_varargs;

public class C03_VarargsIleToplama { //varargs : variable number of arguments
    public static void main(String[] args) {
        // verilen kac int olursa olsun
        // hepsini toplayip sonucu yazdiran bir method olusturun

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;
        int sayi5=50;


        toplaYzdir(sayi1, sayi2, sayi3, sayi4, sayi5);
        toplaYzdir(sayi1, sayi2, sayi3, sayi4);
        toplaYzdir(sayi1, sayi2, sayi3);
        toplaYzdir(sayi1, sayi2);
    }

    public static void toplaYzdir(int... sayi) {
        /*
        int... sayi bu goterim integer variable'lardan olusan bir varargs demektir
        varargs array alt yapisini kullanir

         */

        int toplam=0;
        int sayiAdedi=sayi.length;
        for (int each: sayi) {
            toplam+=each;
        }
        System.out.println("Girilen " + sayiAdedi+" adet sayinin toplami : "+toplam);
    }
}
