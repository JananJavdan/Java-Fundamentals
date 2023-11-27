package Les2Example;

import java.util.Iterator;
import java.util.LinkedList;
//verschillende tussen linked list en array list: met array list kunnen snel zoeken maar met LinkedList kunnen elementen verdewijnen of tovoegen

public class LinkedListExample1 {
    public static void main(String[] args) {
        //Linkedlist maken
        LinkedList<String> list = new LinkedList<>();
        ////Object toevoegen aan linkedlist
        list.add("Jonathan");
        list.add("Deepika");
        list.add("Elmaz");
        list.add("Musam");
        list.add("Abldusammad");
        list.add("Rutger");
     //Lijst doorlopen via Iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
    //The code Iteratoritr=list.iterator(); in Java creates an instance of the ListIterator
    // interface, which is used to traverse a list in both forward and backward directions 1.
    // The list.iterator() method returns an iterator over the elements in the list in proper
    // sequence, starting at the beginning of the list 2. The ListIterator interface extends
    // the Iterator interface and provides additional functionality such as bi-directional
    // traversal, modification of elements, and more 1.
}
