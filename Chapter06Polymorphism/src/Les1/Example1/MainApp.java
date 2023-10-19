package Les1.Example1;

public class MainApp {
    public static void main(String[] args) {
        //Plymorphism geburt
        Animal myAnimal = new Animal(); //deze komt van animal  //object maken van super klas en sub klas
        myAnimal.animalSound();  //onze referantie dezelfde

        Animal myCat = new Cat(); // deze komt van cat klas
        myCat.animalSound();

        Animal myDuck = new Duck();//deze komt van duck clas
        myDuck.animalSound();
    }
}
