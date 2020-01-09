import java.util.Comparator;

public class ReverseSortByPoints implements Comparator<Participant> {
    public int compare(Participant p1, Participant p2) {
        return p2.getPoints() - p1.getPoints();
    }
}
