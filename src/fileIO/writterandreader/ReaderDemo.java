package fileIO.writterandreader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderDemo {
    public static void main(String[] args)throws IOException {
        Reader reader = new FileReader("text1.txt");
        int i;
        while ((i =reader.read())!= -1)
        {
            System.out.print((char)i);
        }
    }
}
