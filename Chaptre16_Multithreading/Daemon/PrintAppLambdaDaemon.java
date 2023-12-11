package Daemon;

import static jdk.nashorn.internal.objects.Global.print;

public class PrintAppLambdaDaemon {
    public static void main(String[] args) {
        Thread thread1 = new Thread(()->print(ThreadColors.ANSI_BLUE+"1",100));//met lambda
        Thread thread2 = new Thread(()->print(ThreadColors.ANSI_GREEN+"2",100));
//in dit geval kan de uitvoering van thread2 eindigen wanner de mainmethode is voltooid
        thread2.setDaemon(true);// deze thread zal werken tot einde van het main methode
        thread1.start();
        thread2.start();
        //om antaal beschikbare core op te vragen
        System.out.println(Runtime.getRuntime().availableProcessors());//hoeveelprosesee mag afgedrukt worden 8 keer
    }

    public static void print(String text, int count){
        for (int j = 0; j<count; j++){
            System.out.print(text);
            //de lus binnen de print methode roept bij elke stap Thread.yield() aan,
            //waardoor de processortijd beschikbaar wordt gemaakt voor doorgeven aan andere threads
            Thread.yield();// ook mogen we data verliezen(beetja gevarlijk)
        }
    }
}
