package day08_ifStatements.odev_SwitchStatement;

public class S3 {
    public static void main(String[] args) {

        int sayi = 100;  // 10 100 1000 sayilarindan birini giriniz

        switch (sayi) {
            case 10:
                System.out.println("İki basamakli en kucuk sayi");
                break;
            case 100:
                System.out.println("Uc basamakli en kucuk sayi");
                break;
            case 1000:
                System.out.println("Dort basamakli en kucuk sayi");
                break;
            default:
                System.out.println("Girilen sayiyi drgistir");
        }
    }
}
