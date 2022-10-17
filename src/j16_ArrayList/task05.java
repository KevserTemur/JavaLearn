package j16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task05 {
    public static List<String> main(String[] args) {
        /*TASK :
2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
   Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

 */

        String isimArr [][] = {{"Ali", "Veli", "Ayse"},{"Hasan","Can"},{"Suzan"}};
        List<String> isimList= new ArrayList<>(); // boş list
        for (int i = 0; i < isimArr.length; i++) {//kat kontrolu
            for (int j = 0; j < isimArr[i].length; j++) {// her katın daire kontrolu
                isimList.add(isimArr[i][j]);//her katın her dairesindeki eleman döngü ile alınıp boş liste atandı
            }
        }
        System.out.println("isimList = " + isimList);//sırlama öncesi ->[Ali, Veli, Ayse, Hasan, Can, Suzan]

        Collections.sort(isimList);//isimList maturel sıralandı
        System.out.println("isimList = " + isimList);//sıralama sonrası ->[Ali, Ayse, Can, Hasan, Suzan, Veli]
        return isimList;

    }
}
