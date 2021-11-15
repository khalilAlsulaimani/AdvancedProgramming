package test;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class CopyFile {
    public static void main(String[]args)throws IOException{
        FileReader fr = new FileReader("D:\\intelliJ IDEA Projects\\AdvancedProgramming\\src\\test\\Source.txt");// Filereader copy from the source
        FileWriter fw = new FileWriter("D:\\intelliJ IDEA Projects\\AdvancedProgramming\\src\\test\\Source.txt");// Filerwriter paste the source into the file destination
        int c ; // create a variable


        while ((c = fr.read()) != -1) {// copy the content from on file to another file if the reader doesn't see null
            fw.write(c);
        }

        fr.close();// close the file reader
        fw.close();// close the file writer
        System.out.println("File Copied Successfully");// print
    }
}
