package A_Projects.AutomationMac;

import java.util.Scanner;

public class Options {


    /*
    1) Kullanıcı ürünleri göstermeliyiz. ---->> ürün clasında bir obje toString()
    2) Scanner ---->>  Scanner classından bir obje create ediniz.[productNum a set edilmeli. setProductNum()]
    3) Loop ---->>  Do-While loop ---->> kullanıcı 1-7 rakamları arasında bir seçim yapmalı
        ve eğer girmiş olduğu rakam 1 den küçük veya 7 den büyük ise döngü devam etmeli
        ve kullanıcı 1-7 arfasında bir seçim yapmaya force edilmeli
    4) 0 a basarak ta menüden çıkabilmeli
    5) kullanıcıdan productNum (1-7 arasında rakam {kullanıcı 1 seçerse kraker, 2 seçerse cips...etc})
        -->> Switch-case yapısı kurmalıyız.
    6) switch benden ProductNum ve alınan bu ProductNum a göre ilgili ürünün price ı alınmalı getKraker(), getCips()...
    (price set edebilmek için ben price ın setPrice() methodunu kullanmalıyım..)
    7) return olarak bana price dönmeli. return getPrice() (double)

     */


    public double select(Urun urun){
        System.out.println(urun.toString());
        Scanner scanner =new Scanner(System.in);

        do {
            System.out.println("lütfen 1 ile 7 arasında bir rakam girerek almak istediğiniz ürünü seçiniz...");
            System.out.println("çıkış için '0' ");
            urun.setProductNum(scanner.nextInt());
            if (urun.getProductNum()<0 || urun.getProductNum()>7) {
                System.out.println("lütfen belirtilen aralıkta bir rakam giriniz...");
            }
        } while (urun.getProductNum()<0 || urun.getProductNum()>7);

        switch (urun.getProductNum()) {

            case 0:
                System.out.println("yine bekleriz...");
                break;
            case 1:
                urun.setPrice(urun.getKraker());
                break;
            case 2:
                urun.setPrice(urun.getCips());
                break;
            case 3:
                urun.setPrice(urun.getCocaCola());
                break;
            case 4:
                urun.setPrice(urun.getFanta());
                break;
            case 5:
                urun.setPrice(urun.getSu());
                break;
            case 6:
                urun.setPrice(urun.getCay());
                break;
            case 7:
                urun.setPrice(urun.getFiltreKahve());
                break;
        }
        return urun.getPrice();
    }
}
