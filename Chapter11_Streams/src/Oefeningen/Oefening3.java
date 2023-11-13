package Oefeningen;

import java.util.Arrays;
import java.util.List;

public class Oefening3 {
    //Schrijf een programma om te controleren of een lijst alleen even bevat
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        boolean onlyEven = numbers.stream()
                .allMatch(i -> i % 2 == 0);//methode gebruikt om te controleren of alle elementen in de stroom overeenkomt even zijn
        if (onlyEven) {
            System.out.println("even getallen is :");
        } else {
            System.out.println("oneven getallen is:");
        }
    }
}
//anyMatch()
// retourneert true als een element van de stream overeenkomt met het gegeven predikaat