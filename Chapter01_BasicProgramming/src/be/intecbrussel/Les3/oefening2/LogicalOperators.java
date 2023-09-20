package be.intecbrussel.Les3.oefening2;

public class LogicalOperators {
    public static void main(String[] args) {
        //Vergelijk 2 variabelen
        boolean bool01 = true;
        boolean bool02 = false;

        boolean result01 = (bool01 && bool02);
        boolean result02 = (bool01 || bool02);
        boolean result03 = (!(bool01 && bool02));

        System.out.println(result01);
        System.out.println(result02);
        System.out.println(result03);
    }

}
