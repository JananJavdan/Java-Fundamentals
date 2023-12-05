package FileIo;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            //dit object wordt gebruikt om het tekstbestande te lezen
            fileReader = new FileReader("C:\\Users\\Intec\\Documents\\test1.txt");

            //er wordt een positie -variabele gedefinered om de gelezen in het bestand bij te houden
            int position;

            //de waarde (position = filereader.read()) ! -1 controllert of er nog karakteren zijn om te lezen
            //zolang er karakteren zijn , wordt de lus herhalen
            while ((position = fileReader.read()) != -1){
                System.out.print((char) position);//zonder ln
            }
        }catch (IOException ioException){
            ioException.printStackTrace();
            System.out.println("Deze bestand bestaat niet");
        }finally {
            //deze code controleert od de filereader niet null is en probeert vervolgens de filereader te sluiten
            if (fileReader != null){
                try {
                    fileReader.close();

                }catch (IOException ioException){
                    ioException.printStackTrace();
                }
            }
        }
    }
}
