package A_Practice.String;

import java.util.Scanner;

public class prac_String03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("4 hafrli bir kelime giriniz : ");
        String str= scan.nextLine();

        System.out.println(str.substring(str.length() - 1) + str.charAt(2) + str.charAt(1) + str.charAt(0));

    }
}
