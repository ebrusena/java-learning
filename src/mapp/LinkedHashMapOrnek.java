package mapp;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMapOrnek {
    static void main(String[] args) {
        Map<String,Double> siparisGecmisi = new LinkedHashMap<>();


        siparisGecmisi.put("laptop",3500.0);
        siparisGecmisi.put("mouse", 345.0);
        siparisGecmisi.put("phone",6500.0);

        siparisGecmisi.put("mouse", 500.0); // fiyat güncellenir.

        System.out.println("----sipariş geçmişi-----(ekleme sıralı)   ");
        for (Map.Entry<String , Double> siparis : siparisGecmisi.entrySet()){
            System.out.println("ürün  : "+ siparis.getKey()+"  fiyat  : "+ siparis.getValue());
        }


    }
}
