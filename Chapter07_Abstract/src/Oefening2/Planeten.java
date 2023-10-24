package Oefening2;

abstract class Planeten {

//attribute ,De klasse heeft drie attributen
    protected final double RADIUS;
    private final double PI = Math.PI;// De waarde van PI wordt berekend door de methode Math.PI te gebruiken
    protected double omtrek;
    //constructor
    //De klasse heeft ook een constructor genaamd Planet,
    // die een enkel argument van het type double accepteert.
    // De constructor initialiseert de waarde van de variabele
    // RADIUS met het meegegeven argument en roept vervolgens de
    // methode setOmtrek() aan om de waarde van de variabele omtrek te berekenen.
    public Planeten(double radius) {
        this.RADIUS = radius;
        setOmtrek(radius);
    }
    //method
    private final void setOmtrek(double radius){
        omtrek = PI * (radius*2);
    }
    //abstract method
    public abstract String getOmtrek();
    public abstract String getRadius();
}
// Het sleutelwoord public geeft aan dat de methode openbaar is en toegankelijk is vanuit
// andere klassen. Het sleutelwoord abstract geeft aan dat de methode geen implementatie
// heeft in de huidige klasse en dat elke klasse die deze klasse uitbreidt, de methode moet implementeren
//De methode retourneert een waarde van het type String



