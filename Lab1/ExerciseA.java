package Lab1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Scanner;

public class ExerciseA {





    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner( System.in );

        System.out.println( "enter path of source file to copy from : " );
        File src = new File( scan.nextLine() );

        System.out.println( "enter path of destination file to copy to : " );
        File dest = new File( scan.nextLine() );


        FileChannel srcChannel = null;
        FileChannel destChannel = null;

        try {
            srcChannel = new FileInputStream( src ).getChannel();
            destChannel = new FileOutputStream( dest ).getChannel();
            destChannel.transferFrom( srcChannel , 0 , srcChannel.size() );
        } finally {
            srcChannel.close();
            destChannel.close();
        }


    }
}
