package method;

public class Dikdortgen {

    public static int alanHesapla(int kisaKenar, int uzunKenar){
        int alan = kisaKenar*uzunKenar;
        return alan;
    }

    static void main(String[] args) {
        int bahceAlanı = alanHesapla(10,15);
        System.out.println("Bahçenin Alanı--->"+bahceAlanı+"m²");


        int ofisAlanı = alanHesapla(124,6543);
        System.out.println("Ofisin Alanı--->"+ofisAlanı+"m2");
    }
}
