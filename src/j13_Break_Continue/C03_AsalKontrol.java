package j13_Break_Continue;

import java.util.Scanner;

public class C03_AsalKontrol {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir tamsayı gir:");
        int sayi= scan.nextInt();

        boolean AsalMi=true;
        for (int i = 2; i < sayi; i++) {
            if (sayi%i==0){//eğer sayi kendisine kadar olan sayılara tam bölunuyorsa
                AsalMi=false;
                break;
            }
        }
        if (AsalMi){
            System.out.println("girilen sayı ASAL");
        }else System.out.println("girlen sayı asal DEGİL ");







    }
}
