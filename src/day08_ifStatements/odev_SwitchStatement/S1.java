package day08_ifStatements.odev_SwitchStatement;

import java.util.Locale;

public class S1 {
    public static void main(String[] args) {
         int gun=7;  // haftanin gun numaralarini giriniz

         switch(gun){
             case 1 :
                 System.out.println("Pazartesi");
                 break;
             case 2:
                 System.out.println("Sali");
                 break;
             case 3:
                 System.out.println("Carsamba");
                 break;
             case 4:
                 System.out.println("Persembe");
                 break;
             case 5:
                 System.out.println("Cuma");
                 break;
             case 6:
                 System.out.println("Cumartesi");
                 break;
             case 7:
                 System.out.println("Pazar");
                 break;
             default :
                 System.out.println("1-7 Arasinda bir gun ismi girmelisiniz");
         }
    }
}
