package Example4;

public class MainApp {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.name = "Intec Brussel";
//printing the parent class name
        System.out.println(parent.name);

        //parent clas methos is oevrriding method hence this will be executed
        parent.method();

        //trying to Downcasting Implicitly. you will get a compile time error
       // Child child = (Child) parent;

        //Downcasting Explicitly
        Child child = (Child) parent;
        System.out.println(child.name);
        child.method();
    }

}
