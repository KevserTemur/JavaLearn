package TASK;

public class E27_07 {
/*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi yazdiriniz.
   String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */

    public static void main(String[] args) {

        String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char k=harfDepo.charAt(harfDepo.indexOf("K"));
        char e=harfDepo.charAt(harfDepo.indexOf("E"));
        char v=harfDepo.charAt(harfDepo.indexOf("V"));
        char s=harfDepo.charAt(harfDepo.indexOf("S"));
        char r=harfDepo.charAt(harfDepo.indexOf("R"));


        System.out.println(k+e+v+s+e+r);//asciii->toplama-> 373

        System.out.println(""+k+e+v+s+e+r);//string->concat-> HALUK



    }


}
