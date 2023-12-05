package FileIo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader1 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Intec\\Documents\\test2.txt"));
            System.out.println(reader.readLine());
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
//e.printStackTrace() gebruikt voor foutopsporing om gedetailleerde informatie
// over de uitzondering te verkrijgen, waaronder de lijnnummers en de oproepstapel
// (stack trace). Dit helpt bij het identificeren van waar en waarom de uitzondering
// is opgetreden tijdens de uitvoering van het programma.