package NonStaticExample;

public class LocalExample {
    //hier we hebben tussen de methode een inner class hebben
    public void run(){  // methode
        class Inner{
            int a;          //variabele

            public Inner(int a) {   //construction
                this.a = a;
            }
            public void print(){
                System.out.println(a);}
            }
            Inner inner = new Inner(10);
            inner.print();
        }
    }

