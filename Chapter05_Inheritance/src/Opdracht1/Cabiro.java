package Opdracht1;

public class Cabiro extends Car{
    private boolean sunroof;
    public Cabiro(){}
    public Cabiro(boolean sunroof){
        this.sunroof = sunroof;
    }
    public Cabiro(boolean sunroof,int speed,int hp,String color){
        super(color,speed,hp);
        this.sunroof = sunroof;
    }
    public boolean getSunroof(){
        return sunroof;
    }
    public void openRoof(){
    }
    public String toString(){
        return "Cabiro with sunroof";
    }
}
