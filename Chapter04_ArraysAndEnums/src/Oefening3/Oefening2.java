package Oefening3;

public class Oefening2 {
    public static void main(String[] args) {

        String[] firstArray = {"Intec", "is", "the", "best!"};

        String[] secondArray = {"C#", "is", "the", "worst!"};

        String[] tempArray = firstArray.clone();

        firstArray = secondArray.clone();
        secondArray = tempArray.clone();

        System.out.println("first array nu wissellen");

        for (String s : firstArray){
            System.out.println(s);
        }
        System.out.println(" ");
        System.out.println("second array nu wissellen");
        for (String s : secondArray){
            System.out.println(s);
        }

    }

}
