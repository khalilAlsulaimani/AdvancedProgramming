package Theroy;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileAndDirectoryInfo {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter file or directory name :");

        Path path = Paths.get(scan.nextLine());

        if (Files.exists(path)) {
            System.out.printf("%n%s exits%n", path.getFileName());
            System.out.printf("%s a directory%n", Files.isDirectory(path) ? "is" : "is not");
            System.out.printf("%s an absoulute path%n", path.isAbsolute() ? "is" : "is not");


            System.out.printf("size %s%n", Files.size(path));


            System.out.printf("path: %s%n", path);
            System.out.printf("absoulte path: %s%n", path.toAbsolutePath());

            if (Files.isDirectory(path)) {
                System.out.printf("%nDirectory contents:%n");

                DirectoryStream<Path> directoryStream = null;
                try {
                    directoryStream = Files.newDirectoryStream(path);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                assert directoryStream != null;
                for (Path p : directoryStream) {
                    System.out.println(p);
                }
            } else {
                System.out.printf("%s does not exist%n", path);
            }

        }
    }
}
