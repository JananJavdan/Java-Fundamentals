public class Static {

    private int a=10;
    private static int b=2;

    public static class Inner{
        int b=1;

        public void run(){
            System.out.println(b);
            System.out.println(this.b);
            System.out.println(Static.b);
           // System.out.println(Static.this.a); niet juist
        }
    }
}
