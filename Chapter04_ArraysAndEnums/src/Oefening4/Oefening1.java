package Oefening4;


       import java.lang.reflect.Array;
import java.util.Arrays;
       import java.util.Collection;
       import java.util.Collections;

public class Oefening1 {
        /* Schrijf een programma om 2 arrays van elks minimaal 15 elementen (een double en een string)
         te sorteren en te   printen. Niet van laag naar hoog maar andersom van hoog naar laag. */
        public static void main(String[] args) {
            double[] array1 = {1.0,2.3,4.5,3.4,6.8,3.1,0.5,4.1,9.0,5.6,7.2,3.1,4.6,2.9,1.4};

            String[] array2 = {"appel","ananas","avocado","bannan","bes","braam","clementine","citroen","cranberry","druif","granaatappel","jujube","kaki","kers","kiwi"};

            System.out.println("Original array1 is:");     //Prints original array1
            for (double i :array1){
                System.out.print(i + " ");
            }
            System.out.println("\nSorted array1 is: ");  //sort Array1 in increasing order
            Arrays.sort(array1);

            for (int index = array1.length -1; index >= 0; index--){  //Prints sorted array2 in decreasing order
                System.out.print(array1[index] + " ");
            }

            System.out.println("\nOriginal array2 is: ");  //Prints original array1
            System.out.println(Arrays.toString(array2));

            System.out.println("\nSorted array2 is: ");
            Arrays.sort(array2, Collections.reverseOrder());  //Sorts array2 in decreasing order
            System.out.println(Arrays.toString(array2));      //Prints sorted array2
        }
    }

