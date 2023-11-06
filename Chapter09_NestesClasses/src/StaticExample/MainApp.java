package StaticExample;

public class MainApp {
    public static void main(String[] args) {
        //we hebben een object maken als we static class hebben we geen toegang van de variabalen
        StaticExample.Inner inner = new StaticExample.Inner();
        // de methode aanroepen de naam van de class an piunt en de naam van de methode
        inner.run();
    }
}
