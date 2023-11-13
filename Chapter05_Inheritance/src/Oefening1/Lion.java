package Oefening1;

public class Lion extends Animal{
    private int snelheid;

    public Lion(){}
    public Lion(int snelheid){
        this.snelheid = snelheid;
    }
    public Lion(int snelheid,String naam, String geluid){
        super(naam,geluid);
        this.snelheid = snelheid;
    }


    public void setSnelheid(int snelheid) {
        this.snelheid = snelheid;
    }
    public int getSnelheid() {
        return snelheid;
    }
}
