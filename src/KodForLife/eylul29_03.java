package KodForLife;

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




            System.out.println("girdiginiz kelime 3 harfli ve unique karaktere sahip");

            System.out.println("girdiginiz kelime 3 harfli ve unique karaktere sahip degil");


        }


    }
