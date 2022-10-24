package CodeForLife.eylül29;

public class eylul29_05 {
    public static void main(String[] args) {

        /*   5- 		 * Asagidaki String degiskenini kullanarak konsolda A L i yazdiriniz.
         * String pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         */

        String  harfDepo = "ABCDEFGHiJKLMNOPQRSTUVWXYZ";
        char A=harfDepo.charAt(harfDepo.indexOf("A"));
        char L=harfDepo.charAt(harfDepo.indexOf("L"));
        char i=harfDepo.charAt(harfDepo.indexOf("i"));


        System.out.println(""+A+""+L+""+i);
    }
}
