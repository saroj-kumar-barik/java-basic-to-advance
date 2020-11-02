package fileIO.writterandreader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo {
    public static void main(String[] args)throws IOException {
        char[] arr = new char[] {'a','b'};
        Writer writer = new FileWriter("text1.txt");
        writer.write(70);
        writer.write("the ascii character of 70 written before");
        writer.write(arr);
        writer.close();
        System.out.println("success");
    }
}
