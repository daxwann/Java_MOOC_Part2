import java.util.ArrayList;

public class Container {
    private int weightLimit;
    private int currentWeight;
    private ArrayList<Suitcase> suitcases;

    public Container(int weightLimit) {
        this.weightLimit = weightLimit;
        this.currentWeight = 0;
        this.suitcases = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.currentWeight + suitcase.totalWeight() <= this.weightLimit) {
            this.suitcases.add(suitcase);
            this.currentWeight += suitcase.totalWeight();
        }
    }

    public String toString() {
        int size = this.suitcases.size();
        String countStr;

        if (size == 0) {
            countStr = "empty";
        } else if (size == 1){
            countStr = size + " suitcase";
        } else {
            countStr = size + " suitcases";
        }
        return countStr + " (" + this.currentWeight + " kg)";
    }

    public void printThings() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printThings();
        }
    }
}
