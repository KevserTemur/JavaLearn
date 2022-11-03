package j26_Inheritance.Inheritance02;

public class Hayvancık { // paretn class

    public Hayvancık() { // psiz cons

        System.out.println("hayvancık p siz cons");
    }

    public Hayvancık(int i) { // pli cons

        System.out.println("hayvancık p li cons");
    }

    public void mA() {
        System.out.println("hayvancık clastan method call");
    }

    public void mM() {
        System.out.println("hayvancık clastan method call");
    }

    int a;
    int m=3;
}