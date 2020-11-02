package fileIO.streams;

import java.io.IOException;

public class StreamsDemo {
    public static void main(String[] args) throws IOException {
        // Streams in java by default
        // System.out
        // System.in
        // System.err
        System.out.println("output printed here");
        System.err.println("error printed here");
        System.out.println("Enter message : ");
        int i = System.in.read(); // reads 1st character the input as (ASCII) character - "The Martians", "Gravity"
        System.out.println((char)i);
    }
}
