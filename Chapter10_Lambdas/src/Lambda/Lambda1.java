import java.sql.SQLOutput;

public class Lambda1 {
    public static void main( String[] args ) {
        Lambda1Interface ref=(x,y)-> {System.out.println("hello "+x+y);
                                     System.out.println("Have a nice day");
        };
        ref.message("World",'!');


    }


}
