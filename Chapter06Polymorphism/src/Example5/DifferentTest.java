package Example5;

public class DifferentTest extends TestInstanceOf {
    public static void method01(TestInstanceOf test){
        if (test instanceof DifferentTest){
            DifferentTest dt = (DifferentTest) test;
            System.out.println("Downcasting works!");
        }
    }
}
