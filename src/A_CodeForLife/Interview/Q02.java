package A_CodeForLife.Interview;

public class Q02 {
    /*
    2 -->> Write a return method that can remove the duplicated values from string
Ex : removeDup("AAABBBCCC") ==> ABC
     */


    public static void main(String[] args) {

        String str = "AAABBBCCC";
        System.out.println(removeDup(str));




    } // main dışı

    public static String removeDup (String str) {
        String result = ""; // boş string açtık
        while (str.length() > 0) { // String boyunca devam etsin
            if (!result.contains(str.substring(0,1))) { // resultta stringin birinci elemanı var mı yok mu
                result += str.substring(0,1); // yoksa ekle
                str = str.replaceAll(str.substring(0,1), ""); // ve olan her elemanı hiçlikle değiştir yani sil


            }
        }

        return result;

    }
}