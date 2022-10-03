package j09_SwitchStatements;

import java.util.Scanner;

public class C04_SwitchCase {
    private static String String;

    public static void main(String[] args) {

// girilen ayın hangi mevsimde olduğunu print eden code creat ediniz

        Scanner scan = new Scanner(System.in);
        System.out.println("bir ay giriniz : ");
        String ayIsmi = scan.nextLine();
        switch (ayIsmi) {
            case "Ocak":
            case "Şubat":
            case "Aralık":
                System.out.println("girdiğiniz ay kıs mevsimindedir.");
                break;
            case "Mart":
            case "Nisan":
            case "Mayıs":
                System.out.println("girdiğiniz ay ilkbahar mevsimindedir.");
                break;
            case "Haziran":
            case "Temmuz":
            case "Ağustos":
                System.out.println("girdiğiniz ay yaz mevsimindedir.");
                break;
            case "Eylül":
            case "Ekim":
            case "kasım":
                System.out.println("girdiğiniz ay sonbahar mevsimindedir.");

        }
    }
}
