package j12_lopps.Tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        // girilen iki sayı arasındaki çift sayıları yanyana print eden code creat ediniz


        Scanner scan = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz :");
        int sayi1 = scan.nextInt();

        System.out.println("ikinci sayıyı giriniz ");
        int sayi2 = scan.nextInt();

        for (int i = sayi1; i <= sayi2; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
    }

