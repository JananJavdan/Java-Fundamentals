package Les1;

public class MainMyInterface {
    public static void main(String[] args) {
        //decelare a reference to myInterface
        //assign a lambda expression to the reference
        MyInterface ref = (str) -> {   //str is de naam , mag je zelf kiezen
            String result = "";
            for (int i = str.length()-1; i >= 0; i--)
                result += str.charAt(i);
            return result;

        };
        //call th e methode of the interface
        System.out.println("Lambda reversed = " + ref.reverse("Lambda"));
    }
}
