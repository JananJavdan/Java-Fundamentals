package Set;
//HashSet
import java.util.HashSet;
//met hash set de volgorde niet belangrijk(met hashset random sortetren)
public class HashSetExample {
    public static void main(String[] args) {
        // Een HashSetmaken en elementen toevoegen
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple");// Duplicate element, wordt genegeerd

        System.out.println("HashSet:" +set);//[Apple, Orange, Banana]

        //Controleren of een element in de HashSet zit
        boolean containsApple = set.contains("Apple");
        System.out.println("ContainsApple?" +containsApple);//true

        //Een element uit de HashSet verwijderen
        boolean removed = set.remove("Orange");
        System.out.println("Removed Orange?" +removed);//true

        // De grootte van de HashSet opvragen
        int size = set.size();
        System.out.println("Size of HashSet:" +size);//2

        // De HashSetleegmaken
        set.clear();
        boolean isEmpty = set.isEmpty();
        System.out.println("Is HashSet empty?" +isEmpty);//true
}
}
