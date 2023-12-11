package Synchronize;//als ik meerdere Threads tegelijkertijd aan hetzelfde object werken :
//bedoel van synchornized is geen data verliezen(zorgt dat geen data verliezen) met count synchorizied goed zonder count niet goed( om zeker te zijn 'synchorinized gebruiken)
public class ThreadExample {
    private int count=0;
    public int getCount(){
        return count;
    }
    public static void main(String[] args) throws InterruptedException{
        ThreadExample example=new ThreadExample();
        InnerThread thread1 = new InnerThread(example);
        InnerThread thread2 = new InnerThread(example);
        thread1.start();
        thread1.join();
        thread2.start();
        System.out.println("Hallo vanaf de hoofdthraed");
    }
    public synchronized void incrementCount(){
        count++;
    }
    //Dit betekent dat de methode is gesynchroniseerd. Wanneer een methode als synchronized
    // wordt gemarkeerd, betekent dit dat slechts één thread tegelijkertijd die methode kan
    // uitvoeren voor een specifiek object. Het zorgt voor threadveiligheid door te voorkomen
    // dat meerdere threads tegelijkertijd toegang hebben tot die methode.

//en we hebben 3c manieren voor synchronize te doen
    //synchornize met appartre object
    //synchornie met class
    //synchornie met methode
}
//De code thread1.join(); is een instructie in Java die wordt gebruikt om aan te geven
// dat het huidige (of een andere) draad moet wachten totdat thread1 is voltooid voordat
// het verdergaat met zijn eigen uitvoering.
//کد thread1.join(); یک دستورالعمل در جاوا است که برای نشان دادن اینکه رشته فعلی
// (یا دیگری) باید منتظر بماند تا thread1 قبل از ادامه اجرای خود، کامل شود.
