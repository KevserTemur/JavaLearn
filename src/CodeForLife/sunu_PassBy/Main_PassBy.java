package CodeForLife.sunu_PassBy;



public class Main_PassBy {
    public static void main(String[] args) {

        int number =5;

        System.out.println("previous value of number : " +number);

       change (number);

        System.out.println("current value of number :" +number);

        PassByReference reference =new PassByReference();

        reference.number2 = 7;

        System.out.println("previous value of number2 : " +reference.number2);

        reference.change(reference);

        System.out.println("current value of number2 : " +reference.number2);

        int [] array = new int [] {2,4,6};

        System.out.println("first element of array : " +array[0]);

        ArrayAsAReference arrayAsAReference = new ArrayAsAReference();

        arrayAsAReference.changeTheArray (array);

        System.out.println("current value of first element : " + array [0]);


    }

    public static void change(int number) {

        number = number +5;
    }

}
