package mapp;
import com.sun.source.tree.Tree;

import java.util.Map;
import java.util.TreeMap;


public class TreeMapOrnek {
    static void main(String[] args) {
        TreeMap<Integer,String> ogrenciler = new TreeMap<>();

        ogrenciler.put(105, "Zeynep");
        ogrenciler.put(101, "Ahmet");
        ogrenciler.put(108, "Mehmet");
        ogrenciler.put(103, "Ayşe");

        System.out.println(ogrenciler);

        System.out.println("Tüm öğrenciler (Numaraya göre sıralı)  ");
        for (Map.Entry<Integer, String> ogrenci : ogrenciler.entrySet()){
            System.out.println("Öğrenci no : "+ ogrenci.getKey()+"  İsim :"+ogrenci.getValue());
        }

        System.out.println("\n--------- özel sorgular --------------");

        System.out.println("en küçük numaralı öğrenci :"+ogrenciler.firstKey());
        System.out.println("en büyük numaralı öğrenci :"+ ogrenciler.lastKey());


        System.out.println("105ten küçük numaralar :"+ ogrenciler.headMap(105));
        System.out.println("103 ve üzeri numaralar :"+ ogrenciler.tailMap(103));


    }
}
