public class Hesap {

    // 1. METOT: Not Ortalamasını Hesaplar
    // 3 adet tam sayı alır, sonucu double (ondalıklı) olarak GERİ DÖNDÜRÜR.
    public static double notHesapla(int vize1, int vize2, int finalNotu) {
        double ortalama = (vize1 * 0.30) + (vize2 * 0.30) + (finalNotu * 0.40);
        return ortalama; // Hesaplanan sonucu çağrıldığı yere teslim eder
    }

    // 2. METOT: Durumu Ekrana Yazdırır
    // Öğrenci adını ve ortalamayı alır, ekrana basar. Geriye değer DÖNDÜRMEZ (void).
    public static void durumuYazdir(String ogrenciAdi, double ortalama) {
        if (ortalama >= 50) {
            System.out.println(ogrenciAdi + " dersi GEÇTİ. (Ortalama: " + ortalama + ")");
        } else {
            System.out.println(ogrenciAdi + " dersten KALDI. (Ortalama: " + ortalama + ")");
        }
    }

    public static void main(String[] args) {
        // --- 1. Öğrenci için test edelim ---
        String ogrenci1 = "Ahmet";

        // notHesapla metodunu çağırıyoruz. Metot bize 59.0 sonucunu dönecek.
        double ahmetOrtalama = notHesapla(60, 70, 50);

        // Elde ettiğimiz bu ortalamayı durumuYazdir metoduna veriyoruz.
        durumuYazdir(ogrenci1, ahmetOrtalama);


        // --- 2. Öğrenci için test edelim (Metotları tek satırda da bağlayabilirsin) ---
        double ayseOrtalama = notHesapla(30, 40, 40);
        durumuYazdir("Ayşe", ayseOrtalama);
    }
}