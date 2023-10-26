package Oefening5;

public class Flashlight implements Battery{
    //Maak een class genaamd Flashlight die in de constructor een Battery ontvangt
    //Gebruik de interface Battery als datatype
    private Battery battery;
//constructor
    public Flashlight(Battery battery) {
        this.battery = battery;
    }

    public Flashlight() {

    }

    @Override
    public void charge() {

    }
}
