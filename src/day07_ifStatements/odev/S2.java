package day07_ifStatements.odev;

import java.util.Scanner;

public class S2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun isminin bas harfini giriniz");
        String  ilkHarf = scan.next().toUpperCase();
        if(ilkHarf.equals("P")){
            System.out.println("Pazar, Pazartesi, veya Persembe");
        }else if(ilkHarf.equals("S")){
            System.out.println("Sali");
        } else if (ilkHarf.equals("C")) {
            System.out.println("Carsamba, Cuma veya Cumartesi");
        } else System.out.println("Lutfen gecerli bir gun icin bas harf giriniz!!!");
        }
    }

