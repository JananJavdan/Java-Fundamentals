package Les1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionExample2 {
    public static void main(String[] args) {
        String a = "C:\\Users\\intec\\Dekstop\\exceptions.docx";
        try {
            FileInputStream fis = new FileInputStream(a);
            System.out.println("Deze file bestat");
        } catch (FileNotFoundException exception) {
            //System.out.println(exception.getMessage());
           // System.out.println("exceptions" + exception);
            System.out.println("Deze bestand bestatt niet");

        }
    }
}//compileTime error
