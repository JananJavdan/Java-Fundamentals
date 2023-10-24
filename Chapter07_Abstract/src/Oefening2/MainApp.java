package Oefening2;

public class MainApp {
    public static void main(String[] args) {
       // SubClass mySubClass = new SubClass(); //voor oefening2 van oefening1
       // mySubClass.aMethod();

        ZON myZon = new ZON(695700);
        AARDE myAarde = new AARDE(6371);
        MAAN myMaan = new MAAN(1737.5);

        System.out.println(myZon.getOmtrek());
        System.out.println(myZon.getRadius());

        System.out.println(myAarde.getOmtrek());
        System.out.println(myAarde.getRadius());

        System.out.println(myMaan.getOmtrek());
        System.out.println(myMaan.getRadius());





    }
}
