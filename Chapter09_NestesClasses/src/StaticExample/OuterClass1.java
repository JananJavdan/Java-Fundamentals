package StaticExample;

public class OuterClass1 {
    private int outerX = 10;
    public static class InnerClass{
        private int staticInnerX = 5;

        public int getStaticInnerX() {
            return staticInnerX;
        }

        public void setStaticInnerX(int staticInnerX) {
            this.staticInnerX = staticInnerX;
        }
        //getter and setter

    }

    public int getOuterX() {
        return outerX;
    }

    public void setOuterX(int outerX) {
        this.outerX = outerX;
    }
}
