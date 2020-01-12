package file;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        // test your code here

        File file = new File("src/test.txt");

        try {
            Analysis analyze = new Analysis(file);
            System.out.println(analyze.characters());
        } catch (Exception e) {
            System.out.println("File not valid");
        }
    }
}
