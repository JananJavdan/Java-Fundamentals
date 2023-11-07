package Les1;

public class MainApp1 {
    // lambda expression to implement above
// functional interface. This interface
// by default implements abstractFunction()
    public static void main(String[] args) {
        Lambda expression = (x)-> System.out.println(2*x);
        // This calls above lambda expression and prints 2 times our input
        expression.abstractFunction(5);
    }
}
