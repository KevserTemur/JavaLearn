package KodForLife;

import java.util.Scanner;

public class eylul29_01 {
    public static void main(String[] args) {

        /*
       1-      name1 ve name2 degiskenlerini olusturun.
               name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
               name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirinan bir method olusturun
                name1= mehmet
                name2= ahmet
                Print ==> mehahmetmet
                (İsimleri kullanıcıdan alın)
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("birinci kelimeyi gir");
        String kelime1 = sc.nextLine();

        System.out.println("ikinci kelimeyi gir");
        String kelime2 = sc.nextLine();

        if (kelime1.length() % 2 == 0) {
            System.out.println(kelime1.substring(0, kelime1.length() / 2) + kelime2 + kelime1.substring(kelime1.length() / 2));
        } else {
            System.out.println("kelime2 kelime1 e eklenemez");


        }
    }
}