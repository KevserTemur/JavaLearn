package A_CodeForLife.odev_27ekim;

public class ArraySayiCarpım {

    //Soru 2) Bir integer array olusturunuz ve bu array’deki tum sayilarin carpimini For-each loop kullanarak bulunuz.
    // Sonucu ekrana yazdiriniz.

    public static void main(String[] args) {
        int sayi[] = {1,2,3,4,5,6};
        int carpim = 1;
        for (int value : sayi){
            carpim*=value;
        }
        System.out.println(carpim);


    }
}
