package oop;

public class Overloading {

    public void selamVer() {
        System.out.println("Merhaba!");
    }

    public void selamVer(String isim) {
        System.out.println("Merhaba " + isim); // Boşluk eklendi
    }

    public static void main(String[] args) {
        // Nesne kendi sınıfından (Overloading) oluşturulur
        Overloading m = new Overloading();

        m.selamVer();          // Çıktı: Merhaba!
        m.selamVer("Ahmet");   // Çıktı: Merhaba Ahmet
    }
}