package Oefening2;

public class MAAN extends Planeten{
    public MAAN(double radius) {
        super(radius);
    }

    @Override
    public String getOmtrek() {
        return "otrek van de maan" + omtrek;
    }

    @Override
    public String getRadius() {
        return "radius van de maan" + RADIUS;
    }
}
