package Oefening3VanPolymorphism;

public class Vormen {
    private int height;
    private int width;
    private int omtrek;
    private int oppervlakte;
    public Vormen(){
        this.height = 2;
        this.width = 4;
        this.omtrek = (height*width);
        this.oppervlakte = 2*(height+width);
    }

    public Vormen(int height, int width, int omtrek, int oppervlakte) {
        this.height = height;
        this.width = width;
        this.omtrek = omtrek;
        this.oppervlakte = oppervlakte;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getOmtrek() {
        return omtrek;
    }

    public void setOmtrek(int omtrek) {
        this.omtrek = omtrek;
    }

    public int getOppervlakte() {
        return oppervlakte;
    }

    public void setOppervlakte(int oppervlakte) {
        this.oppervlakte = oppervlakte;
    }

    @Override
    public String toString() {
        return "Vormen{" +
                "height=" + height +
                ", width=" + width +
                ", omtrek=" + omtrek +
                ", oppervlakte=" + oppervlakte +
                '}';
    }
}

