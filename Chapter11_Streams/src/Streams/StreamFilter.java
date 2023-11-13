package Streams;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
public class StreamFilter {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("jai");
        names.add("Vivek");
        names.add("Mahesh");
        names.add("Vishal");
        names.add("Naren");
        names.add("Hemant");


       // usine string en lambda expression
        long count = names.stream().filter(str->str.length()<5).count();
        System.out.println(count+"string with lenght less dan 5");
    }
}
