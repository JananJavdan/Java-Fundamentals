package Project1;

public class Main {
    public static void main(String[] args) {
        HeartBeat heartBeat = new HeartBeat(5000);
        Lungs lungs = new Lungs();
        Person person = new Person("Jerry", 70, 5000);
        Person person1 = new Person("Alice", 50, 3000);
        Person person2 = new Person("Tony", 60, 6000);
        Person person3 = new Person("Joy", 65, 2000);
        Person person4 = new Person("Max", 80, 8000);

        person.startLife();
        person1.startLife();
        person2.startLife();
        person3.startLife();
        person4.startLife();

    }
}
