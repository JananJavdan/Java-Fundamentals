package FileIo;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWriterExample {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            //path is een klass die wordt gebruikt om bestande- en maplocatie te reperesenteren en ermee te werken
            //de methode path.of() wordt gebruikt om een tekenreeks (in dit geval de bestande locatie ) om te zetten naar een
            Path path = Path.of("C:\\Users\\Intec\\Documents\\test1.txt");
            //de Files.createDirectories()-methode wordt gebruike om een path te nemen
            //en ervoor te zorgen dat alle mappen in dat pad bestaan
            Files.createDirectories(path.getParent());
            //deze code maakt een FileWriter-object aan met de opgegeven bestandelocatie
            fileWriter = new FileWriter(path.toString());
            fileWriter.write("Hi\n");
            fileWriter.write("Hallo\n");
            fileWriter.write("Bonjour\n");
         }catch (IOException ioException){
            ioException.printStackTrace();
        } finally {
            if (fileWriter != null){
                try {
                    fileWriter.close();

                }catch (IOException ioException)  {
                    ioException.printStackTrace();

                }
            }
        }
    }
}
//moat ik uitvoeren en dan de file zal in doc txt zal werken