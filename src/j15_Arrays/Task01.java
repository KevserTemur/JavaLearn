package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //TASK kullanıcıdan alınan değerlerle bir int array elemanlarını büyükten küçüğe print eden code

        Scanner scan = new Scanner(System.in);
        System.out.print("array uzunluğunu gir");
        int arrBoyut = scan.nextInt();

        int arr[] = new int[arrBoyut];//boyutu belirlenmiş boş int array
        for (int i = 0; i < arrBoyut; i++) {
            System.out.print(i + ". index  elemanı giriniz : ");
            arr[i] = scan.nextInt();
        }
        System.out.println("agam istedgin array : " + Arrays.toString(arr));



        Arrays.sort(arr);//arr k->b sortingen yapıldı..
        for (int i = arr.length-1 /*-> en buyuk sondaki elemandan döngü başlar*/ ;i>=0; i--) {
            System.out.print(arr[i] + " ");
        }





    }
}
