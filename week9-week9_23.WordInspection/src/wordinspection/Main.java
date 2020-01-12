package wordinspection;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        // test your code here

        File file = new File("src/shortList.txt");
        // all words are in file src/wordList.txt
        try {
            WordInspection inspector = new WordInspection(file);

            for (String word : inspector.wordsWhichContainAllVowels()) {
                System.out.println(word);
            }
        } catch (Exception e) {
            System.out.println("invalid file");
        }
    }
}
