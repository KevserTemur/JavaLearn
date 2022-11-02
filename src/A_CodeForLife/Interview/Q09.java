package A_CodeForLife.Interview;

import java.util.ArrayList;
import java.util.Arrays;

public class Q09 {

  // 9  -->>  Write a return method that can sort an int array in Ascending
  // order without using the sort method of the Arrays class
  // Arrays sınıfının sıralama yöntemini kullanmadan bir int dizisini Artan düzende sıralayabilen bir dönüş yöntemi yazın
  // Ex : int[] arr = {10,9,8,7};
  // arr = Sort(arr); ==> {7,8,9,10};

    public static void main(String[] args) {
        int [] arr = {10,9,8,7};
        System.out.println(Arrays.toString(sort(arr)));
        sortAscending(arr);
        System.out.println(Arrays.toString(sort3(arr)));

    } // main sonu
public static int [] sort(int[] arr){

    for (int i = 0; i < arr.length; i++) { // outer loop
        for (int j = i+1; j < arr.length ; j++) { //ilk for loop un indeksi ne ise inner loop da bir sonrakinden devam edecek o sebeple i+1
            if (arr[i] > arr [j] ){ // ilki ikinciden büyükse yer değiştirmesi lazım. o sebeple swap yapcaz
                int temp = arr [j]; // temp yapcaz. yer değiştirdiğimiz için
                arr [j] = arr [i];
                arr [i] = temp;
            }
        }

    }
        return arr;
    }
    // ArrayList method
    public static int[] sortAscending(int[] arr){

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int each:arr)
            list.add(each);

        for (int i =0; i< arr.length; i++){
            arr[i] = findMin(list);
            list.remove(Integer.valueOf(arr[i]));
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
    // minimum value of a list
    private static int findMin(ArrayList<Integer> a) {
        int min =Integer.MAX_VALUE;
        for (int each: a)
            min = Math.min(min, each);
        return min;

        }
        // Arrays sort method
        public static int [] sort3(int[]arr) {
        Arrays.sort(arr);
        return arr;
        }
    }


