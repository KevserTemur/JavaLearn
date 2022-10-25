package A_Practice.String;

import java.util.Scanner;

public class prac_String02 {
    public static void main(String[] args) {
// Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
// Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("String giriniz : ");
        String str = scan.nextLine();

        int bosluk = str.indexOf(" ");
        if (bosluk == -1 && !str.isEmpty()) {
            ;
            System.out.println("şartlara uygun");
        } else {
            System.out.println("şartlara uygun değil");
        }
    }
}
