import java.util.ArrayList;

public class Participant {
    private String name;
    private int points;
    private ArrayList<Integer> jumps;

    public Participant(String name) {
        this.name = name;
        this.points = 0;
        this.jumps = new ArrayList<Integer>();
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

    public void addJump(int length) {
        this.jumps.add(length);
    }

    public String getJumps() {

        String str = "jump length: ";
        for (int i = 0; i < this.jumps.size(); i++) {
            str = str + this.jumps.get(i) + " m";

            if (i != this.jumps.size() - 1) {
                str += ", ";
            }
        }

        return str;
    }
}
