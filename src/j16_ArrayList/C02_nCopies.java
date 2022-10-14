package j16_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C02_nCopies {
    public static void main(String[] args) {
        ArrayList<String> listUlke= new ArrayList<>(List.of("almanya", "amerika", "ingiltere","işviçre"));
        ArrayList<String> listSehir= new ArrayList<>(List.of("münih", "losangales", "londra","zürih"));

        // nCopies (int);     ----->>
        // int elemanlı bir objeden oluşan list ataması yapar."
        ArrayList<String> yenilist = new ArrayList<>(Collections.nCopies(3,"javacan"));
        System.out.println(yenilist);

        // addAll();  --->    bir liste diğer listi olduğu gibi ekler

        listUlke.addAll(listSehir);
        System.out.println(listUlke);

        listSehir.addAll(3, listUlke);
        System.out.println("listSehir = " + listSehir);

        // TASK ----->
        // 1 den 10 a kadar sayılara bir liste atayıp print eden code

        ArrayList<Integer> listSayi= new ArrayList<>();//boş integer list

        for (int i = 1; i <=10; i++) {
            listSayi.add(i);
        }
        System.out.println("listSayi = " + listSayi);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


    }
}
