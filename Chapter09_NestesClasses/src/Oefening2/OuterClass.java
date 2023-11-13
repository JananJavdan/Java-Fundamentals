package Oefening2;

public class OuterClass {

    private int x = 5;
    private int y = 10;

    public OuterClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public class Math implements MathFunctions {
        @Override
        public double product() {
            return 5*10;
        }

        @Override
        public double division() {
            return 5/10;
        }

    }
}

