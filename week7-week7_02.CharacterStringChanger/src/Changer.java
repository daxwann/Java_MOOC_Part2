import java.util.ArrayList;

public class Changer {
    private ArrayList<Change> changes;

    public Changer() {
        this.changes = new ArrayList<Change>();
    }

    public void addChange(Change change) {
        this.changes.add(change);
    }

    public String change(String word) {
        String newWord = String.valueOf(word);

        for (Change change : this.changes) {
            newWord = change.change(newWord);
        }

        return newWord;
    }
}
