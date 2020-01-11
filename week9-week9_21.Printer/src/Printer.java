import java.util.Scanner;
import java.io.File;

public class Printer {
    private Scanner reader;
    private File file;

    public Printer(String filename) throws Exception {
        this.file = new File(filename);
        this.reader = new Scanner(file, "UTF-8");
    }

    public void printLinesWhichContain(String word) throws Exception {
        while (reader.hasNextLine()) {
            String line = reader.nextLine();

            if (word.isEmpty() || line.contains(word)) {
                System.out.println(line);
            }
        }

        this.reader.close();
        this.reader = new Scanner(this.file, "UTF-8");
    }
}
