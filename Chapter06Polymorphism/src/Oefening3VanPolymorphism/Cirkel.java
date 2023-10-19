package Oefening3VanPolymorphism;

public class Cirkel extends Vormen{

    public Cirkel() {
        super();
    }

    public Cirkel(int height, int width, int omtrek, int oppervlakte) {
        super(height, width, omtrek, oppervlakte);
    }

    @Override
    public int getHeight() {
        return super.getHeight();
    }

    @Override
    public int getWidth() {
        return super.getWidth();
    }

    @Override
    public int getOmtrek() {
        return super.getOmtrek();
    }

    @Override
    public int getOppervlakte() {
        return super.getOppervlakte();
    }
}



