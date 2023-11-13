package Streams;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class StreamMain {
    public static void main(String[] args) {
        List<String> myPlaces = new ArrayList<>();
        myPlaces.add("Nepal, kathmandu");
        myPlaces.add("Nepal, Pokhara");
        myPlaces.add("India, Delhi");
        myPlaces.add("USA, New York");
        myPlaces.add("Africa, Nigeria");

        System.out.println("Place from Nepal:");

        //filter place nepal
        myPlaces.stream()
                .filter((p) -> p.startsWith("Nepal"))
                .map((p) -> p.toUpperCase())
                .forEach((p) -> System.out.println(p));

        myPlaces.stream()
                .filter((p)-> p.startsWith("Africa"))
                .map((p)-> p.toLowerCase())
                .forEach((p) -> System.out.println(p));


        List<String> names = Arrays.asList("Jai", "Mehesh", "Vishe", "Hemesh","Neren");
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
