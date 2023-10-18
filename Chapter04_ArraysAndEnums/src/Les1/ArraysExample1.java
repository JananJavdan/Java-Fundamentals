package Les1;

public class ArraysExample1 {
    public static void main(String[] args) {

        //we creeren een array van 10 elementen van het datatype int
        int[] myFirstArray = new int[10];

        // nu creeren we een array van 5 elementen en we vullen deze meteen
        int[] mySecondArray = {10,20,30,40,50};

        int[] myArray = new int[10];

    int[] myArrayNotFull = new int[5];

        myArrayNotFull[1] = 100;
        myArrayNotFull[3] = 1000;
        myArrayNotFull[4] = 250;

        System.out.println(myArrayNotFull[1]);
        System.out.println( myArrayNotFull[3]);
        System.out.println(myArrayNotFull[4]);
    }
}
