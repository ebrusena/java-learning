package listyapisi;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class AlisverisSepeti {
    static void main(String[] args) {
        List<String> sepet= new ArrayList<>();

        sepet.add("iphone 16");
        sepet.add("kiko 223");
        sepet.add("fare");
        sepet.add("airpods");
        System.out.println(sepet);

        sepet.add(0 ,"monitör"); // 0. indexe ekler diğerlerini sağa kaydırır.
        System.out.println(sepet);

        if(sepet.contains("airpods")){ //contains indexOf ile ürün kontrolü
            int sira = sepet.indexOf("airpods");
            System.out.println("sepetinizde airpods mevcut->(sırası;"+sira+")");
        }

        int fareIndex = sepet.indexOf("fare");
        if(fareIndex!=-1){
            sepet.set(fareIndex, "kablosuz fare");
        }

        sepet.remove("kiko 223");

        Collections.sort(sepet);

        System.out.println("\n--- GÜNCEL ALIŞVERİŞ SEPETİNİZ (" + sepet.size() + " Ürün) ---");
        System.out.println(sepet);
        for(int i =0; i< sepet.size(); i++){
            System.out.println((i+1)+"."+ sepet.get(i));

        }
        System.out.println("sepet boş mu "+ sepet.isEmpty());



    }
}
