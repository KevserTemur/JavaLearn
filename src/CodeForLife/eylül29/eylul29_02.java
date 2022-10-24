package CodeForLife.eylül29;

import java.util.Scanner;
public class eylul29_02 {
    public static void main(String[] args) {
          /* 2-    Kullanicidan tek seferde alacaginiz 2 kelimelik ad soyadi 2 ayri kelimeye ayiriniz,
                ad ayri soyad ayri sekilde ekrana yazdiriniz.
        */


        Scanner scan = new Scanner(System.in);
        System.out.println("ad soyad giriniz: ");
        String adSoyad = scan.nextLine().trim();
        System.out.println("Ad: "+ adSoyad.substring(0, Integer.parseInt(adSoyad.indexOf(' ')+"\n Soyad: "+ adSoyad.substring(adSoyad.indexOf(' ')+ 1))));







    }
}
