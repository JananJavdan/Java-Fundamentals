package Project2;

import java.util.*;

//Opdracht 3: Verwijderen van dubbels en kaarten groeperen per land
public class CardProcessingService {
    public static void removeDuplicatesAndGroupByCountry(List<PostCard> myPostCrdList){

        // Maak een Map om kaarten per land te groeperen
        Map<String, List<PostCard>> cardsByCountry = new HashMap<>();
        // Groepeer de kaarten per land
        for (PostCard card: myPostCrdList){
         cardsByCountry.computeIfAbsent(card.getCountry(), k -> new ArrayList<>()).add(card);
        }
        // Verwijder dubbels en tel hun aantal
        List<PostCard> uniqueCards = new ArrayList<>();
        int totalDuplicates = 0;
        for (List<PostCard> cards : cardsByCountry.values()){
            Set<PostCard> cardSet = new HashSet<>(cards);
            uniqueCards.addAll(cardSet);
            totalDuplicates += cards.size() - cardSet.size();
        }
        // Print het aantal dubbele kaarten
        System.out.println("Aantal dubbele kaarten: " +totalDuplicates);


    }
}
