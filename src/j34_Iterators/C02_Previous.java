package j34_Iterators;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;


    public class C02_Previous {
        public static void main(String[] args) {
            List<Integer> l1 = new ArrayList<>(Arrays.asList(24, 38, 65, 9, 11, 7, 27, 23));
            //l1 elamanlarını tersten print ediniz.
            System.out.println("l1 list ilk hali : " + l1);
        /*
        tekrarda son elemandan başlayan işlemler için pointer en sona götürülmeli
        Bunun için pointer'e sona götüren hasNext() meth çalışmalı.
         */
            ListIterator<Integer> it1 = l1.listIterator();
            while (it1.hasNext()) {//b->s pointer sürekli sona doğru ilerler
                it1.next();
            }
            while (it1.hasPrevious()) {//s->b pointer sürekl basa doğrı ilerler
                System.out.print(it1.previous() + " ");//23 27 7 11 9 65 38 24
            }

            //System.out.println("l1 tersten print hali : "+l1);

        }
    }

