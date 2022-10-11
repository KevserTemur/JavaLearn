package j14_Scope;

import java.util.Scanner;

public class T01_TopZıplamaMesafeSayısı {
    /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ilk yüksekliği gir:");
        double yukseklik= scan.nextDouble();
        double toplamMesafe =0;
        int carpmaSayisi=0;
        do {
            carpmaSayisi++;
            toplamMesafe+= yukseklik;
            yukseklik*= (3.0 /4);
            toplamMesafe+= yukseklik;
        } while (yukseklik>=1);
        System.out.println("çarpma sayısı:"+ carpmaSayisi);
        System.out.printf("toplam mesafe:" + toplamMesafe);

    }
}
