package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_distinct {
    public static void main(String[] args) {

        List<String> menu = new ArrayList<String>(Arrays.asList("küşleme","küşleme", "küşleme", "soğanlı","soğanlı", "soğanlı", "trileçe","bicibici","büryan","melemen","cacix","kokerç","yağlama","güveç","arabAşı","tantuni"));
        alfBkTkszPrint(menu);


        }// main sonu

        // Task : List elemanlarini alfabetik buyuk harf ve  tekrarsiz print ediniz.
        public static void alfBkTkszPrint(List<String>menu){

        menu.
                stream().
                map(String::toUpperCase).
                sorted().
                distinct().
                forEach(t-> System.out.print(t+ " "));

        //distinct() => Bu method tekrarlı elemanları sadece bir kere akısa sokar.
    // Bu akışın farklı elemanlarından (Object.equals (Object) 'e göre) oluşan bir akış döndürür.
    // Sıralı akışlar için, farklı elemanın seçimi sabittir
    // (yinelenen öğeler için, karşılaşma sırasında ilk görünen öğe korunur.)
    // Sırasız akışlar için, herhangi bir kararlılık garantisi verilmez. Stream return eder.

        }
}
