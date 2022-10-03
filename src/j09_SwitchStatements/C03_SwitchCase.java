package j09_SwitchStatements;

import java.util.Scanner;

public class C03_SwitchCase {
    public static void main(String[] args) {
        // girilen ay numarasına göre kaç gün çektiğini print eden code creat ediniz.
        Scanner scan = new Scanner (System.in);
        System.out.println("1 ile 12 arasında bir sayı giriniz : ");
        int ayNo = scan.nextInt();
        switch (ayNo) {
                case 1 :
                case 3 :
                case 5 :
                case 7 :
                case 8 :
                case 10 :
                case 12 :
                    System.out.println("girilen ay 31 gün çeker");
                    break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                System.out.println("girilen ay 30 gün çeker");
            case 2 :
                System.out.println("yılınızı giriniz:");
                int yil = scan.nextInt();
                if (yil % 4 == 0) {
                    System.out.println("subat ayı 29 gün çeker");
                }  else System.out.println("şubat ayı 28 gün çeker");
                break;

            default : System.out.println(" doğru ay numarası girmediniz");
                break;
        }






    }
}
