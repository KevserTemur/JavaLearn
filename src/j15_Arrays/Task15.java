package j15_Arrays;

public class Task15 {

    public static void main(String[] args) {

        // arr tüm elamanlarının çarpımını print eden code

        int sayi[][]= {{1,2,3},{9,8}};
        int çarpım =1; // ilk değeri 1 verilerek çarpmada etki etmeyecek değer kullanıldı
        for (int kat = 0; kat < sayi.length; kat++) {
            for (int daire = 0; daire < sayi[kat].length ; daire++) {
                çarpım *= sayi[kat][daire];
            }
        }
        System.out.println("array deki tüm elemanlar çarpımı: "+çarpım);


    }
}
