package Project2;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
//Opdracht 4: Kaarten toewijzen aan vrienden met behulp van een PriorityQueue
public class CardAllocationService {
    public static PriorityQueue<Friend> allocateCardsToFriends(List<Friend> friendList){
        //// Maak een PriorityQueue met aangepaste Comparator voor vrienden
        PriorityQueue<Friend> sortedFriends = new PriorityQueue<>(
                Comparator.<Friend, Boolean>comparing(friend -> friend.isFamily()))
                .reversed()
                .thenComparing(friend -> friend.getFriendShipLevel());

        // Voeg vrienden toe aan de PriorityQueue
        sortedFriends.offer(bobby);
        sortedFriends.offer(melissa);
        sortedFriends.offer(darla);
        sortedFriends.offer(bert);
        sortedFriends.offer(grandma);
        sortedFriends.offer(fester);
        sortedFriends.offer(anna);
    }
}
