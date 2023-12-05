package Les2;
// throw dezelfde met try en cash maar met throw gemakelijker
public class ExceptionsThrow {
    public static void main(String[] args) {
        ageCheck(20);
    }//throw is een keyword van exception ( schrijven in dezelfde sub classen is belagrijk)exception naam is ook belangrijk
    public static void ageCheck(Integer num) throws ArithmeticException,NumberFormatException{//hier kunne merdere exception tovoegen
        if (num < 18){
            //gooie exception mrt java throw keyword
            throw new ArithmeticException("U mag niet stemmen");
        }
        else {
            System.out.println("U kunt stemmen");
        }
    }
}
