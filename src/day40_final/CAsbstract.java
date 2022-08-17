package day40_final;

public abstract class CAsbstract {

    void toplama(){
        System.out.println("Bu method toplama yapar");
    }

    abstract void carpma();

    abstract void bolme();


    /*

    bir method'un basina abstract yazarak
    bu method'un child class'lar icin bir standart oldugunu declare ederiz
    ve method body'sine ihtiyac kalmaz

     */
}
