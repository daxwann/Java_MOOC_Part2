package farmsimulator;

import java.util.ArrayList;
import java.util.Collection;

public class Farm implements Alive {
    private String owner;
    private Barn barn;
    private Collection<Cow> cows;

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }

    public String getOwner() {
        return this.owner;
    }

    public void liveHour() {
        for (Cow cow : this.cows) {
            cow.liveHour();
        }
    }

    public void manageCows() {
        this.barn.takeCareOf(this.cows);
    }

    public void addCow(Cow cow) {
        this.cows.add(cow);
    }

    public void installMilkingRobot(MilkingRobot robot) {
        this.barn.installMilkingRobot(robot);
    }

    @Override
    public String toString() {
        String cows = "";
        for (Cow cow : this.cows) {
            cows = cow + "  " + cow.toString() + "\n";
        }

        return "Farm owner: " + this.owner + "\nBarn bulk tank: " + this.barn.toString() + "\nAnimals:\n" + cows;
    }
}
