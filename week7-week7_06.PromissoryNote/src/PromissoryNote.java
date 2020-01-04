import java.util.HashMap;

public class PromissoryNote {
    private HashMap<String, Double> loans;

    public PromissoryNote() {
        this.loans = new HashMap<String, Double>();
    }

    public void setLoan(String name, double amount) {
        this.loans.put(name, amount);
    }

    public double howMuchIsTheDebt(String name) {
        if (this.loans.containsKey(name)) {
            return this.loans.get(name);
        }

        return 0.0;
    }
}
