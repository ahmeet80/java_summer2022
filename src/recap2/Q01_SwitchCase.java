package recap2;

public class Q01_SwitchCase {
    /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri
    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri
    gun carsamba veya cumartesi ise:
    SQL dersi gunleri
    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/

    public static void main(String[] args) {

        String gun = "Cuma";

        switch (gun) {
            case "Pazartesi":
            case "Sali":
                System.out.println("java dersi");
                break;
            case "Carsamba":
            case "Cumartesi":
                System.out.println("Sql dersi");
                break;
            case "Pesembe" :
            case "Cuma" :
                System.out.println("Selenyum dersi");
                break;

            default:
    }
}
}