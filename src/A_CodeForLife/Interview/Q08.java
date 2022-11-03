package A_CodeForLife.Interview;

public class Q08 {

    // 8  -->>  Write a return method that can minimum number from an int Array

    public static void main(String[] args) {

        int [] arr = {52,36,98,13};
        minValue(arr);

    }// main sonu
    public static void minValue (int [] arr){
        int min = Integer.MIN_VALUE;
        for (int each: arr) {
            if (each > min);
            min=each;
        }
        System.out.println(min);
    }



}
