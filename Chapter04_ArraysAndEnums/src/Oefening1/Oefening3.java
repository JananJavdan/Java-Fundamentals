package Oefening1;

public class Oefening3 {
    public static void main(String[] args) {
        int [] intArray = {10,11,12,13,14};
        int lenOfArry = intArray.length;
        for (int i = 0; i < lenOfArry ; i++){
            if (intArray[i] % 2 == 0)
                System.out.println(intArray[i] + " is even");
            else
                System.out.println(intArray[i] + " is ood");
        }

    }
}
