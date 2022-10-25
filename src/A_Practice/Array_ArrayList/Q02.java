package A_Practice.Array_ArrayList;

public class Q02 {
    public static void main(String[] args) {

        /*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan buyuk olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output1 : 4
         * output2 : 5,6,7
         */

    int arr [] = {1,2,3,4,5,6,7};
    int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            toplam+= arr[i];
        }
        double ortalama = toplam / arr.length;
        System.out.println("ortalam: "+ ortalama);

        System.out.println("ortalamadan büyük olan elemanlar: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr [i] >ortalama ? arr [i]+" ":"");
        }

    }
}
