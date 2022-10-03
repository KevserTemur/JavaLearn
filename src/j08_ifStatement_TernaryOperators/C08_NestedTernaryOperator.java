package j08_ifStatement_TernaryOperators;

import java.util.Scanner;

public class C08_NestedTernaryOperator {
    public static void main(String[] args) {
/*
 Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. Eğer urun miktarı 100 den fazla ise
       %33  indirim yapıp  ödemesi gereken toplam miktarı print eden code create ediniz.
 */
        Scanner sc = new Scanner(System.in);
        System.out.println("ürün miktarı giriniz");
        int urunMiktari=sc.nextInt();
        System.out.println("ürün fiyatı giriniz");
        int urunFiyati = sc.nextInt();
        double fatura=  urunMiktari>100 ? (urunMiktari*urunFiyati*0.67):urunMiktari*urunFiyati;
        System.out.println("fatura = " + fatura);








    }
}
