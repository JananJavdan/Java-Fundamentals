package Les1;

public class ExampleJoin {
    public static void main(String[] args) {
        try {
            Thread studeren = new Thread(new MijnThread());
            Thread gamen = new Thread(new MijnThread());
            Thread eten = new Thread(new MijnThread());

            //je begint met studeren
            studeren.start();

            //je beslist na 1000 ms om tijdens het studeren te gamen
            studeren.join();

            //gamen start dus pas na die 1000 ms
            gamen.start();

            //je specifieert geen tijd
            gamen.join();

            //pas als je klaar bent met studeren en gamene ga je eten
            eten.start();
        }catch (InterruptedException exception){
            exception.printStackTrace();
        }
    }
}
