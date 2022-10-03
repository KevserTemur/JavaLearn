package j09_SwitchStatements;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {
/*
Switch Case deyimi islev bakimindan if deyimine çok benzemektedir.
Çok sayida if islem bloklari kullandigimizda programin okunurlugu azalacak ve
programi izlemek zorlasacaktir. Programimizin bir degerini bir çok degerle
 karsilastirmak gerektiginde switch komutunu kullanacagiz. Switch seçenegi
 ile degiskenin durumuna göre bir çok durum içersinden bir tanesi gerçeklestirilir.
 Istersek de if deyimi ile switch case'' yi birlikte kullanabiliriz.
  Switch in yaptigi is kisaca, ifadenin degerini sirayla sabitlerle karsilastirarak ve her satiri islemektir.
  çok sayıda koşul içeren durumlarda switch kullanmak if'e göre programınızın daha hızlı çalışmasını sağlıyor.
  Bunun haricinde iki koşul ifadesi arasında dikkate değer bir performans farklılığı bulunmuyor.

 ahan da TRICK-> Switch Statement'de long,double,float ve boolean asla KULLANILMAZZZ.. CISSS
 */

        Scanner scan = new Scanner (System.in);
        System.out.println("Bir rakam giriniz : ");
        int a = scan.nextInt();
        switch (a) {
            case 0 : System.out.println(" 0 yazdınız .");
            break;
            case 1 : System.out.println(" 1 yazdınız .");
            break;
            case 2 : System.out.println(" 2 yazdınız .");
            break;
            case 3 : System.out.println(" 3 yazdınız .");
            break;
            case 4 : System.out.println(" 4 yazdınız .");
            break;
            case 5 : System.out.println(" 5 yazdınız .");
            break;
            case 6 : System.out.println(" 6 yazdınız .");
            break;
            case 7 : System.out.println(" 7 yazdınız .");
            break;
            case 8 : System.out.println(" 8 yazdınız .");
            break;
            case 9 : System.out.println(" 9 yazdınız .");
            break;
            default : System.out.println(" rakam girmediniz");
            break;
        }









    }
}
