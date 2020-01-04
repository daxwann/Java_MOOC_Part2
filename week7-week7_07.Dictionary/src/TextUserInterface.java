import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("Statements:");
        System.out.println("  add - adds a word pair to the dictionary");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quit - quits the text user interface");
        while (true) {
            System.out.print("Statement:");
            String command = this.reader.nextLine();

            if (command.equals("quit")) {
                System.out.println("Cheers!");
                break;
            }

            if (command.equals("add")) {
                add();
            } else if (command.equals("translate")) {
                translate();
            } else {
                System.out.println("Unknown statement");
            }
        }
    }

    public void add() {
        System.out.print("In Finnish: ");
        String finnish = this.reader.nextLine();
        System.out.print("Translation: ");
        String translation = this.reader.nextLine();
        this.dictionary.add(finnish, translation);
    }

    public void translate() {
        System.out.print("Give a word: ");
        String finnish = this.reader.nextLine();
        String translation = this.dictionary.translate(finnish);
        if (translation == null) {
            System.out.println("Word not in the dictionary");
        } else {
            System.out.println("Translation: " + translation);
        }
    }
}
