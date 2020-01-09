import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Judges {
    private ArrayList<Integer> scores;

    public Judges() {
        this.scores = new ArrayList<Integer>();
    }

    public void vote() {
        for (int i = 0; i < 5; i++) {
            this.scores.add(randomJudgeScore());
        }
    }

    private int randomJudgeScore() {
        Random ran = new Random();

        return ran.nextInt(11) + 10;
    }

    public ArrayList<Integer> getScores() {
        return this.scores;
    }

    public String toString() {
        return "judge votes: " + Arrays.toString(this.scores.toArray());
    }

    public int calculatePoints() {
        int max = Collections.max(this.scores);
        int min = Collections.min(this.scores);

        int sum = 0;

        for (int score : this.scores) {
            sum += score;
        }

        return sum - max - min;
    }
}
