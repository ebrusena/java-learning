package listyapisi;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ArrayListOrnek {
    static void main(String[] args) {
        List<String> sehirler = new ArrayList<>();

        sehirler.add("istanbu");
        sehirler.add("yozgat");
        sehirler.add("muğla");

        sehirler.add(1, "bursa"); //araya eleman ekleme

        System.out.println("2. indexteki şehir:"+ sehirler.get(2));//indexlere erişme

        sehirler.set(0 , "kocaeli"); //eleman güncelleme.

        sehirler.remove("muğla");
        System.out.println(sehirler.get(2));
        sehirler.remove(0);

        System.out.println("liste boyutu"+ sehirler.size());
        String s = sehirler.get(0);
        System.out.println(s);
        sehirler.add("ankara");
        sehirler.add("izmir");
        sehirler.add("sakarya");
        System.out.println(sehirler);
    }

}
