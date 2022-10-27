package A_CodeForLife.odev_27ekim;

public class OrtakEleman {

    // Soru 1) iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For-each loop kullanarak bulunuz.
    //     Sonucu ekrana yazdiriniz. Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz.

    public static void main(String[] args) {

        String[] meyve1 = {"elma", "kayısı", "şeftali", "mandalina", "çilek","karpuz"};
        String[] meyve2 = {"kavun","çilek", "üzüm","elma", "şeftali", "kiraz", "erik", "karpuz"};
        System.out.println("Prtak Elemanlar: ");

        int sayac =0;
        for (String i : meyve1) {
            for (String j: meyve2) {
                if (i.equalsIgnoreCase(j)){
                    System.out.println(i + " ");
                    sayac ++;
                }
            }
        }

        if (sayac == 0) System.out.println("Ortak Eleman Yok.");




    }


}
