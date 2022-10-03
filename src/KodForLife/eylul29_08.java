package KodForLife;

public class eylul29_08 {
    public static void main(String[] args) {


 /*    8- 		Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
                   isim-soyisim : M***** B*******
                   kart no : **** **** **** 1234
            */

        String ad = "kevser";
        String soyad = "temür";
        String kartNo = "1234567890123456";

        String yeniAd = ad.charAt(0) + ad.substring(1).replaceAll("\\w", "*");
        String yeniSoyad = soyad.charAt(0) + soyad.substring(1).replaceAll("\\w", "*");
        String yeniKartNo = "**** **** **** ****" + kartNo.substring(12);

        System.out.println("Ad-Soyad :"+yeniAd+" "+yeniSoyad+ " kart no : "+yeniKartNo);


    }
}
