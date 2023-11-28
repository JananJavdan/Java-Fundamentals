package Les3Example;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        //een queue maken en elementen toevoegen
        Queue<String> queue = new LinkedList<>();//waroom LinkedList?omdat Queue implementeer LinkedList
        queue.offer("Alice");  //offer als add
        queue.offer("Bob");
        queue.offer("Charlire");

        System.out.println("Queue: " + queue); //[Alice,Bob,Charlie]

        //het elementen aan de voorkant van de queue opvragen zonder het te verwijderen
        String frontElement = queue.peek();
        System.out.println("Front element: " +frontElement);//Alice

        //Het element aan de voorkant van de Queue opvragen en verwijderen
        String removedElement = queue.poll();
        System.out.println("Removed element: " +removedElement);//Alice
        System.out.println("Updated Queue: " +queue);//[Bob, Charlie

        //Controleren of de Queue leeg is
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is Queue empty?" + isEmpty);//false

        // De grootte van de Queue opvragen
        int size = queue.size();
        System.out.println("Size of Queue:"+size);
    }

}
