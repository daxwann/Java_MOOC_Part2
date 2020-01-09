import java.util.ArrayList;

public class Participant {
    private String name;
    private int points;
    private ArrayList<Distance> jumps;

    public Participant(String name) {
        this.name = name;
        this.points = 0;
        this.jumps = new ArrayList<Distance>();
    }

    public void addPoints(int points) {
        this.points += points;
    }

    public String getName() {
        return this.name;
    }

    public int getPoints() {
        return this.points;
    }

    public String toString() {
        return this.name + " (" + this.points + ")";
    }

    public void addJump(Distance distance) {
        this.jumps.add(distance);
    }

    public void printJumps() {

    }
}
