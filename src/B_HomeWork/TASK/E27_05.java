package B_HomeWork.TASK;

import java.util.Scanner;

public class E27_05 {
    /*
    /* girilen String'in son karakterini silen code create ediniz...
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("bir metin giriniz : ");

        String str = sc.next();


        System.out.println(str.substring(0, str.length() - 1));


    }
}
