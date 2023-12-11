package Synchronize;

public class InnerThread extends Thread{
    private ThreadExample example;
    public InnerThread(ThreadExample example){
        this.example = example;
    }

    @Override
    public void run() {
        try {
            example.incrementCount();
            Thread.sleep(3000);
            System.out.println("Hallo vanaf thread "+this.getId()+", count is nu "+example.getCount());

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

