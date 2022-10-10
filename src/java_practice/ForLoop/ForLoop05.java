package java_practice.ForLoop;

import java.util.Scanner;

public class ForLoop05 {
    /*
   Get the number of rows and columns from user.
   Create a rectangle.
   rows = 3 and column = 5 ==> * * * * *
                               * * * * *
                               * * * * *
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("satır sayısı gir : "); int sat= scan.nextInt();
        System.out.print("sütun sayısı gir : "); int sut= scan.nextInt();
        for (int i = 1; i <=sat ; i++) {
            for (int j = 1; j <=sut; j++) {
                System.out.print("* ");
            }
            System.out.println(); // bu boşluk olmazsa hepsini yan yana yazar. alt satıra inmez
        }
    }
}
