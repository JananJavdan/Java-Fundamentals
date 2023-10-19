package Example4;

public class Child extends Parent{
    @Override
    void method() {
        super.method();

        System.out.println("Method from Child");
    }
}
