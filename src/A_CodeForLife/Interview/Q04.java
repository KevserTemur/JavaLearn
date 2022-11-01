package A_CodeForLife.Interview;

import static jdk.nashorn.internal.objects.NativeArray.reverse;

public class Q04 {

    // 4 -->>  Write a return method that can reverse string
    // Ex : Reverse("ABCD") ==> DCBA

    public static void main(String[] args) {

        String str1 = "ABCD";
        System.out.println(reverse(str1)); // reverse metodu uygulandı
        System.out.println(reverse1(str1));

    } // main sonu

    public static String reverse (String str){ // method oluşturuldu
        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return  reverse;
    }



    public static String reverse1(String str){
        return new StringBuffer(str).reverse().toString();
    }


}
