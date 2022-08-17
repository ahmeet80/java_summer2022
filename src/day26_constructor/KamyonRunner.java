package day26_constructor;

public class KamyonRunner {
    public static void main(String[] args) {
        Kamyon kamyon1=new Kamyon();
        System.out.println("kamyon1 ozellikleri " + kamyon1.toString());

        Kamyon kamyon2=new Kamyon("Mercedes","4140",2005,500000);
        System.out.println("Kamyon2 bigileri " + kamyon2);

        Kamyon kamyon3=new Kamyon("Man","TGX",2021,400000);
        System.out.println("Kamyon3 bigileri " + kamyon3);

        Kamyon kamyon4=new Kamyon("Scania","s540");
        System.out.println("Kamyon4 bigileri " + kamyon4);

    }
}
