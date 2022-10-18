package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Tasks_ödev {
    public static void main(String[] args) {
        /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir soldaki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */

        int[] arr = {1, 2, 3};
        int yeriarr[] = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            int b = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = b;
        }
        System.out.println(Arrays.toString(arr));

      //[1,2,3]
      //[2,3,3]


        // Task-> girilen int değeri tersten print eden code create ediniz.

        Scanner scan = new Scanner(System.in);
         int Arr[]=new int[0];
        int[] tersArr =new int [Arr.length];
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(i+ ". indeksi gir: ");
            Arr[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for (int i=Arr.length-1; i>=0; i--){
            System.out.print(Arr[i]+" ");}





        // Task-> verilen bir int arrayi elemanlrını buyukten kucuge siralayip return eden METHOD create ediniz

        int array[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};
        Arrays.sort(array);
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println("array : " + Arrays.toString(array));
        }


        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.

        Scanner sc = new Scanner(System.in);
        int sayi1[] = new int[7];
        for (int i = 0; i <= sayi1.length - 1; i++) {
            System.out.print(i + ".sayıyı gir: ");
            sayi1[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(sayi1));
        for (int i = 0; i <= sayi1.length - 1; i++) {
            if (sayi1[i] % 2 != 0) {
                System.out.print(sayi1[i] + " ");
                System.out.println(" ");
            }
        }
        // Task -> Kullanıcıdan alacağınız 5 adet sayıyı , girişi sırasına göre tersten print eden code create ediniz

        Scanner scanner = new Scanner(System.in);
        int array1[] = new int[5];
        System.out.print("5 tane tamsayı gir: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(i+".index gir : ");
            array1[i] = sc.nextInt();
        }
        System.out.println("ilk array: "+ Arrays.toString(array1));
        for (int i = array.length-1; i < 0; i--) {
            System.out.println(array1[i] +" ");
            System.out.println("**************");

        }


        //bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
        //        input : 1,2,-3,4,-5,-6
        //        output :-1,-2,3,-4,5,6

    int arr1 []= {1,2,-3,4,-5,-6};
        sayınınTersi(arr);

    }

    private static void sayınınTersi(int[] arr) {
        for (int a:arr) {
            a*=-1;
            System.out.println(a+ " ");
        }
    }
}
