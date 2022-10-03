package j08_ifStatement_TernaryOperators;

import java.util.Scanner;

public class C07_NestedTernaryOperator {
    public static void main(String[] args) {
/*
TASK :
 Girilen bir pozitif tamsayı pozitif tamsayı 4 basamaklı ise  "4 Basamaklı" print eden
 4 basamaklı degilse çift olup olmadigini kontrol edip. Çift ise "4 basamaklı olmayan çift sayı" yazdırın.
 Çift sayı degilse "4 basamaklı olmayan tek sayı yazdırın."
 */
        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int a =sc.nextInt();
        System.out.println(a> 999 && a< 10000 ? "4 basamaklı" : a % 2 == 0 ? "4 basamaklı olmayan çift sayı" : "4 basamaklı olmayan tek sayı ");



    }
}
