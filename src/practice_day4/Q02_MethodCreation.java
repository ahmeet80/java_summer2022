package practice_day4;

import java.util.Scanner;

public class Q02_MethodCreation {
      /*
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
      */
      public static void main(String[] args) {
          Scanner scan=new Scanner(System.in);
          System.out.print("metre ve km'ye donusturmek istediginiz cm degerini giriniz :");
          double santiMetereValue= scan.nextDouble();
          
          convertSM(santiMetereValue);
          
      }

    private static void convertSM(double santiMetereValue) {
        double meter = santiMetereValue/100;
        double kMeter = santiMetereValue/100000;
        System.out.println("girdiginiz santimetre degeri :" +santiMetereValue +" :" + meter + " m dir, " + kMeter + " km dir");

    }
}