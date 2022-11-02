package A_CodeForLife.Interview;

import java.util.Arrays;
import java.util.Scanner;

public class Q11 {
//  11   -->>  Write a function that, given an integer N (1 < N < 100),
//  returns an array containing N unique integers that sum up to 0,
//  The function can return any such array. Ex : given N = 4,
//  The function could return [1,0,-3,2] or [-2,1,-4,5].
//  The answer [1,-1,1,3] would be incorrect (because value 1 occurs twice).
//  For N = 3 one of the possible answers is [-1,0,1]
//          (but there are many more correct answers).
//          5
//          -2 -1 0 1 2
//          4
//          -2 -1 1 2

    public static void main(String[] args) {

        int num =12;
        int [] arr = unique(num);
        System.out.println(Arrays.toString(arr));


    }

    public static int [] unique(int num) {

    int [] arr = new int [num];

    if (num%2 == 1) // tek sayı ise araya 0
        arr[num/2] =0;

        for (int i = 0; i < num/2; i++) { // çift ise 0 yok
            arr[i] = -(i+1);
            arr[num-1-i] = i+1;
        }
        return arr;
    }
}
