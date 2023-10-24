package Oefening2;

abstract class AbstractClass {
    //constructor die als print
    AbstractClass(){
        System.out.println("This is constructor of abstract class");
    }
    //abstract method
    public abstract void aMethod();

    //non abstract method
    public void normalMethod(){
        System.out.println("This is a normal method of abstract class");
    }
}
