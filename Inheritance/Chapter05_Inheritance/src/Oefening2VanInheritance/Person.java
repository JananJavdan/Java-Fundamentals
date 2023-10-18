package Oefening2VanInheritance;

public class Person {
    //super class , parent
    private String naam;
    private int age;

    public Person(){}
    public Person(String naam){
        this.naam = naam;
    }
    public Person(int age){
        this.age = age;
    }
    public Person(String naam,int age){
        this.naam = naam;
        this.age = age;
    }

    public void setNaam(String naam){
        this.naam = naam;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getNaam(){
        return naam;
    }
    public int getAge(){
        return age;
    }
}
