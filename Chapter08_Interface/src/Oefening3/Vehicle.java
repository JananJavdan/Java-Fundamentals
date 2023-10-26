package Oefening3;

import Oefening2.Motor;
import Oefening2.Switch1;

public interface Vehicle extends Switch1, Motor {
    // Maak een interface genaamd Vehicle.
    //Deze extends de interfaces Switch en Motor
    //property
    int doors = 5;
    //methodes
    void openDoor(int door);
    void closeDoor(int door);
}
