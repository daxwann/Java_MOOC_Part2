import java.util.ArrayList;

public class Suitcase {
    private int weightLimit;
    private int currentWeight;
    private ArrayList<Thing> things;

    public Suitcase(int weightLimit) {
        this.weightLimit = weightLimit;
        this.things = new ArrayList<Thing>();
        this.currentWeight = 0;
    }

    public void addThing(Thing thing) {
        if (this.currentWeight + thing.getWeight() <= this.weightLimit) {
            this.things.add(thing);
            this.currentWeight += thing.getWeight();
        }
    }

    public String toString() {
        int size = this.things.size();
        String countStr;

        if (size == 0) {
            countStr = "empty";
        } else if (size == 1){
            countStr = size + " thing";
        } else {
            countStr = size + " things";
        }
        return countStr + " (" + this.currentWeight + " kg)";
    }

    public void printThings() {
        for (Thing thing : this.things) {
            System.out.println(thing);
        }
    }

    public int totalWeight() {
        return this.currentWeight;
    }

    public Thing heaviestThing() {
        Thing heaviest = null;
        int heaviestWeight = 0;

        for (Thing thing : this.things) {
            if (thing.getWeight() > heaviestWeight) {
                heaviest = thing;
                heaviestWeight = thing.getWeight();
            }
        }

        return heaviest;
    }
}
