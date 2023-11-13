public class Main {
    public static void main(String[] args) {

//        NonStatic n=new NonStatic();
//        NonStatic.Inner inner=n.new Inner();
//        inner.run();
//        n.run();



        Static.Inner s= new Static.Inner();
        s.run();
    }
}