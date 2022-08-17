package recap01;

import java.util.Scanner;

public class Q10_NestedTernary {

    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

    public static void main(String[] args) {
        char finalNotu = 'A';
        
        String result = finalNotu=='A' ? "Gayet Basrili" : finalNotu=='B' ? "Basarili" : finalNotu=='C' ? "H gayret" : "Digerleri";
        System.out.println("result = " + result);;
    }

}