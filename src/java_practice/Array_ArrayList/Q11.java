package java_practice.Array_ArrayList;

import java.util.Arrays;

public class Q11 {
    public static void main(String[] args) {
        /*
    Verilen Stringi array e cevirerek unlu harflerin sayisini bulan prgram yazin
    String s= Apex,nesne yonelimli bir programlama dilidir"       */

        String s = "Apex,nesne yonelimli bir programlama dilidir";
        s = s.replace(",", "").replace(" ", "");
        System.out.println(s);

        String[] arr = s.split("");
        System.out.println(Arrays.toString(arr));

        String sesliHarfler[] = {"a", "e", "ı", "i", "o", "ö", "u", "ü"};
        System.out.println(Arrays.toString(sesliHarfler));

        int count =0;
        for (int i = 0; i < arr.length; i++) { //outer loop
            for (int j = 0; j < sesliHarfler.length; j++) {//inner loop
                if(arr[i].equalsIgnoreCase(sesliHarfler[j])){
                    //arr deki herhangi bir karakter, sesli harflerdeki bir karaktere buyuk kucuk harf farketmezksizin esitese
                    count++; //sesli harf saysisini 1 artir
                }
            }
        }
        System.out.println("count = " + count);
    }
}
