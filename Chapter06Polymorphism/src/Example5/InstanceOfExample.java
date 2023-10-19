package Example5;

public class InstanceOfExample {
     static {
        //controleren of name een instance van de klasse string is
        String name = "Intec Brussel";
        System.out.println("Is name instance of string:" +(name instanceof String));
//object is de super klas van alle klassen in java
        System.out.println("Is name a instance of object class:" +(name instanceof Object));
    }


}
