package OefeningFileIO;

import java.io.*;

public class MainLievelingsDier {
    public static void main(String[] args) {
        //instanciereen
        LievelingsDier mylievelingsDier = new LievelingsDier("Eekhoorn", false);
        String sourceFile = "C:\\Users\\Siamak\\FromJananToHilal\\animal.txt";
        String destinationFile = "C:\\Users\\Siamak\\FromJananToHilal\\newanimal.txt";
        //sla het dier op animal.txt
        try {
            InputStream inputStream = new FileInputStream(sourceFile);
            OutputStream outputStream = new FileOutputStream(destinationFile);

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            inputStream.close();
            outputStream.close();

            System.out.println("Mijn Lievelings Dier is:"+mylievelingsDier.getName());

        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
