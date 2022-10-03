package KodForLife;

import java.util.Scanner;

public class eylul29_10 {
    public static void main(String[] args) {

 /*      10-    	Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak
                asagidaki 3 cumleden uygun olani yazdirin

                 Girilen kelime cumlede kullanilmamis.
                 Girilen kelime cumlede 1 kere kullanilmis.
                 Girilen kelime cumlede 1’den fazla kullanilmis.
             */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir cümle girin :");
        String cumle = scan.next();
        System.out.println("bir kelime girin :");
        String kelime = scan.next();


        System.out.println(cumle.contains(kelime));


        System.out.println("Girilen kelime cumlede kullanilmamis.");

        System.out.println(" Girilen kelime cumlede 1 kere kullanilmis.");

        System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis.");





    }
}
