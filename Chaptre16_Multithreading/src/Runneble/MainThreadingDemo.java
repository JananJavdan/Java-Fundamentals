package Runneble;

import Les1.Demo;

public class MainThreadingDemo {
    public static void main(String[] args) {

        int n = 8; //number of thread
        for (int i = 0; i<n; i++){
            Thread object = new Thread(new ThreadingDemo());
            object.start();
        }
    }
}
