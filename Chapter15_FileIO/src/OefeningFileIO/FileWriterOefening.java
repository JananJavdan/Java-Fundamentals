package OefeningFileIO;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriterOefening {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            //Stap 1 : Pad naar de bestanden
            Path messagePath = Path.of("C:\\Users\\Siamak\\FromJananToHilal\\message.txt");
            Path animalPath = Path.of("C:\\Users\\Siamak\\FromJananToHilal\\animal.txt");
            //Stap 2 : controleer of de bestanden en map bestaan
            Files.createDirectories(messagePath.getParent());
            fileWriter = new FileWriter(messagePath.toString());
            fileWriter = new FileWriter(animalPath.toString());
            fileWriter.write("Hallo Hilal \n");
            fileWriter.write("dit is een lueke boodschap\n");
            fileWriter.write("From Janan To Hilal\n");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (fileWriter != null){
        }try {
                fileWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
            }
        try {
            Path animalPath = Paths.get("C:\\Users\\Siamak\\FromJananToHilal\\animal.txt");
            Files.createDirectories(animalPath.getParent());
            fileWriter.write("From Janan To Hilal");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (fileWriter != null){
            }try {
                fileWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        String messageContent = "Dit is een lueke boodschap";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Siamak\\FromJananToHilal\\message.txt"));
            writer.write(messageContent);
            writer.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
