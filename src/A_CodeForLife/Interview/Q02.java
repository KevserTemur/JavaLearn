package A_CodeForLife.Interview;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Q02 {
    /*
    2 -->> Write a return method that can remove the duplicated values from string
Ex : removeDup("AAABBBCCC") ==> ABC
     */


    public static void main(String[] args) {

        String str = "AAABBBCCC";
        System.out.println(removeDup(str));
        System.out.println(removeDup1(str));


    } // main dışı

    public static String removeDup(String str) {
        String result = ""; // boş string açtık

        // for (int i = 0; i < str.length(); i++) {
        //     if (!result.contains(str.charAt(i)));
        //     result += str.charAt(i);
        // }


        while (str.length() > 0) { // String boyunca devam etsin
            if (!result.contains(str.substring(0, 1))) { // resultta stringin birinci elemanı var mı yok mu
                result += str.substring(0, 1); // yoksa ekle
                str = str.replaceAll(str.substring(0, 1), ""); // ve olan her elemanı hiçlikle değiştir yani sil
            }
        }

        return result;
    } // method sonu

    public static String removeDup1(String str) {

        String sade ="";
        for (int i = 0; i < str.length(); i++) {
            sade+= str.substring(i+1).contains(String.valueOf(str.charAt(i)))? "" : String.valueOf(str.charAt(i));
        }
        return sade;
    }
}

    // LinkedHashSet ile de yapılabiliyormuş. 21, dakika "collaction"