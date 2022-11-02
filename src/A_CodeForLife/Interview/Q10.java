package A_CodeForLife.Interview;

import java.util.Arrays;


public class Q10 {

    //  10  -->>  Write a return method that can sort an int array in descending order
    //  without using the sort method of the Arrays class
    //  Ex : int [] arr = {10,20,7,8,90};
    //  arr = sort (arr); ==>  {90,20,10,8,7};

    public static void main(String[] args) {

        int[] arr = {10, 20, 7, 8, 90};
        System.out.println(Arrays.toString(sort(arr)));


    }// main sonu

    public static int[] sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) { // outer loop
            for (int j = i + 1; j < arr.length; j++) { //ilk for loop un indeksi ne ise inner loop da bir sonrakinden devam edecek o sebeple i+1
                if (arr[i] < arr[j]) { // ilki ikinciden küçükse yer değiştirmesi lazım. o sebeple swap yapcaz
                    int temp = arr[j]; // temp yapcaz. yer değiştirdiğimiz için
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    }
