package Project2;

import java.util.Comparator;
import java.util.List;
//Opdracht 2 - Sorteren van kaarten per land met behulp van een Comparator
public class CountrySorter {
    public static void sortCardsByCountry(List<PostCard> myPostCardList){
        // Maak een Comparator voor het sorteren op land
        Comparator<PostCard> countryComparator = Comparator.comparing(PostCard::getCountry);
        // Sorteer de kaarten per land
        myPostCardList.sort(countryComparator);
        // Print het gesorteerde resultaat
        for (PostCard card : myPostCardList){
            System.out.println(card);
        }

    }
}
