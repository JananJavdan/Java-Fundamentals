package Project1;

import java.util.Random;

public class Person implements Runnable{
    private String name;
    private int age;
    private Thread heart;
    private Thread breathing;
    private Thread life;

    public Person(String name, int age, int heartBeatMilliSecondens) {
        this.name = name;
        this.age = age;
    }

    public Person(Thread heart, Thread breathing, Thread life, Runnable lungs) {
        this.heart = heart;
        this.breathing = breathing;
        this.life = new Thread(()-> {   //De laatste twee Threads moeten stoppen als de ‘life’ Thread stopt.
            heart.start();
            breathing.start();
            try {
                heart.join();
                breathing.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        });
        life.start();
    }
//In deze methode ga je elke seconde een Random klasse gebruiken die to 20 gaat.
// Als je op 13 belandt, dan stopt de life Thread en sterft de persoon.
    @Override
    public void run() {
        for (int i = 26; i<100; i++){
            try {
                Thread.sleep(1000);
                int randomNUmber = new Random().nextInt(20);
                System.out.println("Randomnumer generegerd:"+randomNUmber);
                if (randomNUmber == 13){
                    System.out.println("Stopt de life Thread");
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
    //De startLife() methode gebruik je om de Threads te starten
    public void startLife(){
       life.start();
       heart.start();
       breathing.start();

         }
//De endLife() methode wordt enkel opgeroepen als de persoon sterft, en het interrupt de life Thread.
// De heartBeat en Lungs stoppen automatisch als de Life Thread stopt.
    public void endLife(){
        life.interrupt();
        breathing.interrupt();



    }
}
