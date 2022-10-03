package j08_ifStatement_TernaryOperators;

import java.util.Scanner;

public class C06_NestedTernaryOperator {
    public static void main(String[] args) {
         /*
 TASK :
Kullanicidan bir sayi aliniz
Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
 */
        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int a =sc.nextInt();
        System.out.println(a >= 0 ? (a<10 ? "rakam" : "pozitif sayi") : "Negatif Sayi");




    }

}
