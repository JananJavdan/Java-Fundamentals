package Opdracht1Example;

public class MainApp {
    public static void main(String[] args) {
        CrazyRobot crazyRobot = new CrazyRobot("racecar123");

        LiftingRobot liftingRobot = new LiftingRobot(10, "Lift-o");
        liftingRobot.lift(11);
        liftingRobot.lift(10);
        liftingRobot.lift(-1);

        BendingRobot bendingRobot = new BendingRobot(90, "Bend-o");
        bendingRobot.bend(91);
        bendingRobot.bend(90);
        bendingRobot.bend(-90);
        bendingRobot.bend(-91);
    }
}