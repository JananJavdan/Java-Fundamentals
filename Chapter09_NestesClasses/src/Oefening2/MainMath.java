package Oefening2;

public class MainMath {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass(5,10);//object van outer class
        OuterClass.Math math = myOuter.new Math();//object van inner class
        System.out.println(math.division());
        System.out.println(math.product());
    }
}
