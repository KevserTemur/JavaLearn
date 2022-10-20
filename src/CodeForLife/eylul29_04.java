package CodeForLife;

import java.util.Scanner;

public class eylul29_04 {


    public static void main(String[] args) {

        /* 4- 	 * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa
         * son iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         * ornek input = Ali output = lilili
         * input = el output = el
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir kelime girin :");
        String str = scan.next();

        String a = str.substring(str.length() - 2);
        if (str.length() >= 3) {
            System.out.println(a + a + a);
        } else System.out.println(str);

    }

}
