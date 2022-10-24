package CodeForLife.eylül29;

import java.util.Scanner;

public class eylul29_07 {
    public static void main(String[] args) {
   /*   7-      Iki String anagram mi degil mi kontrol ediniz ve method kullanarak yapiniz. | Anagram = Mary ARMY
                (Method Creation kullanın)
            */
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir kelime giriniz : ");
        String str1 = scan.nextLine().toLowerCase();
        System.out.print("İkinci kelimeyi giriniz : ");
        String str2 = scan.nextLine().toLowerCase();
        anagram(str1, str2);
    }
    public static void anagram(String str1, String str2) {
        if (str1.length() == str2.length()) {
            boolean icer = true;
            int kntrl = 1;
            for (int i = 0; i <= str1.length() - 1; i++) {
                icer = str2.contains("" + str1.charAt(i));
                if (icer) {
                    kntrl *= 1;
                } else {
                    kntrl *= 0;
                }
            }
            System.out.println((kntrl == 0) ? false : true);
        } else {
            System.out.println("stringlerin boyu aynı değil");
        }
    }
}

/*<<-- ÖRNEK KONSOL ÇIKTILARI -->>

    Bir kelime giriniz : NOW! I Fatih
    İkinci kelimeyi giriniz : I won faith!
            true

    Bir kelime giriniz : istanbul
    İkinci kelimeyi giriniz : islandul
false

    Bir kelime giriniz : karamelize
    İkinci kelimeyi giriniz : kremalize
    stringlerin boyu aynı değil kanky

    Bir kelime giriniz : Hatırlamak
    İkinci kelimeyi giriniz : hamaratlık
true
*/


