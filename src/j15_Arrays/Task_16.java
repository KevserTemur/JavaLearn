package j15_Arrays;

public class Task_16 {
    public static void main(String[] args) {
        //TASK -->   arraydeki son elemanların çarpımını kontrol eden code

        int sayi[][]= {{1,2,3},{9,8},{24,0,4}};
        int çarpım =1;
        for (int kat = 0; kat < sayi.length; kat++) {
            çarpım *= sayi[kat][sayi[kat].length-1];
            System.out.println(çarpım);
            }
        }
    }
