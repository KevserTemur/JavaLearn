package j32_Abstract.abstract01;

public class Civic extends Honda {
    @Override
    public void motor() {
        System.out.println("1,6 eco motor az yakar");
    }

    @Override
    void koltuk() {
        System.out.println("koltuk kumaşları temiz kullanılmalı");
    }

    @Override
    void kapı() {
        System.out.println("5 kapı sedan");
    }
}
