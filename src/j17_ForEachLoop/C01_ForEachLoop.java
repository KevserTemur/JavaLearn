package j17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ForEachLoop {
    public static void main(String[] args) {
/*
1, clean code yazım kolaylığı
2, code okuma kolaylığı
3, hata yapma riski az
*/
        List<Integer> sayiList =new ArrayList<>(List.of(16,5,2,33,22,27,41,24));
        // list elemanlarını ayrı satırlara print ediniz
        for (int i = 0; i < sayiList.size(); i++) {
            System.out.println(sayiList.get(i));
        }


        for (Integer a:sayiList) {
            System.out.println(a + " ");
        }
        System.out.println("********************");

        // list elemanlarının ilk 3 eleman hariç tek olanları print et

        for (Integer a: sayiList.subList(3, sayiList.size())) {
            if (a%2==1) {
                System.out.println(a+ " ");
            }
        }


        // list elemanlarının 2 ile 6 ------(2,3,4,5) index elemanların toplamını print et
        int toplam =0;
        for (Integer a: sayiList.subList(2,6)) {
            toplam+=a;
        }
        System.out.println("toplam = " + toplam);
    }
}
