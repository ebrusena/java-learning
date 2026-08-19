package listyapisi;
import java.util.LinkedList;

public class LinkedListOrnek {
    static void main(String[] args) {
        LinkedList<String> musteriKuyrugu = new LinkedList<>();
        musteriKuyrugu.add("yasar");
        musteriKuyrugu.addFirst("liza");
        musteriKuyrugu.addLast("sena");
        musteriKuyrugu.add("mehmet");
        musteriKuyrugu.add("yaz");


        System.out.println("ilk sıradaki müsteri:"+musteriKuyrugu.getFirst());
        System.out.println("son sıradaki müşteri:"+musteriKuyrugu.getLast());

        musteriKuyrugu.remove("liza");
        System.out.println(musteriKuyrugu);


        musteriKuyrugu.add(1, "can");

        System.out.println("\ngüncel kuyruk:");
        for (String musteri : musteriKuyrugu){
            System.out.println("-"+musteri);
        }


    }
}
