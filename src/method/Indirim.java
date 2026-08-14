package method;

public class Indirim {
    public static double indirimliFiyatHesapla(double hamFiyat, int indirimYüzdesi){
        if(indirimYüzdesi<=0 || indirimYüzdesi>=100){
            System.out.println("geçersiz indirim!");
            return -1.0;
        }
        double indirimMiktarı = hamFiyat*indirimYüzdesi/100.0;
        double indirimliFiyat = hamFiyat-indirimMiktarı;

        return indirimliFiyat;

    }

    static void main(String[] args) {
        double sonuc1= indirimliFiyatHesapla(1000.0,15);
        if(sonuc1!= -1.0){
            System.out.println("indirimli fiyat:"+sonuc1);
        }

        System.out.println("-------------------------------");

        double sonuc2 = indirimliFiyatHesapla(6780,444);
        if(sonuc2!= -1.0){
            System.out.println("indirimli fiyat"+ sonuc2);
        }

    }

}
