package day12_stringManipulations;

public class C01_replace {

    public static void main(String[] args) {
        String str=(" Bu gun ha va cok guz el ");
        System.out.println(str.replace(" " , ""));

        // hava kelimesini java yapalim
        System.out.println(str.replace("h" , "j"));

        //guz el yerine harika yazdiralim
        System.out.println(str.replace("guz el" , "harika"));

        //cumleyi replace kullanarak Bu gun java cok guzel yapalim

        str= str.replace("Bu gun" , "bugun")
                .replace("Bu gun" , "java")
                .replace("guz el" , "guzel");

        System.out.println(str);

    }
}
