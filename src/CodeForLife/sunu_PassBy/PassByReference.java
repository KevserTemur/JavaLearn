package CodeForLife.sunu_PassBy;

public class PassByReference {
    public int number2;

    public void change (PassByReference reference){

        reference= new PassByReference();

        reference.number2 = reference.number2 +3;
        // reference.number2 = 9;


    }


}
