package Oefening1;

public class MainApp {
    public static void main(String[] args) {
        Lock chest = new Chest();
        //hoe kunnen we de interface methode aan roepen ? met de naam van de interface en punt en de naam van de methode
        chest.lock();
        chest.unLock();


    }
}
