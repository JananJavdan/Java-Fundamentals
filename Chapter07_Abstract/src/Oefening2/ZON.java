package Oefening2;

public class ZON extends Planeten {
    public ZON(double radius) {
        super(radius);
    }

    @Override
    public String getOmtrek() {
        return "omtrek van de zon" + omtrek;
    }

    @Override
    public String getRadius() {
        return "radius van de zon" + RADIUS;
    }
}
