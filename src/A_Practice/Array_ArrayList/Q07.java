package A_Practice.Array_ArrayList;

public class Q07 {
    public static void main(String[] args) {
        /*
         * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
         *  2D arrayinden min number print et
         */
        int arr[][] = {{1, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2, -1}};
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) { //outer for
            System.out.println("arr [" + i + "]. length i : " + arr[i].length);
            for (int j = 0; j < arr[i].length; j++) { //inner for
                if(arr[i][j]<min){
                    min = arr[i][j];
                }
            }
        }
        System.out.println("min = " + min);



        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */
        String [][] arr1 = {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};
        double toplam =0;
        for (int i = 0; i < 3; i++) { //outer for
            for (int j = 0; j < 3; j++) { //inner for
                if(arr1[i][j].contains("$")){ //$ isareti iceriyorsa
                    toplam+=Double.parseDouble(arr1[i][j].replace("$",""))*3.2;
                    //parantez icindeki replaceAll methodu ile $ isaretlerinden kurtulduk, sonra elimizde "12" var(data type :String)
                    //Double toplam variable ile isleme katmak icin data casting yapmak gerekir, bu yuzden Double.parseDouble() methodunu kullandik
                    //bu asamada 12 degeri -> data type :Double oldu, eklerken de 3.2 ile carpmamizi istedigi icin carptik
                }else{
                    toplam+=Double.parseDouble(arr1[i][j].replace("€",""))*4.2;
                }
            }
        }
        System.out.println("toplam = " + toplam); //374.6






        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * yaziniz
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */
        int multiArr [][] = {{1,3,6},{2,8},{5,7,9,14}};
        System.out.println("multidimensional arrayin cift elemanlari toplami = " + ciftElToplam(multiArr));
    }
    public static int ciftElToplam(int arr2 [][]) {
        int sum = 0;
        for(int i = 0 ; i < arr2.length ; i++) {
            for(int j = 0 ; j < arr2[i].length ; j++) {
                if(arr2[i][j] % 2 == 0) {
                    sum += arr2[i][j];
                }
            }
        }
        return sum;
    }
}
