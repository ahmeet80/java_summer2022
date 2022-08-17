package day08_ifStatements.odev_SwitchStatement;

public class S5 {
    public static void main(String[] args) {

        String gun = "Sali";  // gun ismi al haftasonu mu ici mi yazdir
        gun = gun.toLowerCase();

        switch (gun) {
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("Hafta ici");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Gecerli bir gun giriniz");
        }
    }
}