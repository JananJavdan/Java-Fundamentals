package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Een Map maken en elementen toevoegen
        //string is de key integer is value //interface "map" als een referance (polymorphisem) hasp implementeerd map
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25); //"put" om element toe te voegen (list = add) (set= offer)
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // Een element opzoeken en de waarde afdrukken
        int ageOfAlice = map.get("Alice");
        System.out.println("Leeftijd van Alice:"+ageOfAlice);

        // Controleren of een sleutel aanwezig is in de Map
        boolean containBob = map.containsKey("Bob");
        System.out.println("Bevat bob?"+containBob);

        // De grootte van de Map opvragen
        int size = map.size();
        System.out.println("Grootte van de Map:" +size);

        //Alle sleutels van de Map afdrukken
        for (String key : map.keySet()){  //methode kayset belangrijk is
            System.out.println("Sleutel: "+key);
        }

        //alle waarde van de map afdrukken
        for (int value : map.values()){ //methode values belangrijk is
            System.out.println("Waarde: "+value);
        }

        //De Map leegmaken
        map.clear();
        boolean isEmpty = map.isEmpty();
        System.out.println(" Is de map leeg? "+isEmpty);
    }
    //Veelgebruikte Map-methoden
    //● put(key, value): Voegt een sleutel-waardepaar toe aan de Map.
    //● get(key): Haalt de waarde op die is geassocieerd met de opgegeven sleutel.
    //● containsKey(key): Controleert of de opgegeven sleutel aanwezig is in de Map.
    //● remove(key): Verwijdert het sleutel-waardepaar met de opgegeven sleutel.
}
