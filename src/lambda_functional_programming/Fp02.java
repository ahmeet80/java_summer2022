package lambda_functional_programming;

import java.util.ArrayList;
import java.util.List;

public class Fp02 {

    /*
    1) t->t "Logic" , (t,u)-> "Logic"
        Bu yapiya "Lambda Expression"
    2) Functional Programming kapsaminda "Lambda Expression" kullanilabilir ama onerilmez.
        "Lambda Expression" yerine "Method Referance" tercih edilir.
    3) "Method Referance" kullanimi "Class Name :: "Method Name"

        Ayni zamanda kendi class'larimizi da kullanabilriz.
        Ornegin bir Animal class'imiz var ve bu calss "eat()" methoduna sahip ==> "Animal :: eat"
     */
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);

        System.out.println(liste);

        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();
        tekeElemanlarinKareleriniYazdir(liste);
        System.out.println();
        tekarsizTekElemanlarinKupunuYazdir(liste);



    }

    //1) Ardışık list elemanlarını aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional ve method reference)
    public static void listElemanlariniYazdirFunctional(List<Integer> list){

        list.stream().forEach(Utils::ayniSatirdaBosluklaYazdir); //  Functional Programming ile yapildi
                                                                 //  Functional Programming'de nasil yapildigina degil ne yapildigina odakalanilir
    }

    //2)Ardışık çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void ciftElemanlariYazdirFunctional(List<Integer> list){
        list.stream().filter(Utils::ciftElemaniSec).forEach(Utils::ayniSatirdaBosluklaYazdir); // Alert !!!
    }
    //3) Ardışık tek list elemanlarının karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void tekeElemanlarinKareleriniYazdir(List<Integer> list){
        list.stream().filter(Utils::tekElemaniSec).map(Utils::karesiniAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //4) Ardışık tek list elemanlarının küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.
    public static void tekarsizTekElemanlarinKupunuYazdir(List<Integer> liste){
        liste.stream().filter(Utils::tekElemaniSec).map(Utils::kupunuAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }
}
