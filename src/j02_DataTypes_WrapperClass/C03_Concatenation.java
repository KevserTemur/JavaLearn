package j02_DataTypes_WrapperClass;

public class C03_Concatenation {
    public static void main(String[] args) {

        String ad="Kevser";
        String soyad="Temür";

        int a=7;
        int b=11;
        // birden çok String variable ile farklı data type variable ler + ile işleme alınırsa
        // java birleştirme yaparak yeni bir String oluşturur

        // TRICK :) Bir aritmetik işlem içinde String kullanılırsa, aritmetik işlem önceliğine göre
// işlem yapılıp String variable'a Concatenation yapılır.


        System.out.println(ad+soyad+a+b);// KevserTemür711

        System.out.println(a+ad+soyad+b);// 7KevserTemür11

        System.out.println(a+b+ad+soyad);// 18KevserTemür

        System.out.println(" "+a+b); // ...711

        System.out.println(ad+soyad+(a+b)); // KevserTemür18

        System.out.println((a+b)+ad+soyad);// 18KevserTemür

        System.out.println(ad+(a-b)+(a-b));//Kevser-4-4

        System.out.println(ad+((a-b)+(a-b)));//Kevser-8


                char ch='1'; //

        System.out.println(ad+ch); // Kevser1

        System.out.println(a+ch+ad); // 56Kevser

        System.out.println(ad+(ch+b)); // Kevser68

        System.out.println(a+ad+ch); // 7Kevser1


        /* TRİCK -> char data turu isleme girdigi variables'in turune gore farkli işlem yapar
  eger isleme girdigi variables  aritmetik bir islemse  ascii değeri ile işelm yapar ->
 */







    }
}
