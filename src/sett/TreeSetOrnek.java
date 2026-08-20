package sett;
import java.util.TreeSet;


public class TreeSetOrnek {
    static void main(String[] args) {
        TreeSet<Double> hisseFiyatlari = new TreeSet<>();

        hisseFiyatlari.add(150.0);
        hisseFiyatlari.add(48.0);
        hisseFiyatlari.add(33.0);
        hisseFiyatlari.add(23.0);
        hisseFiyatlari.add(5432.0);
        hisseFiyatlari.add(48.0);

        System.out.println("Tüm fiyatlar: (sıralı)  "+hisseFiyatlari);

        System.out.println("en ucuz hisse :"+ hisseFiyatlari.first());
        System.out.println("en pahalı hisse :"+hisseFiyatlari.last());

        System.out.println(hisseFiyatlari.size());

        System.out.println("89.0 dan ucuz bir fiyat:"+ hisseFiyatlari.lower(89.0));
        System.out.println("150.0 dan pahalı bir fiyat:"+ hisseFiyatlari.higher(150.0));

        System.out.println("40 ile 100 tl arası hisse fiyatları:"+ hisseFiyatlari.subSet(40.0,100.0));

        System.out.println("büyükten küçüğe sıralamsı: "+ hisseFiyatlari.descendingSet());

        System.out.println(hisseFiyatlari.tailSet(67.0));

    }
}
