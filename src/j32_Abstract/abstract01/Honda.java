package j32_Abstract.abstract01;

public abstract class Honda { // parent abstract class

    public abstract void motor();
    void sunrooff(){
        System.out.println("sunroofa extra ücret gerek");
    }

    // abstract class da variable tanımlanabilir mi?
    String name = "kevser temür";

    // variable lar abs olur mu
    // public abstract int yas = 48; --->>> kesinlikle hayır


    abstract void koltuk ();
    abstract void kapı();

  // final void finalMethod (); // concrete method body siz olamaz
  // final abstract void finalMethod (); // abs method final olamaz

 //  private void privateMethod(); // concrete method body siz olamaz
 //  private abstract void privateMethod(); abs method private olamaz

  // static void gunesMethod ();// concrete method body siz olamaz
  // static abstract void gunesMethod ();abs method private olamaz
    //Honda obj=new Honda();//melekler doğurmaz abs class obj uretmez...

}
