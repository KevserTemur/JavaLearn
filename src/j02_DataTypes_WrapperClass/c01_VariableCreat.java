package j02_DataTypes_WrapperClass;

import static java.lang.System.in;
import static java.lang.System.setOut;

public class c01_VariableCreat {
    public static void main(String[] args) {
        // 1. yol -> best practice (recomended) tavsiye edilen
        int yas=48;
        int maas=33000;
        System.out.println("yas"); //yas
        System.out.println(yas); // 48
        System.out.println(maas); //33000

        System.out.println("nur hanım başlangıç maas :"); // (maas); // nur hanım başlangış maaşı : 33000
        // 2. yol
        int boy ; // değeri atanmayan boy isminde bir int tanımlandı declaration
        // System.out.println(boy); // değeri atanmamış değişkeni hiçbit aksiyonda kullanılamaz CTE
        boy=175;
        System.out.println("boyunuz:" +boy); //175

        // 3.yol
        int yevmiye, age, kilo; // birden çok aynı tipte değişken tanımlandı
        age=33;
        yevmiye=1000;
        kilo=99; //tanımlana değişkenlere değer ataması yapıldı..
        int gunluk=1500, yil=2022, agirlik=99;
        // TRICK bir variable sadece bir kez tanımlanabilir ama birden çok değer atanabilir
        System.out.println(gunluk); // 1500
        gunluk=1800; // gunluk yeni değeri 1800 olarak atandı
        System.out.println("gunluk son değeri :" +gunluk); //1800
        System.out.println("gunluk değeri:"+gunluk+"yıl değeri: "+yil+" "+yas+yevmiye+agirlik);


    }



}
