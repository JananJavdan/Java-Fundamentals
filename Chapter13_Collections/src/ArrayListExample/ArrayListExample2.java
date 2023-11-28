package ArrayListExample;
import java.util.ArrayList;
public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Brussel");
        cities.add("Leuven");
        cities.add("Brugge");
        cities.add("gent");

        cities.add("Leuven");

        cities.add(3, "Genk");

        System.out.println("ArrayList -> ");
        cities.forEach(city -> System.out.println(city + " "));
    }
}
