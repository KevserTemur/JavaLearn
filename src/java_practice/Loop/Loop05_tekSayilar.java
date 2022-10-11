package java_practice.Loop;

import java.util.Scanner;

public class Loop05_tekSayilar {
    /*
    Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
    girilen sayı dahil(tek ise), tek olanlarin adet yazdiralim
   */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("bir tamsayı gir:");
        int sayi = scan.nextInt();

        int count = 0;//sayac tek olan sayilari sayan degisken
        while(sayi>0){
            if(sayi%2==1){
                System.out.print(sayi + " ");
                count++;
            }
            sayi--;
        }
        System.out.println();
        System.out.println("count = " + count);
    }
}
