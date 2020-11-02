package fileIO.bufferedreader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedWriterDemo {
    public static void main(String[] args)throws IOException {
        Writer writer = new FileWriter("file22.txt");
        BufferedWriter bos = new BufferedWriter(writer);
        bos.write(67);
        bos.write(" this is a string ..");
        System.out.println("Success...");
        bos.flush();
        bos.close();
    }
}
