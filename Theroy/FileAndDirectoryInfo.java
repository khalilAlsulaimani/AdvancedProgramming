package Theroy;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileAndDirectoryInfo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter file or directory name :");

        Path path = Paths.get(scan.nextLine());

        if(Files.exists(path)){
            System.out.printf("%n%s exits%n" , path.getFileName());
        }
    }
}
