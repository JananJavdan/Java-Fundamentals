package Les4;
import java.util.Scanner;
public class EvenOdda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to EvenOdda:" +"Please enter a number:" +"Thankyou for using our application");
       if (scanner.hasNextInt()) {
           int num = scanner.nextInt();
       }

        if( num %2 == 0){
            //het getal even is
            System.out.println("Even");
        }
        else {
            //het getal oneven is
            System.out.println("Odd");
        }
               else {
                    System.out.println("Error!!" + "You have NOT entered any number.." );
        }

    }
}
