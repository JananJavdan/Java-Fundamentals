package Oefening2;

public class MainFactorial {
    public static void main(String[] args) {


        Factorial result = (a) -> { //hiere willen factorial rekenen
            int factorial = 1;      //hier factorial van 1 beginen
            for (int i = 1; i<=a; i++){ //hier in de loop elke keer getal verhogen worden
               factorial *= i;           //en darnaa mul
            }
            return factorial;            //retorneren de waarde
        };
        System.out.println(result.factorial(5)); // hiere method  aanroepen en getal schrijven

        }
    }

