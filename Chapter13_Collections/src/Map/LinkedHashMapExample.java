package Map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Een LinkedHashMap maken en elementen toevoegen
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Apple", 10);
        linkedHashMap.put("Banana", 5);
        linkedHashMap.put("Orange", 8);

        //Een element opzoeken en de waarde afdrukken
        int quantityOfApple = linkedHashMap.get("Apple");
        System.out.println("Antal apple: "+quantityOfApple);

        // Controleren of een sleutel aanwezig is in de LinkedHashMap
        boolean containBanana = linkedHashMap.containsKey("Banana");
        System.out.println("bevat banana? "+containBanana);

        // De grootte van de LinkedHashMap opvragen
        int size = linkedHashMap.size();
        System.out.println("Grootte van LinkedHashMap: "+size);

        //Alle sleutels van de LinkedHashMap afdrukken
        for (String key:linkedHashMap.keySet()){
            System.out.println("Sleutel: "+key);
        }
        //Alle waarden van de LinkedHashMap afdrukken
        for (int value : linkedHashMap.values()){
            System.out.println("Waarde: "+value);
        }
        //De LinkedHashMap leegmaken
        linkedHashMap.clear();
        boolean isEmpty = linkedHashMap.isEmpty();
        System.out.println("Is de LinkedHashMap leeg? "+isEmpty);
    }
}
    //Veelgebruikte Map-methoden

