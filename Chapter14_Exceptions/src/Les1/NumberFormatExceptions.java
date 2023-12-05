package Les1;

public class NumberFormatExceptions {
    public static void main(String[] args) {
        int a;
// probeert de string "pant" om te zetten naar een geheel getal van het type int met behulp
// van de methode parseInt() van de Integer-klasse in Java.
        try {
            a=Integer.parseInt("Hello");
            System.out.println("A is :" +a);
        }catch (NumberFormatException exception){//deze Exception wordt gegenereerd wanneer de string die je probeert om te zetten naar een getal
           // exception.printStackTrace();
            System.out.println(exception.getMessage());
            System.out.println("Exceptions:"+exception);
        }
            System.out.println("Finally code werkt");
        }

//het is runTime exeptions

    }

