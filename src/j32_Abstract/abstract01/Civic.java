package j32_Abstract.abstract01;

public class Civic extends Honda {// Honda parent abs class extend child concrete classs
    // extend honda yazılarak Honda Classs a concrete bir Civic class tanımlandı
    // java CTE verdi
    // çözüm
    // a- olarak unimplemented (uyarlanmış) method implement edilmeli
    // b- parent Honda Class dan abstract keyword kaldırılmalı
    // c- concrete olan child Civic classs abstract tanımlanmalı

    //concrete class da abstract metyhod tanımlanır mı?


   // public abstract void absMethod (); ya class abs olmalı ya da method concrete body olmalı

    Civic cv = new Civic();


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

    public int vites () { // concrete child class method
        return 5;
    }
}
