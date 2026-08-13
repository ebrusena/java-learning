package method;

public class Kare {
    public static void kareYazdir(int sayi){
        int sonuc = sayi*sayi;
        System.out.println(sayi+"sayının karesi:"+sonuc);
    }

    public static void toplamiYazdır(int sayi1, int sayi2){

        int toplam = sayi1 + sayi2;
        System.out.println("sayıların toplamı:"+toplam);
    }

    public static void main(String[] args) {
        toplamiYazdır(12,13);
        toplamiYazdır(11,44);
    }


}
