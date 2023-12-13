package Project1;

public class Lungs implements Runnable{
    private boolean lungsFull;
    public void Lungs(){

    }
//De run methode gaat een oneindige loop zijn.
    @Override
    public void run() {
        while (true){
            if (lungsFull){
                System.out.println(Thread.currentThread().getName()+"Breath out");
            }else {
                lungsFull = false;
                System.out.println(Thread.currentThread().getName()+"Breath on");
              

            }try {
                Thread.sleep(1000);//Wacht 1 seconde voordat het opnieuw wordt afgedrukt
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }
}
