package method;

public class methods {
    public static double kdvhesapla(double  urunFiyati){
        double kdvMiktari = urunFiyati * 0.20;
        double toplamFiyat = urunFiyati + kdvMiktari;

        return toplamFiyat;



    }

    static void main(String[] args) {
        double ayakkabiSonFiyati = kdvhesapla(1000);
        System.out.println("ayakkabının kdvli fiyatı"+ayakkabiSonFiyati+"Tl'dir.");

        double telefonSonFiyat = kdvhesapla(1111567);
        System.out.println("telefonun kdvli fiyatı"+telefonSonFiyat+"Tl");
    }
}

