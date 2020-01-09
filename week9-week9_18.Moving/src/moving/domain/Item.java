package moving.domain;

public class Item implements Thing, Comparable<Item> {
    private String name;
    private int volume;

    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.volume + " dm^3)";
    }

    public int compareTo(Item otherItem) {
        if (this.volume > otherItem.getVolume()) {
            return 1;
        } else if (this.volume < otherItem.getVolume()) {
            return -1;
        } else {
            return 0;
        }
    }
}
