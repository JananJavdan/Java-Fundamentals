package Oefening1VanInheritance;

public class Animal {
    private String naam;
    private String geluid;

    public Animal(){}
    //public Animal(String naam){
      //  this.naam = naam;
   // }
    public Animal (String geluid){
        this.geluid = geluid;
    }
    public Animal(String naam, String geluid) {
        this.naam = naam;
        this.geluid = geluid;
    }



    public void setNaam(String naam){
        this.naam = naam;
    }
    public void setGeluid(String geluid){
        this.geluid = geluid;
    }
    public String getNaam(){
        return naam;
    }
    public String getGeluid(){
        return geluid;
    }
}
