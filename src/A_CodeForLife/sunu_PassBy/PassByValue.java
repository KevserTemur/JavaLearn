package A_CodeForLife.sunu_PassBy;

public class PassByValue {
    int num =48;

    public static void main(String[] args) {
        PassByValue obj = new PassByValue();
        System.out.println("değişimden önceki num : " + obj.num);
        obj.numChange(500);
        System.out.println("değişimden sonraki num : "+ obj.num);
    }
    public void numChange(int num) {
        num += 100;
    }
}
