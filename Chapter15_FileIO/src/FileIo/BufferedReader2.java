package FileIo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader2 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Intec\\Documents\\test3.txt"));
            String line;
            while ((line = reader.readLine()) != null){//niet null retorneert
                System.out.println(line);//: Binnen de lus wordt elke regel die is gelezen met readLine() afgedrukt 
            }
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
