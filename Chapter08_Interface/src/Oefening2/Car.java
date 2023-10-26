package Oefening2;

public class Car implements Switch1,Motor{
    private boolean wagenAnn = false;
    @Override
    public void toggleSwitch() {
        wagenAnn = !wagenAnn;
        if (wagenAnn){
            System.out.println("wagen is nu AAn");
        }
        else {
            System.out.println("wagen is nu AFF");
        }

    }

    @Override
    public void gas() {
        if (wagenAnn){
            System.out.println("Vroom! Vroom! ");
    }
        else {
            System.out.println("car kan niet AAN");
        }

        }

}
