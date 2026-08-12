package learning.lessons;

import java.util.Scanner;

public class LessonSwitchCase {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------MarKitchen Menü------");
        System.out.println("1-Çorbalar");
        System.out.println("2-Et ve ana Yemekler");
        System.out.println("3-Tatlılar");
        System.out.println("Lütfen bir secim yapınız!(1,2,3)");


        int secim = scanner.nextInt();

        switch (secim){
            case 1:
                System.out.println("Seçiminiz: Mercimek Çorbası veya Ezogelin.");
                break;
            case 2:
                System.out.println("Seçiminiz: Köfte veya Tavuk Sote.");
                break;

            case 3:
                System.out.println("Seçiminiz: sütlaç veya soğuk baklava.");
                break;

            default:
                System.out.println("geçersiz secim....");
                break;
        }
        scanner.close();

    }
}
