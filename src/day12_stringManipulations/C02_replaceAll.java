package day12_stringManipulations;

public class C02_replaceAll {

    public static void main(String[] args) {
        String str= "1Bu2gu3n J*ava- cok g3uz7el";

        // str'i Bu gun hava cok guzel haline getirin
        // replaceAll() deki all'un amacı ayni ozellikteki tum karakterleri kapsamasidir
        // butun ozel karakterleri sil
        // space'leri korumak icin en basta onlarin yerine cumlede bulunmayacak
        //bir string koyalim
        // "qazwsx"
        str=str.replace(" ","qazwsx");
        System.out.println(str);
        str=str.replaceAll("\\W","");
        System.out.println(str); // 1Bu2gu3nJavacokg3uzel

        str=str.replaceAll("\\d","");

        // istenmeyen ozel karakter ve sayilardan kurtulduk
        // simdi space'leri geri getirelim

        str=str.replace("qazwsx"," ");

        System.out.println(str);
    }
}
