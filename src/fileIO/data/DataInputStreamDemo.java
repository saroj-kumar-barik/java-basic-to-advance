package fileIO.data;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("file11.dat");
        DataInputStream dis = new DataInputStream(fis);
        double a = dis.readDouble();
        int b = dis.readInt();
        boolean c = dis.readBoolean();
        char d = dis.readChar();
        String s = dis.readUTF();
        System.out.println("Values: " + a + " " + b + " " + c + " " + d + " " + s);
    }
}
