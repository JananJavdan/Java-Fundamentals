package ArrayListExample;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListExample1 {
    public static void main(String[] args) {
        //Array list maken
        ArrayList<String> list=new ArrayList<>();

        //object toevoegen aan array list
        list.add("Nina");
        list.add("Janan");
        list.add("Maxim");
        list.add("Haytam");
        list.add("Abdessamad");
        list.add("Raphael");

        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
