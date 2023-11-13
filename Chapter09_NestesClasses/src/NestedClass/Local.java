public class Local {

    public void run(){
        class Inner{
            int a;

            public Inner(int a) {
                this.a = a;
            }
            public void print(){
                System.out.println(a);
            }
        }
        Inner inner=new Inner(10);
        inner.print();
    }
}
