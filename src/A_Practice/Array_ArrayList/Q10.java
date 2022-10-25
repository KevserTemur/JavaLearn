package A_Practice.Array_ArrayList;

import java.util.Scanner;

public class Q10 {
    // Kullanicidan bir cumle isteyin ve kelime sayisini yazdiriniz.

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Lutfen bir cumle tanimlayiniz");
            String a = sc.nextLine();
            String arr[] = a.split(" ");
            System.out.println(arr.length);
        }
    }

