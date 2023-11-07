package Oefening1;

public class OuterClass {
    private int x = 5;
    private int y = 10;

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public static class MathFunction{

       public int sum(){
           return 0;
       }
       public int min(){
           return 0;
       }
       public int max(){
           return 0;
       }
   }
}
