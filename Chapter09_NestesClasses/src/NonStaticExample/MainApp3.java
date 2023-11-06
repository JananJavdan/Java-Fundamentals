package NonStaticExample;

public class MainApp3 {
    public static void main(String[] args) {
        NonStaticExample myNonStatic = new NonStaticExample();
        NonStaticExample.Inner myInner = myNonStatic.new Inner();
        myNonStatic.run();
        myInner.run();
    }
}
