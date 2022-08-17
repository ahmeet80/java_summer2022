package day07_ifStatements;

public class C03_ifStatements {

    public static void main(String[] args) {
        /*
        Bir if statement'da {} kullanilmazsa
        Java ilk satiri sart ile baglar, sonraki satirlar bagimsiz olur.
        Eger birden fazla satir ayni if sartina baglanmis ise mutlaka {} kullanmaliyiz


         */

        int sayi= 23;

        if(sayi>0)
            System.out.println("sayi pozitif");             // degere bagli
            System.out.println("sayi pozitif kalacaktir"); // her zaman calisir
            System.out.println("ucuncu satir");            // her zaman calisir


        if(sayi%2==0)
            System.out.println("sayi cift");             // degere bagli
            System.out.println("sayi cift kalacaktir"); // her   zaman   calisir


        if(sayi%5==0)
            System.out.println("sayi 5'in am kati");     //degere bagli

        }

    }

