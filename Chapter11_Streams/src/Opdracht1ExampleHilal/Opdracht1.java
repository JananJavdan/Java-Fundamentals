package Opdracht1ExampleHilal;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Opdracht1 {

   

    public List toUpperCase(List<String> strings) { return strings.stream() .map(String::toUpperCase) .collect(Collectors.toList()); } 


    public List filterA(List<String>  strings) { return strings.stream() .filter(s -> s.startsWith("a")) .collect(Collectors.toList()); }



    public List filterB(List<String>  strings) { return strings.stream() .filter(s -> s.startsWith("a")) .filter(s -> s.length() > 3) .collect(Collectors.toList()); }



    public List filterC(List<String>  strings) { return strings.stream() .filter(s -> s.startsWith("a")) .filter(s -> s.length() > 3) .sorted(Comparator.reverseOrder()) .collect(Collectors.toList()); }



    public String filterD(List<String> strings) { return strings.stream() .filter(s -> s.startsWith("a")) .filter(s -> s.length() > 3) .sorted(Comparator.reverseOrder()) .collect(Collectors.joining(",")); }



    public String filterE(List<String> strings) { return strings.stream() .filter(s -> s.startsWith("a")) .filter(s -> s.length() > 3) .sorted(Comparator.reverseOrder()) .map(String::toUpperCase) .collect(Collectors.joining(",")); }



    public String filterF(List<String> strings) { return strings.stream() .filter(s -> s.startsWith("a")) .filter(s -> s.length() > 3) .sorted(Comparator.reverseOrder()) .map(String::toUpperCase) .map(s -> s.substring(0, Math.min(s.length(), 10))) .collect(Collectors.joining(",")); }



    public String filterG(List<String> strings) { return strings.stream() .filter(s -> s.startsWith("a")) .filter(s -> s.length() > 3) .sorted(Comparator.reverseOrder()) .map(String::toUpperCase) .map(s -> s.substring(0, Math.min(s.length(), 10))) .map(s -> "prefix_" + s + "_suffix") .collect(Collectors.joining(",")); }



    public String filterH(List<String> strings) { AtomicInteger counter = new AtomicInteger(0); return strings.stream() .filter(s -> s.startsWith("a")) .filter(s -> s.length() > 3) .sorted(Comparator.reverseOrder()) .map(String::toUpperCase) .map(s -> s.substring(0, Math.min(s.length(), 10))) .map(s -> "prefix_" + s + "_suffix" + counter.getAndIncrement()) .collect(Collectors.joining(",")); }



    public String filterI(List<String> strings) { AtomicInteger counter = new AtomicInteger(0); return strings.stream() .filter(s -> s.startsWith("a")) .filter(s -> s.length() > 3) .sorted(Comparator.reverseOrder()) .map(String::toUpperCase) .map(s -> s.substring(0, Math.min(s.length(), 10))) .map(s -> "prefix_" + s + "_suffix"+ counter.getAndIncrement()) .map(s -> s + '_' + new Random().nextInt(100)) .collect(Collectors.joining(",")); }


}
