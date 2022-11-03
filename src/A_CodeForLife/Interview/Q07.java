package A_CodeForLife.Interview;

public class Q07 {


   //  7  -->>  Write a return method that can the maximum number from an int Array

    public static void main(String[] args) {

        int [] arr = {52,36,98,13};
        maxValue(arr);

    }// main sonu
    public static void maxValue (int [] arr){
        int max = Integer.MAX_VALUE;
        for (int each: arr) {
            if (each < max);
            max=each;
        }
        System.out.println(max);
    }


}
