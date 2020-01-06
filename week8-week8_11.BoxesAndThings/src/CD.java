public class CD implements ToBeStored {
    private String title;
    private String artist;
    private int year;
    private double weight;

    public CD(String artist, String title, int year) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.weight = 0.1;
    }

    public double weight() {
        return this.weight;
    }

    public String toString() {
        return this.artist + ": " + this.title + " (" + this.year + ")";
    }
}
