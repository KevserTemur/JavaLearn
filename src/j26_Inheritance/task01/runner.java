package j26_Inheritance.task01;

public class runner {
    public static void main(String[] args) {
        A a = new A();

        System.out.println("a.mesaj = " + a.mesaj); //agama A classstan selamlar

        B b = new B();


        System.out.println("b.mesaj = " + b.mesaj); // static variable İnheritance da classname olmadan call edilir


    }

}
