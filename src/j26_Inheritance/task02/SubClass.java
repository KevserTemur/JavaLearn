package j26_Inheritance.task02;

public class SubClass {

    public class subClass extends SuperClass{
        public void main(String[] args) {
            SubClass obj=new SubClass();
            obj.my_method();
        }
        int  num= 10;
        public  void my_method(){
            goster();//SubClass call
            super.goster();//superClass call
            System.out.println("subClss num :"+num);
            System.out.println("SuperClss num :"+super.num);
        }

        public  void goster(){
            System.out.println("Bu method Sub classsın görüntülenme methodudur. ");
        }
//@Override
//  public void goster() {
//     System.out.println("Bu method Sub classsın görüntülenme methodudur. ");
//  }
    }

    private void my_method() {

    }
}
