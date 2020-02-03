package movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {
    private List<Movable> group;

    public Group(){
        this.group = new ArrayList<Movable>();
    }

    public void addToGroup(Movable movable){
        this.group.add(movable);
    }

    public void move(int dx, int dy){
        for (Movable item : group) {
            item.move(dx, dy);
        }
    }

    @Override
    public String toString(){
        String positions = "";

        for (Movable item : group) {
            positions += item + "\n";
        }

        return positions;
    }
}
