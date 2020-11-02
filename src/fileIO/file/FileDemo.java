package fileIO.file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {

    public static void main(String[] args)throws IOException {
// checking a file is present or not with its properties
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a path name : ");

        String pathname = sc.nextLine();
        File file = new File(pathname); // "C:\\Users\\BABLU\\IdeaProjects\\java"
        File file1 = new File("C:\\Users\\BABLU");
        // to create a new file in the specified path
//        System.out.println(file.createNewFile());
        // to create a new directory in the specified path
        System.out.println(file.mkdir()+" : Folder created"); // mkdir returns boolean value if the creation is
        // successful or not...

        System.out.println("File name :" + file.getName());
        System.out.println("Path : " + file.getPath());
        System.out.println("Absolute path :" + file.getAbsolutePath());
        System.out.println("Parent:" + file.getParent());
        System.out.println("Exists :" + file.exists());
        System.out.println("Free space : "+file.getFreeSpace());

        if (file.exists()) {
            System.out.println("Is writeable :" + file.canWrite());
            System.out.println("Is readable :" + file.canRead());
            System.out.println("Is a directory :" + file.isDirectory());
            System.out.println("File Size in bytes : " + file.length());

            // checks whether the given path is equals or not with path compared - here file is given and file1 is
            // compared path
            // if same - returns 0
            // if small - returns -ve
            // if big - returns +ve
            System.out.println("Comparing two paths : "+file.compareTo(file1)); // 0 +ve -ve
            System.out.println("deleting file....");
            // will delete a file
            System.out.println(file.delete());
        }
        // to check the contents of a directory
        // list() returns an array of strings
        String[] list = file.list(); // return the files and directories(folders) in the specified path
        for (int i = 0; i < list.length; i++) {
            File f1 = new File(list[i]);
            if (f1.isFile())
                System.out.println(list[i] + " is a file");
            else if (f1.isDirectory())
                System.out.println(list[i] + " is a directory/folder");
            else
                System.out.println(" No files or folders present..");
        }
    }
}
