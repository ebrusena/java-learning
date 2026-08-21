package mapp;
import java.util.*;

public class Baskent {
    static void main(String[] args) {

        HashMap b = new HashMap();
        b.put("Turkiye", "ankara");
        b.put("fransa","paris");
        b.put("ingiltere","londra");

        System.out.println(b);

        Set s = b.entrySet();
        Iterator i = s.iterator();

        while(i.hasNext()){
            Map.Entry item = (Map.Entry) i.next();
            System.out.println(item.getKey() + "-->"+ item.getValue());
        }



    }
}
