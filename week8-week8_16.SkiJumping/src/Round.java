import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Round {
    private List<Participant> participants;
    private int number;

    public Round(List<Participant> participants) {
        this.participants = participants;
        this.number = 1;
    }

    public void nextRound() {
        this.number++;
    }

    public void sortByPoints() {
        SortByPoints sorter = new SortByPoints();
        Collections.sort(this.participants, sorter);
    }

    public void printJumpingOrder() {
        System.out.println("Jumping order:");
        sortByPoints();
        for (int i = 1; i <= this.participants.size(); i++) {
            System.out.println("  " + i + ". " + this.participants.get(i - 1));
        }
    }

    public void start() {
        System.out.println("Round " + this.number);
        System.out.println("");
        printJumpingOrder();
        System.out.println(" ");
        results();
    }

    public void results() {
        System.out.println("Results of round " + this.number);
        for (Participant participant : this.participants) {
            System.out.println("  " + participant.getName());

            int len = Distance.setRandomDistance();
            participant.addJump(len);
            System.out.println("    length: " + len);

            Judges scores = new Judges();
            scores.vote();
            System.out.println("    " + scores);

            participant.addPoints(len + scores.calculatePoints());
        }
    }
}
