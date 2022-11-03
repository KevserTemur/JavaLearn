package A_CodeForLife.Interview;

import java.util.Arrays;
import java.util.Collections;

public class Q05 {


    // 5 -->>  Write a return method that can find the frequency of characters
    // Ex :  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
    public static void main(String[] args) {

    }
    public static String unique(String str) {
        String uni = "";
        for (String w : str.split("")) {
            uni += Collections.frequency(Arrays.asList(str.split("")), w) > 0 ? (uni.contains(w) ? "" :
                    w + Collections.frequency(Arrays.asList(str.split("")), w)) : "";
        }
        return uni;
    }
}