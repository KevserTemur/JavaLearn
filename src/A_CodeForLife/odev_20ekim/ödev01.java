package A_CodeForLife.odev_20ekim;

import java.util.ArrayList;
import java.util.Scanner;

public class ödev01 {
    public static void main(String[] args) {
        // Girilen String'i ArrayList kullanarak ters ceviriniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Strin bir ifade girin:"); // abcdefghıjklm
        String sc = scan.nextLine();

        ArrayList<String> list=new ArrayList<>();
        for (int i = 0; i <= sc.length()-1 ; i++) {
            list.add(""+sc.charAt(i));
        }
        for (int i = list.size()-1; i >=0; i--) {
            System.out.print(list.get(i));
        }

    }
}
