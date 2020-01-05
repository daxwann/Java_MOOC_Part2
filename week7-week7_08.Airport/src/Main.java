import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        Scanner reader = new Scanner(System.in);
        Airport airport = new Airport();

        UserInterface ui = new UserInterface(reader, airport);
        ui.start();
    }
}
