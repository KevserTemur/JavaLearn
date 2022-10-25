package A_CodeForLife.odev_20ekim;

import java.util.Scanner;

public class ödev02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir tamsayi giriniz: ");
        int sayi = scan.nextInt();
        int sayac = 0;

        for(int i = 2; i < sayi; i++)
        {
            if(sayi % i == 0) {
                sayac++;
            }
        }
        if(sayac == 0) {
            System.out.println(sayi + " Asal bir sayidir.");
        }
        else {
            System.out.println(sayi + " Asal bir sayi degildir.");
        }
    }
}
