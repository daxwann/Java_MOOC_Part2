import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class RingingCentre {
    private Map<Bird, List<String>> observedBirds;

    public RingingCentre() {
        this.observedBirds = new HashMap<Bird, List<String>>();
    }

    public void observe(Bird bird, String location) {
        if (this.observedBirds.containsKey(bird)) {
            this.observedBirds.get(bird).add(location);
        } else {
            List<String> locations = new ArrayList<String>();
            locations.add(location);
            this.observedBirds.put(bird, locations);
        }
    }

    public void observations(Bird bird) {
        int count = 0;

        if (!this.observedBirds.containsKey(bird)) {
            System.out.println(bird.getLatinName() + " (" + bird.getRingingYear() + ") observations: 0");
            return;
        }

        List<String> locations = this.observedBirds.get(bird);
        System.out.println(bird.getLatinName() + " (" + bird.getRingingYear() + ") observations: " + locations.size());
        for (String location : locations) {
            System.out.println(location);
        }
    }
}
