package Oefening3;

public class Car implements Vehicle {
//rekening mee dat de auto geen gas mag geven als er een deur openstaat!
    private boolean doorIsOpen = false;
    private boolean wagenAnn = false;

    @Override
    public void openDoor(int door) {
        if (door >= 0 && door < doors) {
            doorIsOpen = true;
            System.out.println("door" + door + " is nu open");
        } else {
            System.out.println("door" + door + " de  auto gas kan geven");
        }


    }

    @Override
    public void closeDoor(int door) {
        if (door >= 0 && door < doors) {
            doorIsOpen = false;
            System.out.println("door" + door + " is nu close");
        } else {
            System.out.println("door" + door + " de outo mag niet gas geven ");

        }
         }
    @Override
    public void gas() {

    }

    @Override
    public void toggleSwitch() {

    }
}

