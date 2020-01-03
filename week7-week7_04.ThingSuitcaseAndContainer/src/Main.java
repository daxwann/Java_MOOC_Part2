
public class Main {

    public static void main(String[] args) {
        // use this main class to test your program!
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        for (int i = 1; i <= 100; i++) {
            Thing brick = new Thing("brick", i);
            Suitcase suitcaseWithBrick = new Suitcase(100);
            suitcaseWithBrick.addThing(brick);
            container.addSuitcase(suitcaseWithBrick);
        }
    }
}
