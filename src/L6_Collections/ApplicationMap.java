package L6_Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ApplicationMap {
    public static void main(String[] args) {
        // HashMap = listeaza elementele dezordonat
        // LinkedHashMap = listeaza elementele in ordinea descrisa de noi
        // TreeMap = listeaza element cheie in ordine alfabetica
        TreeMap<String, String> dictionary = new TreeMap<String, String>();
        dictionary.put("Brave", "Ready to face and endure danger or pain; showing courage.");
        dictionary.put("Brilliant", "the brilliant lights of the city");
        dictionary.put("Joy", " a person or thing that causes happiness.");
        dictionary.put("Confidence", "the feeling or belief that one can have faith in or rely on something.");

//        for (String word: dictionary.keySet()){
//            System.out.println(word);
//            System.out.println(dictionary.get(word));
//        }
        for (Map.Entry<String, String> entry: dictionary.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
