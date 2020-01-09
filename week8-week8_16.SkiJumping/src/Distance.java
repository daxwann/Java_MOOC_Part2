import java.util.Random;

public class Distance {
    private int distance;

    public Distance() {
        this.distance = 0;
    }

    public int getDistance() {
        return this.distance;
    }

    public void setRandomDistance() {
        this.distance = randomDistance();
    }

    private int randomDistance() {
        Random ran = new Random();

        return ran.nextInt(61) + 60;
    }

    public String toString() {
        return "length: " + this.distance;
    }
}
