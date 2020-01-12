package dictionary;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    private Map<String, Set<String>> translations;

    public PersonalMultipleEntryDictionary() {
        this.translations = new HashMap<String, Set<String>>();
    }

    public void add(String word, String entry) {
        if (!this.translations.containsKey(word)) {
            this.translations.put(word, new HashSet<String>());
        }

        this.translations.get(word).add(entry);
    }

    public Set<String> translate(String word) {
        if (this.translations.containsKey(word)) {
            return this.translations.get(word);
        }

        return null;
    }

    public void remove(String word) {
        this.translations.remove(word);
    }
}
