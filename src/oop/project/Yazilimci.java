package oop.project;

public class Yazilimci extends Calisan{
    private String yazilimDili;

    public Yazilimci(String isim, double maas, String yazilimDili) {
        super(isim, maas); // Üst sınıfın (Calisan) constructor'ını çağırır
        this.yazilimDili = yazilimDili;
    }

    // Metot Override: Üst sınıftaki bilgiVer metodunu eziyoruz
    @Override
    public void bilgiVer() {
        // getIsim() ve getMaas() metotlarıyla private alanlara eriştik
        System.out.println("Yazılımcı: " + getIsim() + " - Dil: " + yazilimDili + " - Maaş: " + getMaas());
    }

}
