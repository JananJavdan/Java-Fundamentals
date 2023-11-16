package Project2;

public class Student extends Person{
    private static int incrementId;

    public Student(String String) {
        super(String);
    }

    public void Student(){
    }
    private static int getIncrementId(){
        return 1;
    }

    public Student(String String, int id) {
        super(String);
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{}";
    }
    int id;
}
