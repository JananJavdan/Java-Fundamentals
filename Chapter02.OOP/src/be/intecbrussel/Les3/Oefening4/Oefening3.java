package be.intecbrussel.Les3.Oefening4;

public class Oefening3 {
    public static void main(String[] args) {
        double result1 = (Math.random() *60);
        System.out.println(result1);
        double result2 = Math.ceil(result1);
        System.out.println(result2);
        if (result2 %2 == 0){
            System.out.println("the generated number " + result2 + "is even");
        }else {
            System.out.println("the generated number " + result2 + "is niet even");
        }

    }
}
