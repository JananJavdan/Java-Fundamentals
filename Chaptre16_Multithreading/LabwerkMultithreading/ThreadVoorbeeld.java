package LabwerkMultithreading;

public class ThreadVoorbeeld {
    private int Count = 0;
    public int getCount() {
        return Count;
    }
    public static void main(String[] args) throws InterruptedException {
        // Maak een instantie van de Thread-klasse
        InnerThread thread1 = new InnerThread();
        InnerThread thread2 = new InnerThread();
        InnerThread thread3 = new InnerThread();
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();

        System.out.println("Hallo vanaf de hoofdthread");
    }
    //Maak een nieuwe innerlijke klasse die de Thread-klasse uitbreidt
    private static class InnerThread extends Thread{
        private ThreadVoorbeeld voorbeeld;
        public InnerThread(ThreadVoorbeeld voorbeeld) {
            this.voorbeeld = voorbeeld;
        }
        public InnerThread() {
        }
        @Override
        public void run() {
            try {
                // Roep de synchronized-methode aan om race-voorwaarden te voorkomen
                voorbeeld.incrementCount();
                Thread.sleep(1000);
                System.out.println("Hallo vanaf thread "+this.getId() +", count is nu "+voorbeeld.getCount());
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
            }

    //Gebruik synchronized om race-voorwaarden te voorkomen
    public synchronized void incrementCount(){
        Count++;
    }


}
