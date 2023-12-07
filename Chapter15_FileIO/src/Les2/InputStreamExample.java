package Les2;

import java.io.*;

public class InputStreamExample {
    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\Siamak\\Documents\\test1.txt";
        String destinationFile = "C:\\Users\\Siamak\\Documents\\newtest1.txt";
        try (
            InputStream inputStream = new FileInputStream(sourceFile);
            OutputStream outputStream = new FileOutputStream(destinationFile))
            {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
                System.out.println("File copied susscesfully");

            }catch(IOException e){
                e.printStackTrace();
            }

        }

    }

