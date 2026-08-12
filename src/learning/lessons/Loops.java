package learning.lessons;

import java.util.Scanner;

public class Loops {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gizliSayi= 7;
        int tahmin = 0;

        while(tahmin != gizliSayi){
            System.out.println("1 ile 10 arası sayı tahmin edin.");
            tahmin =scanner.nextInt();

        }
        System.out.println("Tebrikler, doğru tahmin!");


    }
}
