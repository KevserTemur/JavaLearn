package j15_Arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {
// stringi arraya çevirme    SPLİT
        // girilen parametre değere göre string ifade parçalanır
        String str = "javacanlara selam olsun en kısa zamanda bolcana offer. sonrası tuzla balık.";
       // TASK -->> string ifadedeki kelime sayısını print eden code
        String strArr[]= str.split( " "); // str her " " karaktere göre parçalanır
                                                // herbir parça strArr in bir elemenı olarak atandı
        System.out.println(Arrays.toString(strArr)); //

        System.out.println(strArr.length); //11

        // TASK -->> string ifadedeki kelime sayısını print eden code
        String harfArr[]= str.split(""); // Sitring harf hiçliğe göre parçalandı.
        System.out.println(Arrays.toString(harfArr));
        System.out.println(strArr.length);



    }
}
