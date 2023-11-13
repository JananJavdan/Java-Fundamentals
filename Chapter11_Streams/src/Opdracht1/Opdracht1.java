package Opdracht1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Opdracht1 {
//Method1
    public List<String> toUpperCase(List<String>strings){//De methode toUpperCase accepteert een lijst van Strings als parameter
        return strings.stream()//retourneert een nieuwe lijst van Strings waarbij alle Strings in hoofdletters zijn.
                .map(String::toUpperCase)//map methode gebruiken om elke String in de lijst om te zetten naar hoofdletters
                .collect(Collectors.toList());//-methode gebruiken om de resultaten terug te geven als een nieuwe lijst van Strings
    }
//Method2
    public List<String> filterA(List<String>strings){//De methode filterA accepteert een lijst van Strings als parameter
        return strings.stream() //en retourneert een nieuwe lijst van Strings
                .filter(s -> s.startsWith("a"))//filter-methode gebruikt om alleen de Strings te behouden die beginnen met een ‘a’.
                .collect(Collectors.toList());//collect methode gebruikt om de resultaten terug te geven als een nieuwe lijst van Strings.
    }
//Method3
    public List<String> filterB(List<String>strings){//De methode filterB accepteert een lijst can String als parameter
        return strings.stream()
                .filter(s -> s.startsWith("a") && s.length()>3)//filter-methode gebruikt om  de Strings te behouden die beginnen met ‘a’ en langer dan 3
                .collect(Collectors.toList());//om resultaat terug tegeven als een nieuwe list van string
    }
//Method4
    public List<String> filterC(List<String>strings){
        return strings.stream()
                .filter(s -> s.startsWith("a") && s.length()>3)
                .sorted(Comparator.reverseOrder()) //wordt gebruikt om een stream van elementen in omgekeerde volgorde te sorteren
                .collect(Collectors.toList());
    }
//Method5
    public String filterD(List<String>strings){
        return strings.stream()
                .filter(s -> s.startsWith("a") && s.length()>3)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(","));// collect-methode gebruikt om de resultaten terug te geven als een nieuwe string, waarbij de Strings worden gescheiden door een komma
    }
//Method6
    public String filterE(List<String>strings){
        return strings.stream()
                .filter(s -> s.startsWith("a") && s.length()>3)
                .sorted(Comparator.reverseOrder())
                .map(String::toUpperCase) //map-methode opnieuw gebruikt om elke String om te zetten naar hoofdletters.
                .collect(Collectors.joining(","));
    }
//Method7
    public String filterF(List<String>strings){
        return strings.stream()
                .filter(s -> s.startsWith("a") && s.length()>3)
                .sorted(Comparator.reverseOrder())
                .map(String::toUpperCase)
                .map(s -> s.substring(0,Math.min(s.length(),10))) //map-methode gebruiken om elke String in de stream af te korten tot 10 karakters.
                .collect(Collectors.joining(","));
    }
//Method8
    public String filterG(List<String>strings){
        return strings.stream()
                .filter(s -> s.startsWith("a") && s.length()>3)
                .sorted(Comparator.reverseOrder())
                .map(String::toUpperCase)
                .map(s -> s.substring(0,Math.min(s.length(),10)))
                .map(s -> " prefix " +s+ "suffix") //map-methode gebruikt om de String te voorzien van een prefix en een suffix. we willen een prefix en een suffix toevoegen aan elke String in de stream
                .collect(Collectors.joining(","));
    }
//Method9
    public String filterH(List<String>strings){
        AtomicInteger counter = new AtomicInteger();//een nieuwe instantie van de AtomicInteger-klasse gemaakt en gebruikt om de unieke nummers te genereren
        return strings.stream()
                .filter(s -> s.startsWith("a") && s.length()>3)
                .sorted(Comparator.reverseOrder())
                .map(String::toUpperCase)
                .map(s -> s.substring(0,Math.min(s.length(),10)))
                .map(s -> " prefix " +s+ " sufix ")
                .map(s -> s +counter.getAndIncrement() + " : " +s+ " . " + counter.get()) //map-methode gebruikt om een uniek nummer gevolgd door een dubbele punt door de variabele counter die gedefineerd in de methode
                .collect(Collectors.joining(","));
    }
//Method10
    public String filterI(List<String>strings){
        AtomicInteger counter = new AtomicInteger();
        Random random = new Random();  //deze klass wordt een willekeurig getal gegenereerd
        return strings.stream()
                .filter(s -> s.startsWith("a") && s.length()>3)
                .sorted(Comparator.reverseOrder())
                .map(String::toUpperCase)
                .map(s -> s.substring(0,Math.min(s.length(),10)))
                .map(s -> " prefix " +s+ " sufix ")
                .map(s -> s +counter.getAndIncrement() + " : " +s+ " . " + counter.get())
                .map(s -> s + random.nextInt()) // string met random getal
                .collect(Collectors.joining(","));
    }

}

