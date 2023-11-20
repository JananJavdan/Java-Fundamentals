package Project2Example;

public class Student extends Person {
    int id;
    private static int incrementId = 0;


     //public Student(){
    //}

    public Student(String name, String lastName) {
        super(name, lastName);
        this.id = incrementId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getIncrementId() {
        return incrementId;
    }

    public static void setIncrementId(int incrementId) {
        Student.incrementId = incrementId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}





