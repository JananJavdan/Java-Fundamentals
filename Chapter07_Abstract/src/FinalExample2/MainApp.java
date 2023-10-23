package FinalExample2;

public class MainApp {
    public static void main(String[] args) {
        final StringBuilder sb = new StringBuilder("Intec");
        // Printing the element
        System.out.println("Before the change:" + sb);
        // changing internal state of object reference by final reference variable sb
        sb.append("Brussel");
        // Again printing the element after appending the above element in it
        System.out.println("After the change:" + sb);
    }

}
