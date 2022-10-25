package A_Practice.String;

import java.util.Scanner;

public class prac_String01 {
    public static void main(String[] args) {

/*
  Kullanicidan bir kelime girmesini isteyin.
  * Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
  * kelimenin ortasindaki karakteri yazdirin.
  */
        Scanner scan = new Scanner(System.in);
        String isim = scan.next();
        String soyIsim = scan.next();

        if(isim.length()>soyIsim.length())
            System.out.println("isminiz daha uzun");
        else if(isim.length()==soyIsim.length())
            System.out.println("isim ve soyisim uzunluklari esit");
        else System.out.println("soyisminiz daha uzun");


    }
}
