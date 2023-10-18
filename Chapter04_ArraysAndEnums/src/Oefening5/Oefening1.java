package Oefening5;

public class Oefening1 {
    public static void main(String[] args) {
        //Maak een 3D array van 5 5 5 elementen en print de waarde van deze elementen uit.

        int [][][] threeDimensionalArray = new int[5][5][5];

        //Vullen van de 3D array met waarden

        for (int i = 0; i<5; i++){
            for (int j = 0; j<5; j++){
                for (int k = 0; k<5; k++){

                    threeDimensionalArray[i][j][k] = i +j + k;
                    System.out.print(threeDimensionalArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }



    }

}
