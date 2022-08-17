package lambda_functional_programming;

import java.util.ArrayList;
import java.util.List;

public class Fp01 {
    /*
     - Functional programming Arrays ve Collections ile kullanilir.

     1) Lambda (functional programming)java 8 ile kullanilmaya baslanmistir,
     2) Functional Programming'de ne yapilacak (What to do) üzerine yogunlasilir.
        Structured Programming "Nasil yapilacak" (How to do) uzerine yogunlasir
     3) Functional Programming Arrays ve Colllections ile kullanilir,
     4) "entrySet() metodu ile Map, Set'e donusturulerek Functional Programming'de kullanilabilir.

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

        listElemanlariniYazdirStructured(liste);
        System.out.println();
        listElemanlariniYazdirStructured(liste);
        System.out.println();
        ciftElemanlariYazdirStructured(liste);
        System.out.println("Functional :");
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();
        tekeElemanlarinKareleriniYazdirFunctional(liste);
        System.out.println();
        terarsirTekElemanlarinKupunuYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami(liste);




    }
    //1) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)

    public static void listElemanlariniYazdirStructured(List<Integer> list){

        for(Integer w : list){

            System.out.print(w+" ");
        }

    }

    //1) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void listElemanlariniYazdirFunctional(List<Integer> list){

        list.stream().forEach(t-> System.out.print(t+" ")); // t-> lambda exprission
        // stream() metodu collection'dan elementleri akisas dahil etmek icin kullanilir
    }

    //2)Cift sayi olan list elemanlarini  aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)
    public static void ciftElemanlariYazdirStructured(List<Integer> list){

        for(Integer w:list){
            if(w%2==0){
                System.out.print(w+" ");
            }
        }

    }

    //2)Cift sayi olan list elemanlarini  aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void ciftElemanlariYazdirFunctional(List<Integer> list){
        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" ")); // filter'da t%2==0 sartini saglayanlari
                                                                              // filtreleyip seciyor

    }

    //3) Ardışık tek list elemenlerinin karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void tekeElemanlarinKareleriniYazdirFunctional(List<Integer> list){

        list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" ")); // map deger degistiriyor (gecici olarak)
        // elemanlarin degerleri degisecekse map() metodu kullanilir
    }

    //4) Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void terarsirTekElemanlarinKupunuYazdir(List<Integer> list){
        list.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));// distinct() tekrarlanan elemanlari alma
    }

    //5) Tekrarsız çift elementlerin karelerinin toplamını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer> list){
        Integer toplam = list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u); // reduce(0,(t,u)->t+u) baslangic degerini
                                                                                                      // 0'dan baslatip t+=u tarzi bir indirgeme islemi yapma
        System.out.println(toplam);

    }

}
