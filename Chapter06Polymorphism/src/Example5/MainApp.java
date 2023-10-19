package Example5;

public class MainApp {
    public static void main(String[] args) {

        String name = "Intec Brussel";
        System.out.println("Is name an instance of String: " + (name instanceof String));
        System.out.println("Is name an instance of Object class: " + (name instanceof Object));

        TestInstanceOf object01 = new TestInstanceOf();

        System.out.println("Is object01 a intance of testinstanceof?:" + (object01 instanceof TestInstanceOf));
        System.out.println("Is object01 a intance of DifferntTest?:" + (object01 instanceof DifferentTest));

        DifferentTest object02 = new DifferentTest();
        System.out.println("Is Object02 a instance of TestInstanceOf: " + (object02 instanceof TestInstanceOf));
        System.out.println("Is Object02 a instance of DifferentTestClass: " + (object02 instanceof DifferentTest));

        TestInstanceOf test = null;
        System.out.println("Is test an instance of TestInstanceof: " + (test instanceof TestInstanceOf));


    }
}
