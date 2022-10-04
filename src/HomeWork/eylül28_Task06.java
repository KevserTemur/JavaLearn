package HomeWork;

import java.util.Scanner;

public class eylül28_Task06 {

    public static void main(String[] args) {
		/*
		 Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini
		 ve iki sayı seçmesini söyleyin.
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 */
        Scanner sc = new Scanner(System.in);
        System.out.println("kare, dikdörtgen, üçgen şekillerinden birini seç :");
        String secim=sc.next().toLowerCase();
        System.out.println("1. sayıyı gir");
        int sayi1 =sc.nextInt();
        System.out.println("2. sayıyı gir");
        int sayi2 =sc.nextInt();

        secim(secim, sayi1, sayi2, sc);
    }
    public static void secim (String str, int sayi1, int sayi2, Scanner sc) {
        switch (str) {
            case "kare":
                sayi1=sayi2;
                karealan (sayi2,sayi2);
                karecevre (sayi2, sayi2);
                break;

            case "dikdörtgen":
                dikdortgenAlan(sayi1, sayi2);
                dikdortgenCevre(sayi2,sayi1);
                break;

            case "üçgen":
                sayi2=sayi1;
                ucgenAlani(sayi1, sc);
                üçgenCevre(sayi2);
                break;

            default:
                System.out.println("hatalı seçim yaptın:");
                secim(str, sayi1, sayi2, sc);

        }
    }
    private static void üçgenCevre(int sayi1) {
        System.out.println("ucgen cevre :"+(sayi1*3));
    }
    private static void ucgenAlani(int sayi1, Scanner sc) {
        System.out.println("üçgn yukeskliği giriniz : ");
        int yksklk=sc.nextInt();
        System.out.println("ucgen alanı :"+((yksklk*sayi1)/2));
    }
    private static void dikdortgenCevre(int sayi2, int sayi1) {
        System.out.println("dikdortgen cevresi :"+((sayi2+sayi1)*2));
    }
    private static void dikdortgenAlan(int sayi1, int sayi2) {
        System.out.println("dikdortgen Alanı : "+(sayi2*sayi1));
    }
    private static void karecevre(int sayi1, int sayi2) {
        System.out.println("kare cevre :" + ((sayi1 + sayi2) * 2));
    }
    private static void karealan(int sayi1, int sayi2) {
        System.out.println("kare alan :" + (sayi1 * sayi2));
    }
}
