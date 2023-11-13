package Oefeningen;

import java.util.Arrays;
import java.util.List;

public class Oefening4 {
    public static void main(String[] args) {
        //Schrijf een programma om het product van alle elementen in een lijst te vinden
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);//een list van getal maken
        int product = numbers.stream() //om product van getal te berekenen
                .reduce(1,(a,b)-> a*b);//deze methode gebruikt om het product van alle elementen in de stroom te vinden
        System.out.println(" om het product van alle elementen in een lijst is :" +product);
    }
}
//De reduce
// methode wordt gebruikt om de elementen van een stream terug te brengen tot één enkele waarde. De
//methode reduce neemt een BinaryOperator als parameter.
