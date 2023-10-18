package Oefening4;


    import java.util.Arrays;

    public class Oefening2 {
        public static void main(String[] args) {

            int[] myIntArray = {1,2,3,4,5}; // mijn orginal array
            int[] myNewArray = Arrays.copyOf(myIntArray, 10); // copy maken van array en toevegoed new getal

            //new getalen toegevoegd
            for (int i = myIntArray.length; i<myNewArray.length; i++){
                myNewArray[i] = i+1;
            }

            System.out.println(Arrays.toString(myNewArray));
        }
    }


