package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C05_sorted {

    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));


    }// main sonu

    // Task : list'in cift  elemanlarinin karelerini  kucukten buyuge print ediniz.
    public static void ciftKareKbPrint (List<Integer>sayi){
        sayi.
                stream(). // list elemanları akışa alındı
                filter(C01_LambdaExpression :: ciftMi). // çift şartına göre filtrelendi
                map(t->t*t). // çift elemanlar karesine update edildi
                sorted().// update olan elemanlar sıralandı
                forEach(C01_LambdaExpression :: yazdir); // print

    }

    // Task : list'in tek  elemanlarinin kareleri ni buykten kucuge  print ediniz.
    public static void  tekKareBkPrint (List<Integer>sayi){
        sayi.
                stream().
                filter(t->t%2==1).
                map(t -> t*t).
                sorted(Comparator.reverseOrder()). // ters sıra method sorte
                forEach(C01_LambdaExpression :: yazdir);

    }


}
