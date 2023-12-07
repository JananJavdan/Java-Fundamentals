package Runneble;

public class ThreadingDemo implements Runnable{

    @Override
    public void run() {
        try {
            //displaing the thread that is running
            System.out.println(
                    "Thread" +Thread.currentThread().getId()
                            +"is running");

        }catch (Exception e){
//Threading an exception
            System.out.println("Exception is caught");
        }
    }
        }







