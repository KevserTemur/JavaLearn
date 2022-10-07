package j12_lopps.L02_WhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {
/*
girilen tamsayıyı tam bölen sayısını priny  eden code create edin
20-> 1,2,4,5,10,20 -- 6 tane tam böleni var
 */

        Scanner sc = new Scanner(System.in);
        System.out.println("AGAM nassıng :) bir tamsayı giriyorsun : ");
        int sayi = sc.nextInt();
        int bolenSayi=1;
        int tamBolenAdedi=0;
        while (bolenSayi<=sayi){
            if (sayi%bolenSayi==0){//sayi bolenSayıya tam bölünme şartı
                tamBolenAdedi++;
            }
            bolenSayi++;//lopp sonsuza düşmemesi için ve diğer sayılarun böldüğü kontrol edilmesi için yazıldı
        }
        System.out.println("agam girdiğin "+sayi+" nın "+tamBolenAdedi+" kadar tam boleni var :)");

    }
}








