package j02_DataTypes_WrapperClass;

import javax.print.attribute.IntegerSyntax;

public class C04_WrapperClass {

    public static void main(String[] args) {
        String name="Kevser";
        int yas=35;

        System.out.println(name.toLowerCase()); // kevser

        // non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
        // ancak primitive data turlerinin boyle bir ozelligi yoktur
        // primitive data turleri sadece degerleri saklarlar (container) ve herhangi bir özellik(method) vs bulundurmaz.
        //Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
        // olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
        // ara çözüm imkanı sunmuştur.


        //TASK id ve tc String değerlerinin toplamını print eden code yazınız
        String tc ="1234455";
        String id="98765";
        System.out.println(tc+id); // concat-> birleştirme : 123445598765

        int yeniTC= Integer. valueOf(tc); // tc String değerini int çevirdi ve yeniTC' ye atadı.
        System.out.println("yeniTC=" +yeniTC);

        int yeniID= Integer. valueOf(id); // tc String değerini int çevirdi ve yeniID' ye atadı.
        System.out.println("yeniID=" +yeniID );

        System.out.println(yeniTC+yeniID); // aritmetik toplama 1333220
        String okulNo="2345432";
        int yeniOkulNo= Integer.valueOf(okulNo); // run time exception-> çalışma zamanı hatası
        System.out.println("yeniokulNo="+yeniOkulNo);



        // TASK-> byte short int maximum ve minimum değerlerini print eden code yazınız.
        byte maxByteDegeri=Byte.MAX_VALUE;
        byte minByteDegeri=Byte.MIN_VALUE;
        System.out.println("maxByteDegeri = " + maxByteDegeri);
        System.out.println("minByteDegeri = " + minByteDegeri);

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);

        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);



        int a=5;

        System.out.println(a);// 5

        System.out.println(5);// 5





    }



}
