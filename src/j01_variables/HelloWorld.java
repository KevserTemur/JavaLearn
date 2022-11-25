package j01_variables;

public class HelloWorld {


    public static void main(String[] args) {
        System.out.println("merhaba dünya");// bu komut konsola yazılan metni print eder
        // dan sonra yazılan ifadeler komut veya kod satırı olarak değil yorum olarak tanımlanır. tek satır yazar.
        /* çok satır yazar
        bu araya yazılan her ifade yorum satırı olur java kod olarak derlemez
        başarı gayrete aşıktır
        bahanesi olanın başarısı olmaz
         */
        /*
        haluk hoca dedi ki madem geldin dünyaya otur çalış javaya
         imlecin olduğu satır ctrl d ile alt satıra kopyalanır
         */
        System.out.println("javacanlara selam olsun");// çalışmasını istemediğiniz kod satırın başına // yazarak yoruma alabilirsiniz
        System.out.println("javacanlara selam olsun");// çalışmasını istemediğiniz kod satırın başına // yazarak yoruma alabilirsiniz
        System.out.println("javacanlara selam olsun");// çalışmasını istemediğiniz kod satırın başına // yazarak yoruma alabilirsiniz
        System.out.println("javacanlara selam olsun");// çalışmasını istemediğiniz kod satırın başına // yazarak yoruma alabilirsiniz

        /*
        TRICK : javada code satırı cümle (statement) sonuna mutlaka ; koyulmalı
        code satırında kırmızı alt çizgi uyarısı "compile time error" CTE hatası uyarısı demektir.
        CTE düzeltilmeden code yazılmaz yazılan code calışmaz
         */
        System.out.print("adım soyadım : Kevser Temür ");
        System.out.println("yaşım : 35");
        System.out.println("memleketim : Hatay");
        System.out.println("mesleğim : öğrenci");

        /*
        TRICK:
        print-> yazdırma işleminden sonraki komutu AYNI satırdan devam ettirir
        println-> yazdırma işleminden sonraki komutu ALT satırdan devam ettirir
        javada space yani boşluk bir character olarak tanımlanır
        h a l u k-> 9 karakter

         */
    }
}