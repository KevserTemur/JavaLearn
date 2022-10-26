package A_CodeForLife.odev_27ekim;

public class Multidimensional_carpim {

    //Soru 4) Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini
    //ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6} }
    public static void main(String[] args) {


        int sayiArr[][] ={{1,2,3}, {4,5}, {6}};
        int crpm = 1;
        for (int i = 0; i < sayiArr.length; i++) {
            crpm*=sayiArr[i][sayiArr[i].length-1];
        }
        System.out.println(crpm);
    }
}