package j23_Varargs_StringBuilder.StringBuilder;

import java.time.LocalTime;

public class C01_StringBuilder {
    public static void main(String[] args) {

         /*
String = > daha yavas ,Immutable==> degisemez,
String'lerde method kullanarak String'i degistirmek atama yapmadan mumkun degildir.

1) Java pass-by-value kullanir
2) String Class'i immutable Class'dir.

 StringBuffer =mutable==>degisebilir,less efficient/ daha yavas ,
 StringBuffer synchronized,thread safe.

StringBuilders = mutable==>degisebilir ,
not senkronized/not thread safe,fakat more efficient(daha etkili,ve hizli )

1) String Class'i immutable(Degistirilemez)dir. Java mutable Stringler uretebilmemiz icin
StringBuilder isimli bir class uretmistir.
2) Java'da StringBuilder ile hemen hemen ayni isi yapan birde StringBuffer classi vardir.
"StringBuffer" Class'i StringBuilder Class'indan daha once uretilmistir.
"StringBuffer" yavas calisan bir class'dir, "StringBuilder" ise hizli calisir.
"StringBuffer"  "synchronize" islemlerini yapabilir, ama "StringBuilder" yapamaz.
3) Ayni anda bir cok isin yapilmasina "multi threading" denir. "multi" = Cok, "thread"= Yapilan islerin herbiri
Multi threading varsa, bu islerin siraya konulmasi lazim.Islerin siraya konulmasina "synchronization" denir.

    */

    String str = "JavaCAN";
        System.out.println("method öncesi str : " +str); // JavaCAN

        strBirlestir(str);

        System.out.println("method sonrası str : " +str); // JavaCAN --> immutable

// task --> 50000 tekrarlı bir loop ile String ve Stringbuilder obj run time sürelerini karşılaştırın.

        String str1= "";
        StringBuilder sb1= new StringBuilder("");

        LocalTime str1basla=LocalTime.now();
        System.out.println("str1Time = " + str1basla);
        for (int i = 0; i < 50000; i++) {
            str1+=i;
        }
        LocalTime str1bitti=LocalTime.now();
        System.out.println("str1bitti = " + str1bitti);



        LocalTime sb1basla = LocalTime.now();
        System.out.println("sb1basla = " + sb1basla);
        for (int i = 0; i < 50000; i++) {
            sb1.append(i);
        }
        LocalTime sb1bitti=LocalTime.now();
        System.out.println("sb1bitti = " + str1bitti);


    } // main sonu

    public static void strBirlestir(String str) {
        System.out.println("selamlar");
    }

}
