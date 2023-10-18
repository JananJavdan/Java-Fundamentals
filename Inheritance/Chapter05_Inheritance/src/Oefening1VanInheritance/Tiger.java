package Oefening1VanInheritance;

public class Tiger extends  Animal{
    private String color;

    public Tiger(){}
    public Tiger(String color){
        this.color = color;
    }
    public Tiger(String color,String naam,String geluid){
        super(naam,geluid);
        this.color = color;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

}
