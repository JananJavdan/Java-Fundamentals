package ArrayDeque;

public class Person {
    String name;
    Gender gender;



    public enum Gender{
        MALE,
        FEMALE;
    }

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }


    public void offerFirst(){
    }
    public void pollfirst(){

    }
    public void pollLast(){

    }

    @Override
    public String toString() {
        return name+ " ";
    }
}
