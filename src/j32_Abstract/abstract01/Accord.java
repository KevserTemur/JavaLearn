package j32_Abstract.abstract01;

public class Accord extends Honda {
    @Override
    public void motor() { // implement edilen abs method
        System.out.println("2,0 motorlu hız felakettir");

    }

    @Override
    void koltuk() { // implement edilen abs method
        System.out.println("deri koltur terletir");

    }

    @Override
    void sunrooff() { // override edilen concrete method
        System.out.println("çok havalı");
    }

    @Override
    void kapı() { // implement edilen abs method
        System.out.println("kapıları dikkatli kapat");

    }
}
