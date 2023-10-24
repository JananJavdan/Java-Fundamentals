package Opdracht1;

public class LiftingRobot extends Robot{
    //attributes
    private double maxLiftHeight;
    private String unitNamr;
    //twee constructor met van type double en string
    public LiftingRobot(double maxLiftHeight, String unitNamr) {
        this.maxLiftHeight = maxLiftHeight;
        this.unitNamr = unitNamr;
    }
    //De lift(double) methode is openbaar en accepteert een argument van
    // het type double. Als het argument groter is dan de maxLiftHeight,
    // drukt de methode een bericht af dat het liften niet mogeleijk is
    //Anders drukt de methode een bericht af dat het opheffen gelukt is met de gevraagde hoogte
    public void lift(double i){
        if (i>maxLiftHeight){
            System.out.println("het liften niet mogeleijk is ");
        }
        else {
            System.out.println("het opheffen gelukt is met de gevraagde hoogte");
        }

    }
//toString methode bestaat die nodige gegevens van iedere robot teruggeeft
    @Override
    public String toString() {
        return "LiftingRobot{" +
                "maxLiftHeight=" + maxLiftHeight +
                ", unitNamr='" + unitNamr + '\'' +
                '}';
    }
}
