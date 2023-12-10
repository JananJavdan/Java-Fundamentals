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
//yield(); sleep();join();
//deze methodes kunnen we gebruiken als we een uitvoering van een thread wilen vertragen of de willekeurigheid beinvloeden

