package manav_proje;

import java.util.Scanner;

public class manavRunner {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("        No   Urun    Fiyat\n" +
                "        ===== ======= ========\n" +
                "        00 Domates 2.10 TL ,\n" +
                "        01 Patates 3.20 TL ,\n" +
                "        02 Biber 1.50 TL ,\n" +
                "        03 Sogan 2.30 TL  ,\n" +
                "        04 Havuc 3.10 TL\n" +
                "        05 Elma 1.20 TL\n" +
                "        06 Muz 1.90 TL\n" +
                "        07 Cilek 6.10 TL\n" +
                "        08 Kavun 4.30 TL\n" +
                "        09 Uzum 2.70 TL\n" +
                "        10 Limon 0.50 TL");


       urunSec();

        manav sepet=new manav();

        System.out.print("Almak istediginiz urunu sira numarasiyla seciniz :");
        int urunNo = scan.nextInt();
        System.out.print("Kac kilo almak istersiniz :");
        double kilo = scan.nextDouble();
        sepet.sepetUrun.add(sepet.urunList[urunNo]); // urun sepetine urunu ekledik
        sepet.sepetFiyat.add(sepet.urunFiyat[urunNo]*kilo); // fiyat sepetine urun*kg'i ekledik
        System.out.println(kilo + " kg " + sepet.sepetUrun.get(urunNo)+ " " + sepet.sepetFiyat.get(urunNo) + " TL" );



    }

    public static void urunSec() {





    }


}