import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class Tournament {
    private List<Participant> participants;

    public Tournament() {
        this.participants = new ArrayList<Participant>();
    }

    public void addParticipant(String name) {
        this.participants.add(new Participant(name));
    }

    public List<Participant> getParticipants() {
        return this.participants;
    }

    public void printResults() {

    }
}
