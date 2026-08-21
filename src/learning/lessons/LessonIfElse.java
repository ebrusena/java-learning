package learning.lessons;

import Students.Student;

import java.util.Scanner;

public class LessonIfElse {

    public static void main(String[] args) {
        System.out.println("--------EHLİYET KONTROLÜ----------");
        ehliyetKontrolu();

        System.out.println("\n -------NOT HESAPLAMA--------------");
        notHesaplama();

        System.out.println("\n---------kullanıcı girdili ehliyet kontrolü-------");
        kullaniciEhliyetKontrolu();

    }


    public static void ehliyetKontrolu() {
        int age = 21;
        if (age >= 18) {
            System.out.println("ehliyet alabilirsiniz.");
        } else {
            System.out.println("yaşınız yetersiz");
        }

        Student currentStudent = new Student("ITU",4,"Ebru", "Unsal");
        var name = currentStudent.getName();

    }

    public static void notHesaplama() {
        int examScore = 75;
        if (examScore >= 70) {
            System.out.println("harf notunuz: AA");
        } else if (examScore >= 50) {
            System.out.println("harf notunuz:BB");
        } else if (examScore >= 40) {
            System.out.println("harf notunuz:CC");
        } else {
            System.out.println("kaldınız:FF");
        }
    }
    //Yeni eklediğim metot
    public static void kullaniciEhliyetKontrolu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen yaşınızı giriniz:");
        int age = scanner.nextInt();

        System.out.println("Sağlık raporunuz var mı? (true/false)");
        boolean saglikRaporuVarMı = scanner.nextBoolean();

        if (age >= 18 && saglikRaporuVarMı) {
            System.out.println("Sonuç: ehliyet alabilirsiniz.");
        } else if (age < 18) {
            System.out.println("Sonuç: Yaşınız 18'den küçük olduğu için ehliyet alamazsınız.");

        } else {
            System.out.println("Sonuç: Yaşınız uygun ancak sağlık raporunuz olmadığı için ehliyet alamazsınız.");
        }

    }
}

