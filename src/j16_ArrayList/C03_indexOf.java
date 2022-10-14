package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {
        ArrayList<String> listUlke= new ArrayList<>(List.of("almanya", "amerika", "ingiltere","işviçre"));
        ArrayList<String> listSehir= new ArrayList<>(List.of("münih", "losangales", "londra","zürih"));

        System.out.println(listSehir.indexOf("londra"));
        System.out.println(listSehir.indexOf("ankara"));
        System.out.println(listSehir.indexOf("manisa")); // list de olmayan eleman indeksi -1 return eder
         // case sensitive






    }
}
