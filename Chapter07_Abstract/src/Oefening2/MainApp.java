package Oefening2;

public class MainApp {
    public static void main(String[] args) {
        ZON myZon = new ZON();
        AARDE myAarde = new AARDE();
        MAAN myMaan = new MAAN();

      int totalOmterek = myZon.brekenTotalOmtrek();
        System.out.println("Total berekenen van aarde , zon , maan is;" + totalOmterek);



    }
}
