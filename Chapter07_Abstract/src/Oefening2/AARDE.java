package Oefening2;

public class AARDE extends Planeten{
    public AARDE(double radius) {
        super(radius);
    }

    @Override
    public String getOmtrek() {
        return "omtrek van de aarde" + omtrek;
    }

    @Override
    public String getRadius() {
        return "radius van de aarde" + RADIUS;
    }
}
