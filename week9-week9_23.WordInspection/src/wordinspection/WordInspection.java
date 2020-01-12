package wordinspection;

import java.io.File;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class WordInspection {
    private File file;
    private Scanner reader;

    public WordInspection(File file) throws Exception {
        this.file = file;
        this.reader = new Scanner(file, "UTF-8");
    }

    public int wordCount() throws Exception {
        this.reader = new Scanner(this.file, "UTF-8");
        int words = 0;

        while (this.reader.hasNext()) {
            this.reader.next();
            words++;
        }

        this.reader.close();
        return words;
    }

    public List<String> wordsContainingZ() throws Exception {
        List<String> wordsWithZ = new ArrayList<String>();
        this.reader = new Scanner(this.file, "UTF-8");

        while (this.reader.hasNext()) {
            String word = this.reader.next();

            if (word.toLowerCase().contains("z")) {
                wordsWithZ.add(word);
            }
        }

        this.reader.close();
        return wordsWithZ;
    }

    public List<String> wordsEndingInL() throws Exception {
        List<String> wordsEndWithL = new ArrayList<String>();
        this.reader = new Scanner(this.file, "UTF-8");

        while (this.reader.hasNext()) {
            String word = this.reader.next();

            if (word.charAt(word.length() - 1) == 'l') {
                wordsEndWithL.add(word);
            }
        }

        this.reader.close();
        return wordsEndWithL;
    }

    public List<String> palindromes() throws Exception {
        List<String> palindromes = new ArrayList<String>();
        this.reader = new Scanner(this.file, "UTF-8");

        while (this.reader.hasNext()) {
            String word = this.reader.next();

            if (isPalindrome(word)) {
                palindromes.add(word);
            }
        }

        this.reader.close();
        return palindromes;
    }

    private boolean isPalindrome(String word) {
        for (int i = 0; i <= (word.length() / 2); i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public List<String> wordsWhichContainAllVowels() throws Exception {
        List<String> wordsWithAllVowels = new ArrayList<String>();
        this.reader = new Scanner(this.file, "UTF-8");

        while (this.reader.hasNext()) {
            String word = this.reader.next();

            if (hasAllVowels(word)) {
                wordsWithAllVowels.add(word);
            }
        }

        this.reader.close();
        return wordsWithAllVowels;
    }

    private boolean hasAllVowels(String word) {
        String[] array = {"a", "e", "i", "o", "u", "y", "ö", "ä"};
        Set<String> vowels = new HashSet<String>(Arrays.asList(array));

        for (int i = 0; i < word.length(); i++) {
            vowels.remove(String.valueOf(word.charAt(i)));

            if (vowels.isEmpty()) {
                return true;
            }
        }

        return false;
    }
}
