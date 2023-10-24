package Opdracht1;

public class MainApp {
    public static void main(String[] args) {
        //uitendelijk in main app maak van elke type robot een instantie
        BendingRobot bendingRobot = new BendingRobot(45.0,"Bender");
        CrazyRobot crazyRobot = new CrazyRobot("Crazy");
        LiftingRobot liftingRobot = new LiftingRobot(23.3,"Lift");
//test 2 keer de lift en bend methode
        bendingRobot.bend(20.0);
        liftingRobot.lift(30.0);

        bendingRobot.bend(10.0);
        liftingRobot.lift(9.9);



    }
}
