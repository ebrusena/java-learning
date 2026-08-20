package sett;
import java.util.LinkedHashSet;
import java.util.Set;


public class LinkedHashSetOrnek {
    static void main(String[] args) {
        Set<String> izlemeGecmisi = new LinkedHashSet<>();

        izlemeGecmisi.add("java ders 1 : loops");
        izlemeGecmisi.add("java ders 2: hashlist");
        izlemeGecmisi.add("java ders 3 : arraylisy");
        izlemeGecmisi.add("java ders 4 : oop");

        //izlemeGecmisi.add("java ders 1 : loops"); // eklenmez listenin sırası bozulmaz.

        System.out.println("izleme geçmişi   (sırasıyla)");
        for (String ders : izlemeGecmisi){
            System.out.println("--"+ ders);
        }






    }
}
