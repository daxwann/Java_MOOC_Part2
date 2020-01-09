import java.util.Random;

public class Distance {
    public static int setRandomDistance() {
        Random ran = new Random();

        return ran.nextInt(61) + 60;
    }
}
