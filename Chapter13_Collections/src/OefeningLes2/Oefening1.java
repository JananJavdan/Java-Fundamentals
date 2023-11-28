package Les2Example.OefeningLes2;

import java.util.LinkedList;

//Converteer de ArrayList van ArrayList Oefening 1 naar een LinkedList overloop en overloop de lijst
public class Oefening1 {
    public static void main(String[] args) {
        LinkedList<String> wordset = new LinkedList<>();

        wordset.add("Lessen");
        wordset.add("boeken");
        wordset.add("Les");
        wordset.add("NoteBoek");
        wordset.add("Laptop");

        LinkedList<String> wordset2 = new LinkedList<>();
        wordset.add("Works");
        wordset2.add("Shop");
        wordset2.add("OnlineShop");

        LinkedList<String> mixtList = new LinkedList<>(wordset);
        mixtList.addAll(wordset2);
        System.out.println(mixtList);

        System.out.println("LinkedList -> ");
        mixtList.forEach(worden -> System.out.println(worden + " "));


    }
}
