package oop;
// Üst Sınıf (Superclass)
class Kisi {
    String isim;

    // Üst sınıf parametreli constructor
    public Kisi(String isim) {
        this.isim = isim;
        System.out.println("Kisi constructor çalıştı: " + isim);
    }
}

// Alt Sınıf (Subclass)
class Ogrenci extends Kisi {
    int ogrenciNo;

    public Ogrenci(String isim, int ogrenciNo) {
        super(isim); // 1. Üst sınıfın Kisi(String isim) constructor'ını çağırır (İLK SATIR)

        this.ogrenciNo = ogrenciNo; // 2. Kendi alanını başlatır
        System.out.println("Ogrenci constructor çalıştı: No " + ogrenciNo);
    }
}

