package Oefening3VanPolymorphism;

public class Driehoek extends Vormen{

    public Driehoek() {
        super();
    }

    public Driehoek(int height, int width, int omtrek, int oppervlakte) {
        super(height, width, omtrek, oppervlakte);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
    }

    @Override
    public void setOmtrek(int omtrek) {
        super.setOmtrek(omtrek);
    }

    @Override
    public void setOppervlakte(int oppervlakte) {
        super.setOppervlakte(oppervlakte);
    }
}
