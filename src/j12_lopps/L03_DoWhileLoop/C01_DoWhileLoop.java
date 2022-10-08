package j12_lopps.L03_DoWhileLoop;

public class C01_DoWhileLoop {
    public static void main(String[] args) {
        /*
        While loop ->> önce şart kontrol edilir. şart sonucu true alınırsa body çalışır
        do-While loop ->>   önce body çalışır sonra şart kontrol edilir.
        şart true ise döngü devam eder
        şart false ise döngü kırılır ve döngüden sonraki ilk satır çalışır
        do-While loop game app. de daha çok kullanılır
        TRİCK -->>>>  while loop şart sağlamazsa hiç çalışmayabilir.
        do-While loop şart sağlasın sağlamasın en az bir kez çalışır.
         */
        int yas = 31;
        //  while (yas < 33) {
        //      System.out.println("agam yas " + yas + " gayet basarılı :) while body action ....");

        //      yas++;
        //  }

        do {
            System.out.println("agam yas " + yas + " gayet basarılı :) do while body action");
            yas++;
        } while (yas < 33);
        }
}