package j23_Varargs_StringBuilder.varargs;

import java.util.Random;

public class Task02_G {
    private static Random sc;

    public static void main(String[] args) {

System.out.println("Lütfen bir sayı giriniz");
    int sayi1=sc.nextInt();
        System.out.println("Kaç tane daha sayı yazmak istersiniz");

        System.out.println("toplaCarp()*sayi1 = " + toplaCarp() * sayi1);
}

public static int toplaCarp(int []... b) {

    int sayiArr[] = new int[sc.nextInt()];
    for (int i = 0; i < sayiArr.length; i++) {
        System.out.println("Sayı giriniz");
        sayiArr[i] = sc.nextInt();
    }
    int toplam = 0;
    int carpım = 1;
    for (int w : sayiArr) {
        toplam += w;
    }
    return toplam;


}
}
