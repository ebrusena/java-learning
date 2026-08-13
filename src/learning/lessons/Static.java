package learning.lessons;

public class Static {
    String name;  // her öğrencinin kendi ismi static değil
    static String school;

    public static void main(String[] args) {
        Static.school = "anadolu lisesi";

        Static ogrenci1 = new Static();
        ogrenci1.name = "sema";

        Static ogrenci2 = new Static();
        ogrenci2.name = "ebus";

        System.out.println(ogrenci1.name + " ---> " + Static.school);
        System.out.println(ogrenci2.name + " ---> " + Static.school);

        Static.school = "fen lisesi";

        System.out.println(ogrenci2.name + " ---> " + Static.school);
    }
}
class Veritabani {
    static String sunucuAdresi;

    // Static Blok: Sınıf belleğe yüklenir yüklenmez çalışır.
    static {
        System.out.println("1. STATIC BLOK ÇALIŞTI: Ayarlar yükleniyor...");
        sunucuAdresi = "192.168.1.100";
    }

    // Constructor (Yapıcı Metot): Her 'new' yapıldığında çalışır.
    public Veritabani() {
        System.out.println("3. CONSTRUCTOR ÇALIŞTI: Yeni nesne üretildi.");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("2. MAIN METODU BAŞLADI");

        // Nesne üretiyoruz
        Veritabani v1 = new Veritabani();
        Veritabani v2 = new Veritabani();
    }
}