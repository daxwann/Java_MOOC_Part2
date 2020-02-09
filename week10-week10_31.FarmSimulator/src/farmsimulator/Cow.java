package farmsimulator;

import java.util.Random;

public class Cow implements Alive, Milkable{
    private String name;
    private double capacity;
    private double amount;

    public Cow(String name) {
        this.name = name;
        this.capacity = 15.0 + new Random().nextInt(26);
        this.amount = 0;
    }

    public Cow() {
        this(Cow.NAMES[new Random().nextInt(Cow.NAMES.length)]);
    }

    private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public String getName() {
        return this.name;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double getAmount() {
        return this.amount;
    }

    public void liveHour() {
        double amtProduced = 0.7 + new Random().nextDouble() * 1.3;
        if (this.amount + amtProduced <= this.capacity) {
            this.amount += amtProduced;
        } else {
            this.amount = this.capacity;
        }
    }

    public double milk() {
        double amt = this.amount;
        this.amount = 0;
        return amt;
    }

    @Override
    public String toString() {
        return this.name + " " + Math.ceil(this.amount) + "/" + Math.ceil(this.capacity);
    }
}
