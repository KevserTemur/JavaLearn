package j15_Arrays;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Kaç elemanlı array istiyorsun : ");

        int arrBoyut=scan.nextInt();
        int sayiArr []=new int[arrBoyut];

        for (int i = 0; i < arrBoyut; i++) {
            System.out.print(i + ". index elemanı gir : ");
            sayiArr[i]=scan.nextInt();
        }
        int toplam=0;
        for (int i = 0; i < arrBoyut; i++) {
            toplam+=sayiArr[i];
        }
        System.out.println("toplam : " + toplam);

    /*
    System.out.println("agam istedgin array : " + Arrays.toString(arr));
        int arrToplam = 0;//local var.

        for (int i = 0; i < arr.length; i++) {
            arrToplam += arr[i];
        }
        System.out.println("array eleman toplamları : "+arrToplam);
    */

        }
    }

