package j12_lopps.L01_ForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        System.out.println("maşaallah");
        System.out.println("maşaallah");
        System.out.println("maşaallah");
        System.out.println("maşaallah");
        System.out.println("maşaallah");
        System.out.println("maşaallah");
        System.out.println("maşaallah");
        System.out.println("maşaallah");
        System.out.println("maşaallah");
        System.out.println("maşaallah");

/*
loop -> döngü
tekrarlanan aksiyonlar için kullanılan code bloklarıdır
 */

        for (int i = 1; i <= 41; i++) { // döngü boyunca tekrarlanan action
            System.out.println(i + ".maşaallah"); // 1. maşaallah....41. maşaaallah
        }
        System.out.println("selam javacanlar"); //döngü dışı bir kez run olur

// 2 basamaklı tek sayıları yan yana print eden code creat ediniz -> 11,13,15,17......99
        for (int i = 11; i <= 99; i += 2) {
            System.out.println(i + " ");
        }
        System.out.println("    ****     ");
        for (int i = 10; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i + " ");

                // çalışmayan loop
               // for (int i = 0; i > 10; i++) {//şartı sağlamayan->False olan for body run almaz

                    // kod kırılarak sıradaki satırdan(46) devam eder

                    System.out.println("selam javacan");
                }

                System.out.println("agam bumetni okuduysan yukarıdaki for çalışmadı");

                // durmayan sonsuz loop

               // for (int i = 0; i >= 0; i++) {//bu for çuğarayı cüpiterden yakana kadar çalışır:)

                    // durduran aşk olsun

                    System.out.println(i);
                }
            }
        }
