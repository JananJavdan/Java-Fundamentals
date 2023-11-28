package Les3Example;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        //object toevoegen aan vector
        v.add("Inas");
        v.add("Adem");
        v.add("llias");
        v.add("Marwane");

        //List doorlopen via iterator
        Iterator itr = v.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
