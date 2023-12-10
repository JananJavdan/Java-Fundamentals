package Les1;
//methode sleep
public class ExampleSleep {
    public static void main(String[] args) {
        try {
            Thread thread1 = new Thread(new MijnThread("@", 10));
            Thread thread2 = new Thread(new MijnThread("-", 100));
            System.out.println(thread1.getState());
            System.out.println(thread2.getState());
            thread1.start();
            thread2.start();

            Thread.sleep(2000);//deze methode gebruiken we als een thread een bepaalde tijd geen bewerkingen wil uitvoeren
            System.out.println(thread1.getState());
            thread1.interrupt();//om een slapende Thread wakker te maken, gebruik je de methode interrupt
            System.out.println(thread1.getState());
            Thread.sleep(500);
            thread1.interrupt();
            Thread.sleep(500);
            thread1.interrupt();
        }catch (InterruptedException exception){
            exception.printStackTrace();
        }
    }
}
