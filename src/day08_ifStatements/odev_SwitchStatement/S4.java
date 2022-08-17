package day08_ifStatements.odev_SwitchStatement;

public class S4 {
    public static void main(String[] args) {
        char degisken = 'D';   // S D E T kisaltasindan birini giriniz:

        switch (degisken) {
            case 'S':
                System.out.println("SoftWare");
                break;
            case 'D':
                System.out.println("Developer");
                break;
            case 'E':
                System.out.println("Engineer");
                break;
            case 'T':
                System.out.println("In Testing");
                break;
            default:
                System.out.println("S D E T kisaltasindan birini giriniz");

        }
    }
}
