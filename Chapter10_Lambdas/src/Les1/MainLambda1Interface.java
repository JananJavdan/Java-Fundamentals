package Les1;

public class MainLambda1Interface {
    public static void main(String[] args) {
        Lambda1Interface ref = (x, y) -> {
            System.out.println("hello" + x+y);
            System.out.println("Have a nace day");
        };
        ref.message("World", '!');
    }
}
