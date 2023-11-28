package OefeningPriorityQueue;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MainBurgerOrder {
    public static void main(String[] args) {
        Queue<BurgerOrder> burgerOrders = new LinkedList<>(); //en ook test met PeriorityQueue
        burgerOrders.offer(new BurgerOrder("BigmacMenu", 2));
        burgerOrders.offer(new BurgerOrder("ChikenMenu", 4));
        burgerOrders.offer(new BurgerOrder("VegiMenu", 5));
        burgerOrders.offer(new BurgerOrder("kidsMenu", 5));

        BurgerOrder burgerOrder = burgerOrders.peek();

        while (burgerOrder != null){
            System.out.println("about to preparr" +burgerOrder);
            burgerOrder = burgerOrders.poll();
            System.out.println("preparing"+burgerOrder);
            burgerOrder = burgerOrders.peek();
        }








    }
}
