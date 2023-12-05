package Les1;

public class ExceptionsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0; //als hier in plats van 0 , 2 schrijven dan geen catch uitgevoert worden en code zal werken
        int c;
        try {
            c = a / b;
            System.out.println(c);
        }catch (ArithmeticException exception){
            System.out.println("Het getal kan niet door nul worden gedeeld. ");
        }finally {
            System.out.println("Finally blok werkt");
        }
        System.out.println("Code werkt");
    }
}
