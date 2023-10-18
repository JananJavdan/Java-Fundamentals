package be.intecbrussel.Opdracht3;

public class Oefening2 {
    public static void main(String[] args) {

        int FriendShip = 20; //maximum friendship rank
        int geefCadeautjes = 0;
        do {
            System.out.println("je geef een cadeautjed");
            geefCadeautjes++;
        }
        while (FriendShip <20);//je favoriete ‘shopkeeper’ cadeautjes geeft totdat hun FriendShip rank op 20 staat.

        if (FriendShip %5 == 0){ // Voor iedere 5de FriendShip Level, krijg je een Critical, waar 1 cadeautje, 2 punten waard is.
            geefCadeautjes++;
            System.out.println("je geeft favoriete cadeatjes");
        }
        else { //Vanaf dat deze rank bereikt is, moet je stoppen met cadeautjes geven.
            System.out.println("stop met cadeautje geven");
        }
    }

}
