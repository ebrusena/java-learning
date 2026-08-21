package method;

public class Kare {
    public static void kareYazdir(int sayi){
        int sonuc = sayi*sayi;
        System.out.println(sayi+"sayının karesi:"+sonuc);
    }

    public static int toplamiYazdır(int sayi1, int sayi2, int sayi3){

        int toplamçarpım = (sayi1 + sayi2)*sayi3;
        return toplamçarpım;

    }

    public static void main(String[] args) {

        int gelenSonuc= toplamiYazdır(10,10,15);
        System.out.println("sonuc:"+gelenSonuc);



       // toplamiYazdır(12,13);
        //toplamiYazdır(11,44);
    }


}
