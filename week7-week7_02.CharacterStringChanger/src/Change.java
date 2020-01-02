public class Change {
    private char fromChar;
    private char toChar;

    public Change(char fromChar, char toChar) {
        this.fromChar = fromChar;
        this.toChar = toChar;
    }

    public String change(String word) {
        String newWord = "";

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == this.fromChar) {
                newWord += this.toChar;
            } else {
                newWord += word.charAt(i);
            }
        }

        return newWord;
    }
}
