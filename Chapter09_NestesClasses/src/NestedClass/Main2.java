public class Main2 {

    public static void main(String[] args) {
//        Local l=new Local();
//        l.run();


        Anonieme a=new Anonieme(){
            @Override
            public void run() {
                System.out.println("De run methode van anonieme klas");
            }
        };
//        public void print(){
//            System.out.println("print");
//        }


        a.run();
    }
}
