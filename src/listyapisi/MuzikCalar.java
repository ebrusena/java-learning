package listyapisi;
import java.util.LinkedList;


public class MuzikCalar {
    static void main(String[] args) {
        LinkedList<String> calmaListesi = new LinkedList<>();


        calmaListesi.add("espresso");
        calmaListesi.add("end of the begging");
        calmaListesi.add("sweater weather");

        calmaListesi.addFirst("neredesin sen");
        calmaListesi.addLast("sürmeli");

        System.out.println("şuan calacak sarkı:"+calmaListesi.peekFirst());

        String calinanSarkı = calmaListesi.pollFirst();
        System.out.println("şimdi çalıyor------>  "+calinanSarkı);

        String sonrakiSarki = calmaListesi.pollFirst();
        System.out.println("şimdi çalıyor------->  "+sonrakiSarki);

        System.out.println("\n--- KUYRUKTA KALAN ŞARKILAR (" + calmaListesi.size() + " Adet) ---");
        for (String sarki : calmaListesi) {
            System.out.println("🎵 " + sarki);
        }

    }
}
