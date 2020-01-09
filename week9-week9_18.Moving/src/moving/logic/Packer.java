package moving.logic;

import moving.domain.*;

import java.util.ArrayList;
import java.util.List;

public class Packer {
    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        List<Box> boxes = new ArrayList<Box>();
        Box box = new Box(this.boxesVolume);

        for (Thing thing : things) {
            if (!box.addThing(thing)) {
                boxes.add(box);
                box = new Box(this.boxesVolume);
            }

            box.addThing(thing);
        }

        boxes.add(box);
        return boxes;
    }
}
