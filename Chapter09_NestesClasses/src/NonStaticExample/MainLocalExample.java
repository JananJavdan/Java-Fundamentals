package NonStaticExample;

public class MainLocalExample {
    public static void main(String[] args) {
        //object maken van outer class
        LocalExample l = new LocalExample();
        //en hier object aan roepen
        l.run();
    }
}
