package containers;

import java.util.ArrayList;
import java.lang.Math;
import java.util.Collections;

public class ContainerHistory {
    private ArrayList<Double>history;

    public ContainerHistory() {
        this.history = new ArrayList<Double>();
    }

    public void add(double situation) {
        this.history.add(situation);
    }

    public void reset() {
        this.history.clear();
    }

    public double maxValue() {
        return Collections.max(this.history);
    }

    public double minValue() {
        return Collections.min(this.history);
    }

    public double average() {
        double sum = 0;

        if (this.history.size() == 0) {
            return 0;
        }

        for (int i = 0; i < this.history.size(); i++) {
            sum += this.history.get(i);
        }

        return sum / this.history.size();
    }

    public double greatestFluctuation() {
        double greatest = 0.0;
        for (int i = 0; i < this.history.size(); i++) {
            if (i + 1 < this.history.size()) {
                double fluctuation = Math.abs(this.history.get(i + 1) - this.history.get(i));
                if (fluctuation > greatest) {
                    greatest = fluctuation;
                }
            }
        }
        return greatest;
    }

    public double variance() {
        if (this.history.size() <= 1) {
            return 0;
        }

        double avg = this.average();
        double sum = 0;

        for (double val : this.history) {
            sum += Math.pow(val - avg, 2);
        };

        return sum / (this.history.size() - 1);
    }

    @Override
    public String toString() {
        return this.history.toString();
    }
}
