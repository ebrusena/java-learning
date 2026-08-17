package oop;

public class BankaHesabı {
    private String hesapSahibi;
    private double bakiye;


    public BankaHesabı(String hesapSahibi, double baslangicbakiyesi){
        this.hesapSahibi=hesapSahibi;
        if (baslangicbakiyesi>=0){
            this.bakiye=baslangicbakiyesi;
        }

    }
//getter
    public double getBakiye() {
        return bakiye;
    }

    public String getHesapSahibi() {
        return hesapSahibi;
    }
    //setter
    public void paraYatir(double miktar) {
        if (miktar > 0) {
            bakiye += miktar;
            System.out.println(miktar + " TL yatırıldı. Güncel bakiye: " + bakiye);
        } else {
            System.out.println("Geçersiz miktar!");
        }
    }

    public void paraCek(double miktar) {
        if (miktar > 0 && miktar <= bakiye) {
            bakiye -= miktar;
            System.out.println(miktar + " TL çekildi. Kalan bakiye: " + bakiye);
        } else {
            System.out.println("Yetersiz bakiye veya geçersiz tutar!");
        }
    }
}
