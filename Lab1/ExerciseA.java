package Lab1;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ExerciseA {

    public static void copyFile(File src , File dest) throws IOException {
        FileChannel srcChannel = null;
        FileChannel destChannel = null;

        try {
            srcChannel = new FileInputStream( src ).getChannel();
            destChannel = new FileOutputStream( dest ).getChannel();
            destChannel.transferFrom( srcChannel , 0 , srcChannel.size() );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            srcChannel.close();
            destChannel.close();
        }
    }


    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner( System.in );

        System.out.println( "enter path of source file to copy from : " );
        File src = new File( scan.nextLine() );

        System.out.println( "enter path of destination file to copy to : " );
        String destPath = scan.nextLine();

        Path path = Paths.get( destPath );

        if (Files.exists( path )) {
            File dest = new File( destPath );
            ExerciseA.copyFile( src , dest );

        } else {
            File backupFile = new File( "D:\\Desktop\\uni\\Year 3\\Advanced Programming Theory\\backup.txt" );
            ExerciseA.copyFile( src , backupFile );

        }


    }
}
