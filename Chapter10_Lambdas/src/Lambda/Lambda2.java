public class Lambda2 {

    public static void main(String[] args) {

        Lambda2Interface ref= ()-> 3.1415;

        System.out.println("Value of pi is: "+ ref.getPiValue());
    }
}
