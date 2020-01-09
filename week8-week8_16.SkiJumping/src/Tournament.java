import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

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
        System.out.println("Tournament results:");
        System.out.println("Position    Name");

        ReverseSortByPoints sort = new ReverseSortByPoints();
        Collections.sort(this.participants, sort);

        for (int i = 1; i <= this.participants.size(); i++) {
            Participant currParticipant = this.participants.get(i - 1);

            System.out.print(i + "           ");
            System.out.print(currParticipant + "\n");
            System.out.println("            " + currParticipant.getJumps());
        }
    }
}
