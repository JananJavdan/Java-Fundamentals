package Les2;

public class Main {
    public static void main(String[] args) {
        //extend thread
        //vreer een subklas van thread
        MyThread thread1 = new MyThread();
        //implements runnable
        //pas een instance als een argument in thread
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        //thread1.setDaemon(true);
        //thread2.setDaemon(true);

        thread1.start();
        //thread1.join(3000);
        thread2.start();

    }
}
