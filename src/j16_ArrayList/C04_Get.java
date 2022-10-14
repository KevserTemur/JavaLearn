package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Get {
    public static void main(String[] args) {
        // get();   ---->
        // list te istenen elemanı return eder (arr[3]-> arr'ın 3. indexteki elemanı ver.
        ArrayList<String> listSehir= new ArrayList<>(List.of("münih", "losangales", "londra","zürih"));
        System.out.println(listSehir.get(1));
        System.out.println(listSehir.get(11)); // olmayan index elemanı RTE verir








    }
}
