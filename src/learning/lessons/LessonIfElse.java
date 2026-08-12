package learning.lessons;

public class LessonIfElse{

    public static void main(String[] args) {
        System.out.println("--------EHLİYET KONTROLÜ----------");
        ehliyetKontrolu();

        System.out.println("\n -------NOT HESAPLAMA--------------");
        notHesaplama();

    }

    public static void ehliyetKontrolu(){
        int age = 21;
        if (age>=18){
            System.out.println("ehliyet alabilirsiniz.");
        }else{
            System.out.println("yaşınız yetersiz");
        }

    }

    public static void notHesaplama(){
        int examScore = 75;
        if (examScore>=70){
            System.out.println("harf notunuz: AA");
        } else if (examScore>=50) {
            System.out.println("harf notunuz:BB");
        } else if (examScore>=40) {
            System.out.println("harf notunuz:CC");
        }else{
            System.out.println("kaldınız:FF");
        }
    }
}

