package CodeForLife.chapter;

public class break_continue {
    public static void main(String[] args) {
        /*
        BREAK
        --> Bir loop’u, loop’un koşul bölümüne bağlı kalmaksızın sona erdirmek için break komutu kullanılır.
        --> . Program, kod bloğunda break komutu’nu görür görmez, loop başlangıç koşulu sağlanmış olsa bile,
        loop’dan çıkar ve loop’dan sonra gelen ilk işlem satırından çalışmasına devam eder.
        --> break komutunu tüm loop larda kullanabiliriz.
         */
    int x=0;
    while (x<10){
        System.out.print(x); x++;
        if (x==5){
            break;
        }
    }

        for (int a = 0; a < 4; a++) {
        for (int b = 0; b < 4; b++) {
            if (a + b > 5) { // inner (iç) loop dan ayrılma koşolu
                System.out.println("ayrıl");
                break;
            }
            System.out.println(a + " " + b); } }


    // --> Nested looplarda break komutu kullanıldığında sadece içinde kullanıldığı loop’dan çıkışı sağlar.

        for (int crpn1 = 1; crpn1 <=10 ; crpn1++) {
            for (int crpn2 = 1; crpn2<=10;crpn2++){
                System.out.println(crpn1+" x "+crpn2+" = "+(crpn1*crpn2));
                if (crpn1<3) {
                    break;
                }
            }
            System.out.println();
        }

    /*
    CONTINUE
    --> continue komutu, bir loop’un herhangi bir satırından itibaren
    loop’un geri kalan işlem satırlarını çalıştırmadan, loop’un baş tarafına dönme olanağı sağlar.
    --> Program, bir loop içerisinde continue komutu ile karşılaşılırsa,
    ondan sonraki komutları atlar ve loop’un bir sonraki değerinden devam eder
    --> do ve while loop’larında, program continue komutu ile karşılaştığında,
    koşul bölümünü kontrol eder ve loop’un çalışmasını devam ettirir.
    --> for loopda ise, artırma ve koşul bölümünü çalıştırdıktan sonra loop’un çalışmasını devam ettirir.
     */

        int y=0;
        while (y<10){
            if (y==5);{
                y++;
                continue;
            }
        }




    }
}

