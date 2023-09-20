package be.intecbrussel.Les4;

public class SwitchExample2 {
    public static void main(String[] args) {
        String str = "we";
        switch (str) {
            case "I":
                System.out.println("I want to become a doctor.");
                break;
            case "we":
                System.out.println("we are Indian.");
            case "you":
                System.out.println("You are my crony friend.");
            case "our":
                System.out.println("Our Indian flag has three color.");
            default:
                System.out.println("It is the default statement.");
        }
    }
}
