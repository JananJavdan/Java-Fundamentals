package Les2Example;

import java.util.LinkedList;

public class LinkedExample2 {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Brussel");
        cities.add("Leuven");
        cities.add("Brugge");
        cities.add("Gent");
//we voegen een herhalen element toe
        cities.add("Leuven");
// we voegen een element toe aan de index die we willen
        cities.add(3,"Genk");

        System.out.println("LinledList -> ");
        cities.forEach(city -> System.out.println(city + " ")); // met iterartor kunnen index zien maar met fpr each de index kan niet zien
    }
}
