package A_CodeForLife.odev_27ekim;

import java.util.Arrays;

public class MultiDimensional {

    //Soru 3) Asagidaki multi dimensional array’in ic array’lerindeki tum elemanlarin toplamini  birer birer bulan
    // ve herbir sonucu yeni bir array’in elemani yapan ve yeni array’i  ekrana  yazdiran bir program yaziniz.
    //{ {1,2,3}, {4,5}, {6,7} }
    //Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13c}

    public static void main(String[] args) {
        int [] [] multi = {{1,2,3}, {4,5}, {6,7} };
        int[] icArr = new int [multi.length];

        int ic;
        for (int i = 0; i < multi.length; i++) {
            ic=0;
            for (int j:multi[i]){
                ic+=j;

            }
            icArr[i]=ic;
            }
        System.out.println(Arrays.toString(icArr));
        }
    }

