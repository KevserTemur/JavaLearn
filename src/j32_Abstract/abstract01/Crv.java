package j32_Abstract.abstract01;

public class Crv extends Honda {
    @Override
    public void motor() {
        System.out.println("2,4 motorla arazi iyi gider");

    }

    @Override
    void koltuk() {
        System.out.println(" deri koltuk arazi de olmaz");

    }

    @Override
    void kapı() {
        System.out.println("sert kapama");

    }
}
