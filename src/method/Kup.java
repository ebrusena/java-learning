package method;

public class Kup {
    public static int kupAl(int sayi1){
        int sonuc = sayi1*sayi1*sayi1;
        return sonuc;

    }

    public static void main(String[] args) {
        int gelenSonucc= kupAl(3);
        System.out.println("sonuc"+gelenSonucc);
    }
}
