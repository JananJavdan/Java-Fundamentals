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
        heart = new Thread(new HeartBeat(heartBeatMilliSecondens), name);
        breathing = new Thread(new Lungs(), name);
        life = new Thread(this, name);
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
        heart.interrupt();
        breathing.interrupt();
        System.out.println("person died");

    }
    //In deze methode ga je elke seconde een Random klasse gebruiken die to 20 gaat.
// Als je op 13 belandt, dan stopt de life Thread en sterft de persoon.
    @Override
    public void run() {
        Random random = new Random();
        for (int i = age; i<100; i++){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(life.getName()+i);

            if (random.nextInt(20)==13){
                System.out.println("stopt de life");
                break;

            }
        }
        endLife();




    }
}
