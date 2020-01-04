import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.ArrayList;

public class Dictionary {
    private HashMap<String, String> dictionary;

    public Dictionary() {
        this.dictionary = new HashMap<String, String>();
    }

    public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        }

        return null;
    }

    public void add(String word, String translation) {
        if (this.dictionary.containsKey(word)) {
            System.out.println("Translation already exists");
        } else {
            this.dictionary.put(word, translation);
        }
    }

    public int amountOfWords() {
        return this.dictionary.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> wordPair = new ArrayList<String>();

        for (String word : this.dictionary.keySet()) {
            wordPair.add(word + " = " + this.dictionary.get(word));
        }

        return wordPair;
    }
}
