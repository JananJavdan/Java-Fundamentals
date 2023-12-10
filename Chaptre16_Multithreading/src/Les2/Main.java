package Les2;

public class Main {
    public static void main(String[] args) {
        //extend thread
        //creer een subklas van thread
        MyThread thread1 = new MyThread();
        //implements runnable
        //pas een instance als een argument in thread
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        //thread1.setDaemon(true);//Daemon threads zijn achtergrondthreads die niet voorkomen dat het programma eindigt als ze nog actief zijn.
        //thread2.setDaemon(true);//. رشته‌های Daemon رشته‌های پس‌زمینه‌ای هستند که در صورتی که هنوز در حال اجرا هستند، مانع از پایان برنامه نمی‌شوند.

        thread1.start();
        //thread1.join(3000);//De join()-methode wordt gebruikt om te wachten op het einde van een thread
        thread2.start();

    }
}
