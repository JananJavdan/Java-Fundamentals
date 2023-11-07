package NonStaticExample;

public class MainOuterClass {
    public static void main(String[] args) {
        //eerst make een nieuw object van outer class
        OuterClass2 myOuter = new OuterClass2();
        //zijn dezelfde                met de object naam maken we een instantie
        OuterClass2.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.Y + myOuter.x);
    }
}
