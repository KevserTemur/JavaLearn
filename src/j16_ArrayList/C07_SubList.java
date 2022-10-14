package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_SubList {
    public static void main(String[] args) {
        // subList --->    list in istenen list parçasını return eder

        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih", "losAngeles", "Londra", "stockholm", "ankara", "hatay"));
        System.out.println(listSehir.subList(3,5));

        ArrayList<String> city=new ArrayList<>(listSehir.subList(2,5));//listSehir'den 2.3.4. index eelamnalrı city liste atandı.
        System.out.println("city = " + city);//city = [Londra, stockholm, Angara]






    }
}
