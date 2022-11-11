package j32_Abstract;

import j32_Abstract.abstract01.Civic;

public class C01_Abstract {

    /*
    1- bazı durumlarda child classlar parent class daki method ların bodylerini genellikle değiştirerek override ederler
    bu gibi durumlarda parent class daki methoda body tanımlamak ram ve memory acısından gereksizdir.
    çözüm olarak java parent class a body body siz -->> abstract (soyut) methodlar tanımlamıştır.

    2- Parent class'daki abstract methodlar app güvenliği açısından child class'da override edilmek zorundadır.
    eğer parent class'daki child class'ın mutlaka kullanması gereken method varsa abstract tanımlanmalı
    motor() her aracda olmalı.

     3- abstract method tanımlamak  için
      a) {} body olmaz
      b) access modief sonrası abstract keyword kullanılmalı
      c) abs method içinde abstract keyword ve {} body bir arada kullanılamaz aksi takdirde CTE verir
      abstrack class tanımlamak için class ifadesinden önce abstract keyword kullanılmalı.

    4- Abs method sadece abs Class'da tanımlanabilir kesinlikle concrete class'da abs method tanımlanamaz.
            ama abs class'da concerete emthod tanımlanabilir

     5- Abs Class içinde hem abs method hemm de concrete meethod ve variable tanımlanabilir

     6- bir concrete child classs parent abs abs class extend ettiğinde abs method ları implement
     ama concrete methotlar

     */



}
