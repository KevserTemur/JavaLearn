package A_CodeForLife.eylül29;

import java.util.Scanner;

public class eylul29_03 {

    public static void main(String[] args) {

        /* 3-     Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary kullanarak
                   harflerin unique(farkli) olup olmadigina bakiniz.
                    input : ali
                    output: girdiginiz kelime 3 harfli ve unique karaktere sahip
                    input : ece
                    output: girdiginiz kelime 3 harfli ve unique karaktere sahip degil
            */

        Scanner scan = new Scanner(System.in);
        System.out.println("üç harfli bir kelime giriniz :");
        String kelime = scan.nextLine();
        char harf1= kelime.charAt(0);
        char harf2= kelime.charAt(1);
        char harf3= kelime.charAt(2);
        if (kelime.length()>3) {
            System.out.println("girdiginiz kelime 3 harfli degil");
        } else if (harf1!=harf2 && harf1!=harf3 && harf2!=harf3) {
            System.out.println("girdiginiz kelime 3 harfli ve unique karaktere sahip");
        } else
            System.out.println("girdiginiz kelime 3 harfli ve unique karaktere sahip degil");
    }
        }

