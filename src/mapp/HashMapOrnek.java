package mapp;
import java.util.HashMap;
import java.util.Map;

public class HashMapOrnek {
    static void main(String[] args) {
        Map<Integer, String> plakalar = new HashMap<>();

        plakalar.put(34, "istanbul");
        plakalar.put(41, "kocaeli");
        plakalar.put(66,"yozgat");
        plakalar.put(35, "izmir");
        plakalar.put(48, "muğla");

        plakalar.put(34, "34-istanbul");

        System.out.println("66 plaka  -->   "+ plakalar.get(66)); // eleman kontrolü.

        if (plakalar.containsKey(35)){
            System.out.println("35 plakasistemde mevcut");
        }

        System.out.println("\n------   plaka listesi (sırasız) --------- ");

        for (Map.Entry<Integer, String> giris : plakalar.entrySet()){
            System.out.println("plaka : "+ giris.getKey() +"--> sehir  : "+ giris.getValue());
        }

    }
}
