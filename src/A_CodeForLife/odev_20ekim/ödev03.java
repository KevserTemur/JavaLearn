package A_CodeForLife.odev_20ekim;

import java.util.Scanner;

public class ödev03 {
    public static void main(String[] args) {
        //  Bir integer list olusturunuz ve bu list'deki tüm sayilarin karesinin toplamini bulunuz. Sonucu ekrana yazdiriniz.
        //  (Scanner, while ve for each kullanınız.)

        Scanner scan = new Scanner(System.in);

        System.out.println("Liste icin sayi giriniz.");
        System.out.println("Sayi girisini bitirmek icin 'q' giriniz.");

        int toplam = 0;
        String islem = "";

        while (!islem.equalsIgnoreCase("q")) {
            System.out.println("Sayi giriniz : ");
            islem = scan.nextLine();

          //  list.add(islem);

        }
    }
}