package oop.project;

public class Calisan {
    private String isim;
    private double maas; //encapsulation

    public Calisan(String isim, double maas){
        this.isim=isim;
        this.maas=maas; // Super Class Constructor

    }
    public String getIsim(){
        return isim;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas){
        if(maas>0){
            this.maas=maas;
        }
    }

    public void bilgiVer(){
        System.out.println("çalısan:"+isim+ "-Maaş"+maas);

    }

    static void main(String[] args) {
        Yazilimci y1= new Yazilimci("ahmet",5000,"java");
        y1.bilgiVer(); // Çıktı: Yazılımcı: Ahmet - Dil: Java - Maaş: 50000.0

        // Setter kullanımı
        y1.setMaas(60000);
        System.out.println("Yeni Maaş: " + y1.getMaas());
    }
}
