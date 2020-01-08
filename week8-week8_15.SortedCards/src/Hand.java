import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<Card>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public int sumOfValues() {
        int sum = 0;

        for (Card card : this.cards) {
            sum += card.getValue();
        }

        return sum;
    }

    public void print() {
        for (Card card : this.cards) {
            System.out.println(card);
        }
    }

    public void sort() {
        Collections.sort(this.cards);
    }

    public void sortAgainstSuit() {
        SortAgainstSuitAndValue suitSorter = new SortAgainstSuitAndValue();
        Collections.sort(this.cards, suitSorter);
    }

    @Override
    public int compareTo(Hand otherHand) {
        if (this.sumOfValues() > otherHand.sumOfValues()) {
            return 1;
        } else if (this.sumOfValues() < otherHand.sumOfValues()) {
            return -1;
        } else {
            return 0;
        }
    }
}
