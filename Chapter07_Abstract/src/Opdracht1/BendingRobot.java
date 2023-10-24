package Opdracht1;

public class BendingRobot extends Robot{
    //attributes
    private double maxBenAngele;
    private String unitNamr;
    //twee constructor: maxBenAngle van het type double en unitName van het type String.
    // De constructor initialiseert de variabelen maxBenAngle en unitName met de meegegeven waarden.
    public BendingRobot(double maxBenAngele, String unitNamr) {
        this.maxBenAngele = maxBenAngele;
        this.unitNamr = unitNamr;
    }
    //De bend(double) methode is openbaar en accepteert een argument van
    // het type double. Als het argument groter is dan de maxBendAngle,
    // drukt de methode een bericht af dat het buigen niet mogelijk is
    //Anders drukt de methode een bericht af dat het buigen gelukt is
    public void bend(double i){
        if (i >maxBenAngele){
            System.out.println("het buigen is niet mogelijk" + maxBenAngele + i);
        }
        else {
            System.out.println("het buigen gelukt is met gevraagde hoek"+i);
        }
    }
    //toString methode bestaat die nodige gegevens van iedere robot teruggeeft
    @Override
    public String toString() {
        return "BendingRobot{" +
                "maxBenAngele=" + maxBenAngele +
                ", unitNamr='" + unitNamr + '\'' +
                '}';
    }
}
