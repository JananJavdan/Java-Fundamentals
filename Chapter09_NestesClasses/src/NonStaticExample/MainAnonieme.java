package NonStaticExample;

public class MainAnonieme {
    public static void main(String[] args) {
        Anonieme a=new Anonieme(){  //tussen acalodes is het de methode gaat werken
            public void run(){
                System.out.println("De run methode van anonieme klasse");
            }
         //   public void print(){
             //   System.out.println("print");
         //   }
        }; // met ; zal niet werken
        a.run();
       // a.print();
    }
}
