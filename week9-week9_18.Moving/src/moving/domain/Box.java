package moving.domain;

import java.util.ArrayList;

public class Box implements Thing {
    private int maxVolume;
    private ArrayList<Thing> things;

    public Box(int maxVolume) {
        this.maxVolume = maxVolume;
        this.things = new ArrayList<Thing>();
    }

    public int getVolume() {
        int vol = 0;

        for (Thing thing : this.things) {
            vol += thing.getVolume();
        }

        return vol;
    }

    public boolean addThing(Thing thing) {
        if (thing == null) {
            return false;
        }

        if (getVolume() + thing.getVolume() <= this.maxVolume) {
            this.things.add(thing);
            return true;
        }

        return false;
    }
}
