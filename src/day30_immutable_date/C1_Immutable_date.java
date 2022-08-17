package day30_immutable_date;

import java.util.ArrayList;
import java.util.List;

public class C1_Immutable_date {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();

        list.add("Kenan");
        list.add("Enes");
        list.add("Ismail");
        System.out.println(list); // [Kenan, Enes, Ismail]

        list.add("Yasemin");
        System.out.println(list); // [Kenan, Enes, Ismail, Yasemin]

        list.remove("Ismail");
        System.out.println(list); // [Kenan, Enes, Yasemin]
    }
}
