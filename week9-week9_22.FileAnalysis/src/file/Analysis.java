package file;
import java.io.File;
import java.util.Scanner;

public class Analysis {
    private File file;
    private Scanner reader;

    public Analysis(File file) throws Exception {
        this.file = file;
        this.reader = new Scanner(this.file);
    }

    public int lines() throws Exception {
        this.reader = new Scanner(this.file);
        int lines = 0;

        while (this.reader.hasNextLine()) {
            this.reader.nextLine();
            lines++;
        }

        this.reader.close();
        return lines;
    }

    public int characters() throws Exception {
        this.reader = new Scanner(this.file);
        int chars = 0;

        while (this.reader.hasNextLine()) {
            String line = this.reader.nextLine();

            chars += line.length() + 1;
        }

        this.reader.close();
        return chars;
    }
}
