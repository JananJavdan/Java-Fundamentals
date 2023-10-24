package Opdracht1;

public class CrazyRobot extends Robot{
    private String unitName;
    //De eerste constructor heeft geen argumenten en
    // initialiseert de unitName-variabele met de waarde “CrazyRobot”
    public CrazyRobot() {
        this.unitName = "CrazyRobot";
    }
    //De tweede constructor accepteert een argument String en
    // initialiseert de unitName-variabele met de meegegeven waarde.
    public CrazyRobot(String nuitName) {
        this.unitName = nuitName;
    }

    //De boot() methode is openbaar en heeft geen argumenten.
    // Het roept de boot() methode van superklasse aan om
    // het opstartbericht af te drukken. Vervolgens wordt de naam
    // van de robot (unitName) omgedraaid en wordt er “omdraaien” aan
    // toegevoegd. Het nieuwe naam wordt afgedrukt in het opstartbericht
    @Override
    public void boot() {
        StringBuilder sb = new StringBuilder(unitName);
        sb.reverse();
        sb.append("omdraaien");
        unitName = sb.toString();
        System.out.println("het bootbericht" + unitName);
    }
    //toString methode bestaat die nodige gegevens van iedere robot teruggeeft
    @Override
    public String toString() {
        return "CrazyRobot{" +
                "unitName='" + unitName + '\'' +
                '}';
    }
}
