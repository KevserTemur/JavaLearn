package B_HomeWork;

public class eylül27_String {
    public static void main(String[] args) {
      /*  I love java olan bir String oluşturun.
            Bu cümlenin toplam karakter sayısını yazdırın.   */

        String a = "I love java";
        System.out.println(a.length());


     /*    Sprint planning olan bir String oluşturun.
        Bu dizenin toplam karakter sayısını yazdırın.   */

        String b = "Sprint planning";
        System.out.println(b.length());


 /*    paper olan bir String oluşturun.
          String'i büyük harfe çevirin ve yazdırın.
          örn: apple > APPLE   */
        //Kodu aşağıya yazınız.

            String c = "paper";
            System.out.println(c.toUpperCase());

            /* OraNge olan bir String oluşturun.
           String'i küçük harfe çevirin ve yazdırın.
           örn: APPLE > apple  */
        String d = "OraNge";
        System.out.println(d.toLowerCase());

        /*  New Jersey olan bir String oluşturun.
        String'i büyük harfe çevirin ve yazdırın  */
        String e = "New Jersey";
        System.out.println(e.toUpperCase());

         /*  New York olan bir String oluşturun.
            String'i küçük harfe çevirin ve yazdırın.  */
        String f = "New York";
        System.out.println(f.toLowerCase());


         /*  PADDLE olan bir String oluşturun.
            String'i küçük harfe çevirin ve yazdırın.  */
        String g = "PADDLE";
        System.out.println(g.toLowerCase());


        /*  apple olan bir String oluşturun.
            String'in içinde app olup olmadığını doğrula.
               String'in içinde App olup olmadığını doğrula.
               */
        String h = "apple";
        System.out.println(h.contains("app"));
        System.out.println(h.contains("App"));

        /*  orange kelimesinden oluşan bir String oluşturun.
            String'in Apple'a eşit olup olmadığını doğrulayın. */
        String ı = "orange";
        System.out.println(ı.equals("Apple"));


         /*  apple  olan  bir String oluşturun.
            String'in apple'a eşit olup olmadığını doğrulayın.
            Büyük harf veya küçük harf önemli değildir.    */
        String j = "apple";
        System.out.println(ı.equals("apple"));


        /*  Florida kelimesinden bir String oluşturun.
            Florida kelimesinin içindeki, sadece  'o'  harfinin bulunduğu indexini yazdırın.  */
        String k = "Florida";
        System.out.println(k. indexOf("o"));


         /*  Thank you olan bir String oluşturun.
            Thank you içindeki, sadece  'y' harfinin bulunduğu konumu yazdırın.
             */
        String l = "Thank you";
        System.out.println(l.indexOf("y"));


         /*  String s1 = "      Clarus  Way          ";
            s1 String'inin önündeki ve arkasındaki boşlukları kaldırın.
            s1 String'ini yazdırın.  */
        String s1 = "      Clarus  Way          ";
        System.out.println(s1.trim());


         /* Main method oluşturun.
            Mouse değerinde bir String oluştur.
            Mouse String'inin 2. sırasındaki karakteri yazdırın.  */
        String m = "Mouse";
        System.out.println(m.charAt(1));


        /*  String s1 = "    Chocolade     ";
            s1 String'inin başındaki ve sonundaki boşlukları kaldırın.
            s1 String'ini yazdırın.  */
        String s2 = "    Chocolade     ";
        System.out.println(s2.trim());










    }
}