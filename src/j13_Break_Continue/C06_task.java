package j13_Break_Continue;

import java.util.Scanner;

public class C06_task {
    public static void main(String[] args) {

        // girilen bir ifadedeki c karakterine kadar a sayısını print eden code creat ediniz
        Scanner scan = new Scanner (System.in);
        int a = 0;
        System.out.println("bir ifade giriniz : ");
        String str = scan.nextLine();
        for (int i = 0 ; i<=str.length()-1;i++) {
            if (str.charAt(i)=='c') break;
            if (str.charAt(i)=='a') a++;
            System.out.print(str.charAt(i));

        }System.out.println("  =>  a karakter sayısı = " + a);

    }
}
/*
 Scanner sc = new Scanner(System.in);
        System.out.println("AGAm bişeyler cızıkdırasan  :");
        String bişeyler = sc.nextLine();// egik Gabık @ cimey ıl. k om
        int aSayısı = 0;
        for (int i = 0; i < bişeyler.length(); i++) {
            if (bişeyler.charAt(i)=='a'){
                aSayısı++;
            }else if (bişeyler.charAt(i)=='c'){
                break;
            }
            System.out.println("döngüde işleme giren karakterler :"+bişeyler.charAt(i));
        }
        System.out.println("agam cızıktırdıgın bişeylerde a sayısı : "+aSayısı+" tane");
 */