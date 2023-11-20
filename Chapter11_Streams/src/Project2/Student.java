package Project2;

public class Student extends Person{
    private static int incrementId;


   // public Student(String name, String lastName) {
      //  super(name, lastName);
  //  }

    public void Student(){
    }

    private static int getIncrementId(){
        return 1;
    }

    public Student(String name, String lastName, int id) {
        super(name, lastName);
        this.id = id;
    }

    @Override
    public String toString() {
        return getName() + " " + getLastName();
    }
    int id;

}
