package tools;

import java.util.Set;
import java.util.HashSet;

public class PersonalDuplicateRemover implements DuplicateRemover {
    private Set<String> characterStrings;
    private int duplicates;

    public PersonalDuplicateRemover() {
        this.characterStrings = new HashSet<String>();
        this.duplicates = 0;
    }

    public void add(String characterString) {
        if (this.characterStrings.contains(characterString)) {
            this.duplicates++;
        } else {
            this.characterStrings.add(characterString);
        }
    }

    public int getNumberOfDetectedDuplicates() {
        return this.duplicates;
    }

    public Set<String> getUniqueCharacterStrings() {
        return this.characterStrings;
    }

    public void empty() {
        this.characterStrings.clear();
        this.duplicates = 0;
    }
}
