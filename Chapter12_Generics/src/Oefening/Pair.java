package Oefening;

public class Pair <H>{
    //variabele
    private H fistName;
    private H lastName;
//constructor
    public Pair(H fistName, H lastName) {
        this.fistName = fistName;
        this.lastName = lastName;
    }
//getter
    public H getFistName() {
        return fistName;
    }

    public H getLastName() {
        return lastName;
    }
//to string
    @Override
    public String toString() {
        return "Pair{" +
                "fistName=" + fistName +
                ", lastName=" + lastName +
                '}';
    }
}
