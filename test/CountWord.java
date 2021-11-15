package test;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class CountWord {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("D:\\intelliJ IDEA Projects\\AdvancedProgramming\\src\\test\\Source.txt");// Filereader copy from the source
        FileWriter fw = new FileWriter("D:\\intelliJ IDEA Projects\\AdvancedProgramming\\src\\test\\WordStatistic.txt");
        int c ; // create a variable
        String[] words=null;
        int wc=0;
        BufferedReader br = new BufferedReader(fr);
        String s;


        while((s = br.readLine())!= null){
            words = s.split(" ");
            wc = wc + words.length;
        }
        fw.write("Number of words in the file : ");
        fw.write(Integer.toString(wc));
        System.out.println("Number of words in the file:" +wc);
        fw.close();
        fr.close();
    }
}
