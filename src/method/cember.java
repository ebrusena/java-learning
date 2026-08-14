package method;

public class cember {
    public static double cemberAlanHesapla(double yaricap){
        double hesap1 = Math.PI*yaricap*yaricap;
        return hesap1;
    }

    static void main(String[] args) {
        double sonuc = cemberAlanHesapla(10);
        System.out.println("Çemberin Alanı:"+ sonuc);

        System.out.println("Yarı çapı 2.5 olan çemberin alanı;"+cemberAlanHesapla(2.5));

    }
}
