package Map;
//TreeMap: Implementeert de Map-interface
import java.util.TreeMap;
//tree map heeft volgorde maar hash map heeft niet volgorde
public class TreeMapExample {
    public static void main(String[] args) {
        // Een TreeMap maken en elementen toevoegen
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Apple", 10);
        treeMap.put("Banana", 5);
        treeMap.put("Orange", 8);

        //Een element opzoeken en de waarde afdrukken
        int quantityOfApple = treeMap.get("Apple");
        System.out.println("Antal appels: "+quantityOfApple);

        // Controleren of een sleutel aanwezig is in de TreeMap
        boolean containBanana = treeMap.containsKey("Banana"); //boolean gabruike voor true waaarde
        System.out.println("Bevat banana? "+containBanana);

        //De grootte van de TreeMap opvragen
        int size = treeMap.size();
        System.out.println("Grootte van de TreeMap: "+size);

        //Alle sleutels van de TreeMap afdrukken
        for (String key:treeMap.keySet()){
            System.out.println("Sleutel: "+key);
        }

        //Alle waarden van de TreeMap afdrukken
        for (int value:treeMap.values()){
            System.out.println("Waarde: "+value);
        }

        // De TreeMap leegmaken
        treeMap.clear();
        boolean isEmpty = treeMap.isEmpty();
        System.out.println("Is de TreeMap leeg? "+isEmpty);
    }
}
