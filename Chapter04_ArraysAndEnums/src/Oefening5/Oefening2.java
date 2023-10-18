package Oefening5;


import java.util.Arrays;
public class Oefening2 {
    public static void main(String[] args) {

        //Gebruik de 2D array en print deze uit in combinatie met de toString() van de class Array.
        int[ ][ ] numbers = {{1, 2, 3}, {4, 5, 6}};

        String stringNumbers = Arrays.deepToString(numbers);

        for (int i = 0; i<numbers.length;i++){
            for (int j = 0; j<numbers[i].length;j++){

                System.out.println("2D array: " + stringNumbers + (numbers[i][j]));
            }
            System.out.println();

        }



    }
}
