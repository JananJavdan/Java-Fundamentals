package Project2;

import java.util.List;
//Opdracht 1 - Ruilen van kaarten met je beste vriend
public class CardTradingService {
    public static void tradeCards(List<PostCard> myPostCardList, List<PostCard> myFriendsPostCardList){
        for (PostCard myCard : myPostCardList){
            for (PostCard friendCard : myFriendsPostCardList){
                if (myCard.getCountry().equals(friendCard.getCountry())){
                    myFriendsPostCardList.remove(friendCard);
                    myFriendsPostCardList.add(myCard);
                    break;
                }

            }

        }
        System.out.println(myPostCardList);
        System.out.println(myFriendsPostCardList);

    }
}
