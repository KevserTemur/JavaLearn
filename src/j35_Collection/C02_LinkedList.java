package j35_Collection;

import java.util.LinkedList;

class C02_LinkedList {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();//DatatypeObject(HZ.Adem)-> ne olursan ol gel
        //Bad practice app. çok yavaşlar tavsiye edilmez :cısss...
        list.add("Nazım");
        list.add('$');
        list.add(1453);
        System.out.println("list = " + list);//[Nazım, $, 1453]
    }
}