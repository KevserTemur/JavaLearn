package j15_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        // Array elemanı kontrol etme
        int arr[]={67,97,20,6343,34,54,24,16,7,55,17};

        int sayi=34;
        boolean flag=false; // bayrak (bayrak kaldırma. varsa kalkar. yoksa iner. true, false)
        for (int i = 0; i <arr.length; i++ ) {
            if (arr[i]==sayi){
                flag=true;
            }
        }
        if (flag){
    System.out.println("aradığınız sayı array de VAR");
    } else{
            System.out.println("aradığınız sayı array de YOK");
        }

        Arrays.sort(arr); // array elemanları sıralandı
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr, 34)); // 5 method aranan elemanı arrayda arayıp index return eder
        System.out.println(Arrays.binarySearch(arr, 16));//1 binarySearch(arr,34); -> method aranan elemanı arrayda arayıp index return eder
        System.out.println(Arrays.binarySearch(arr, 21));//-5 binarySearch(arr,34); -> method aranan elemanı arrayda arayıp index return eder
        // TRİCK -->> binarySearch () methodu arrayde olmayan elemanı çalışırsa sonuç olarak
        // eğer bu eleman olsaydı kaçıncı sırada olurdu cevabuını verir. - ile verir
        System.out.println(Arrays.binarySearch(arr, 99));//-13 binarySearch(arr,34); -> method aranan elemanı arrayda arayıp index return eder


    }
}
