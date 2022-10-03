package j09_SwitchStatements;

import java.util.Scanner;

public class C02_SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("1 ile 12 arasında bir sayı giriniz : ");
        int ayNo = scan.nextInt();
        switch (ayNo) {
            case 1 : System.out.println(" OcaK yazdınız .");
                break;
            case 2 : System.out.println(" Şubat yazdınız .");
                break;
            case 3 : System.out.println(" Mart yazdınız .");
                break;
            case 4 : System.out.println(" Nisan yazdınız .");
                break;
            case 5 : System.out.println(" Mayıs yazdınız .");
                break;
            case 6 : System.out.println(" Haziran yazdınız .");
                break;
            case 7 : System.out.println(" Temmuz yazdınız .");
                break;
            case 8 : System.out.println(" Ağustos yazdınız .");
                break;
            case 9 : System.out.println(" Eylül yazdınız .");
                break;
            case 10 : System.out.println(" Ekim yazdınız .");
                break;
            case 11 : System.out.println(" Kasım yazdınız .");
                break;
            case 12 : System.out.println(" Aralık yazdınız .");
                break;
            default : System.out.println(" doğru sayı12 girmediniz");
                break;
        }

    }
}
