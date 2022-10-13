package j15_Arrays;

import java.util.Arrays;

public class Tasks_ödev2 {
    public static void main(String[] args) {

        /*
    Verilen bir int dizisi icin elemanlarin karelerini print eden code create ediniz.)
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
    */

        int arr[] = {2, 6, 4, 5, 8, 9};

        System.out.println("sayılar : "+ Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i]*=arr[i];
        }
        System.out.println("kareleri : "+Arrays.toString(arr));


    /*
     Kullanicidan aldigimiz 8 elemanli arrayin icinde 3 e bolunebilen sayi adedini
     print eden java code create ediniz
         (negatif sayilar da dahil olsun)
     */





    }
}
