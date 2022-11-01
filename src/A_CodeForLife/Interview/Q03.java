package A_CodeForLife.Interview;

public class Q03 {


   // 3 -->> Write a return method that can find the unique characters from the string
    // Dizedeki benzersiz karakterleri bulabilen bir dönüş yöntemi yazın
   // Ex :   unique("AAABBBCCCDEF") ==> "DEF";

    public static void main(String[] args) {


        String str = "AAABBBCCCDEF";
        System.out.println(unique2(str)); // while da sadece unique olacak, forloop da unique2 olacak

    } // main sonu



    public static String unique(String str){
        String unique = ""; // boş string tanımlıyoruz.
        while (str.length()>0){
            if (str.substring(1).contains(str.substring(0,1))){
                str = str.replaceAll(str.substring(0,1),"");
            } else {
                unique += str.substring(0,1);
                str = str.substring(1); // loopdan çıkmak için
            }
        }
        return unique;
    }

    public static String unique2(String str){
        char [] arr = str.toCharArray(); // array e çevirdik
        String unique = "";

        for (int i = 0; i < arr.length; i++) {// ilk indeksi tüm indekslerle kıyaslayacak. sonra diğerleri için yapacak.
            int count =0;  // A dan kaç tane var ona bakacak. count 3 olacak
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;  // A 3 olarak mloop dan çıkıyor
            }
            if (count == 1)
                unique+= arr [i]; // count 1 e eşitse unique e ekle
        }
        return unique;
    }
    // Collections frequency method

}
