package Project2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MainPostCard {
    public static void main(String[] args) {
        //my cards
        PostCard belgium = new PostCard("Belgium", "Europe");
        PostCard france = new PostCard("France", "Europe");
        PostCard japan = new PostCard("Japan", "Asia");
        PostCard rdc = new PostCard("Democratic Republic of Congo", "Africa");
        PostCard southKorea = new PostCard("South Korea", "Asia");
        PostCard belgium2 = new PostCard("Belgium", "Europe");
        PostCard southAfrica = new PostCard("South Africa", "Africa");
        PostCard france2 = new PostCard("France", "Europe");
        PostCard belgium3 = new PostCard("Belgium", "Europe");
        PostCard usa = new PostCard("United States of America", "North America");
        PostCard canada = new PostCard("Canada", "North America");
        PostCard peru = new PostCard("Peru", "South America");
        PostCard samoa = new PostCard("Samoa", "Oceania");
        PostCard belgium4 = new PostCard("Belgium", "Europe");
        PostCard france3 = new PostCard("France", "Europe");

        List<PostCard> myPostCardList = new ArrayList();
        myPostCardList.add(belgium);
        myPostCardList.add(france);
        myPostCardList.add(japan);
        myPostCardList.add(rdc);
        myPostCardList.add(southKorea);
        myPostCardList.add(belgium2);
        myPostCardList.add(southAfrica);
        myPostCardList.add(france2);
        myPostCardList.add(belgium3);
        myPostCardList.add(usa);
        myPostCardList.add(canada);
        myPostCardList.add(peru);
        myPostCardList.add(samoa);
        myPostCardList.add(belgium4);
        myPostCardList.add(france3);
        System.out.println("Second opdracht");
        CountrySorter.sortCardsByCountry(myPostCardList);//methode aanroepen(opdracht 2)
        System.out.println("Third opdracht");
        CardProcessingService.removeDuplicatesAndGroupByCountry(myPostCardList);//(opdracht 3)


        //my friend’s cards
        PostCard northKorea = new PostCard("North Korea", "Asia");
        PostCard usa2 = new PostCard("United States of America", "North America");
        PostCard botswana = new PostCard("Botswana", "Africa");
        PostCard northKorea2 = new PostCard("North Korea", "Asia");

        List<PostCard> myFriendsPostCardList = new ArrayList();
        myFriendsPostCardList.add(northKorea);
        myFriendsPostCardList.add(usa2);
        myFriendsPostCardList.add(botswana);
        myFriendsPostCardList.add(northKorea2);

        //my friends
        Friend bobby = new Friend("Bobby",false, 3, 5);
        Friend melissa = new Friend("Melissa",false, 1, 6);
        Friend darla = new Friend("Darla",true, 14, 2);
        Friend bert = new Friend("Bert",false, 10, 4);
        Friend grandma = new Friend("Nana",true, 12, 7);
        Friend fester = new Friend("Fester",false, 1, 2);
        Friend anna = new Friend("Anna",false, 8, 4);

        //voeg vriendien toe in priority Queue ( opdracht 4 )
        PriorityQueue<Friend> sortedFriends = new PriorityQueue<>(
                Comparator.comparing(Friend::isFamily)
                        .thenComparing((x)->x.getFriendShipLevel()>5)
                        .thenComparing(Friend::getYearsKnown).reversed());
       // PriorityQueue<Friend> sortedFriends = new PriorityQueue<>();
        sortedFriends.offer(bobby);
        sortedFriends.offer(melissa);
        sortedFriends.offer(darla);
        sortedFriends.offer(bert);
        sortedFriends.offer(grandma);
        sortedFriends.offer(fester);
        sortedFriends.offer(anna);
        System.out.println("\n Friend List sorted: ");
        while (!(sortedFriends.isEmpty()))
            System.out.println(sortedFriends.poll());

        System.out.println("\n ruilen karten met beste friend");
        CardTradingService.tradeCards(myPostCardList, myFriendsPostCardList);//(opdracht 1)











    }
}
