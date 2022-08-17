package day07_ifStatements.odev;
                                // sunu 04 If statements sayfa 3
import java.util.Scanner;

public class S1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi = scan.nextInt();
        if(sayi%2==0){
            System.out.println("Girilen sayi cifttir");
        } else System.out.println("Girilen sayi tektir");

    }
}
