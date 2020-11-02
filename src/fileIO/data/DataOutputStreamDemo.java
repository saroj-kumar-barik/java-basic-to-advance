package fileIO.data;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamDemo {
//    write primitive Java data types - int char floate
//    to the output stream in a machine-independent way.
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("file11.dat");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeDouble(1.1);
        dos.writeInt(55);
        dos.writeBoolean(true);
        dos.writeChar('4');
        dos.writeUTF("hello, Happy Dussera");
        dos.flush();
        System.out.println("Success...");
    }
}
