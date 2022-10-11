package java_practice.Loop;

public class Loop06_sağaDayalıYıldız {
    /*  Problem Tanımı
    Girilen bir sayı kadar satır ve sütünu olan ve
    sağ kenara dayalı üçgeni basan kodu yazınız.

    Ekran Çıktısı
    Bir sayi giriniz: 5
           *
          **
         ***
        ****
       *****
*/
    public static void main(String[] args) {
        for (int satir = 1; satir<=5; satir++ ){ //satır kontrolu
            for (int bosluk = 5-satir; bosluk > 0; bosluk--){ // boşluk kontrolü
                System.out.print(" ");
            }
            for (int sutun =1; sutun<=satir; sutun++) { // sütün kontrolü
                System.out.print("*");
            }
            System.out.println();
        }

        for (int satir = 1; satir <=5 ; satir++) {
            for (int sutun = 1; sutun <=satir ; sutun++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
         *
         **
         ***
         ****
         *****
         */
    }
}
