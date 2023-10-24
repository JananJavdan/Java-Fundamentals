package Opdracht1;

public class Robot {
    private String unitName;
//constructor : no args
    public Robot() {}
    // constructor met string naam
    public Robot(String nuitName) {
        this.unitName = "nameless Robot";
    }
    //methode
    //De boot()-methode is openbaar en heeft geen argumenten.
    // Het drukt een bericht af dat de robot aan het opstarten is en de naam van de robot (unitName) afdrukt.
    public void boot(){
        System.out.println("derobot" + unitName + "is aan het opstarten");
    }
    //toString methode bestaat die nodige gegevens van iedere robot teruggeeft
    @Override
    public String toString() {
        return "Robot{" +
                "unitName='" + unitName + '\'' +
                '}';
    }
}
