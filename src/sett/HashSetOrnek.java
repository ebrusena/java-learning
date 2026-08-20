package sett;

import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class HashSetOrnek {
    static void main(String[] args) {
        Set<String> epostalar = new HashSet<>(); // set arayüzü ile hashset oluşturma.

        epostalar.add("ahmet@gmail.com");
        epostalar.add("mehmet@gmail.com");
        epostalar.add("ayse@gmail.com");

        boolean eklendMi = epostalar.add("ahmet@gmail.com");
        //zaten var old için false döner duplicate olmaz.
        System.out.println("aynı e posta eklenid mi  "+ eklendMi);

        if (epostalar.contains("ayse@gmail.com")){
            System.out.println("ayse sistemde kayıtlı");
        }
        epostalar.remove("ahmet@gmail.com");
        System.out.println(epostalar);

        for (String eposta: epostalar){
            System.out.println("--"+eposta);
        }


        //
        List<String> tekrarLiListe = List.of("Ali", "Veli", "Ali", "Ayşe", "Veli");

// Listeyi HashSet'e çevirerek tüm tekrarları tek hamlede temizliyoruz:
        Set<String> benzersizListe = new HashSet<>(tekrarLiListe);

        System.out.println(benzersizListe); // Çıktı: [Ali, Ayşe, Veli] (Sıra değişebilir)




    }
}
