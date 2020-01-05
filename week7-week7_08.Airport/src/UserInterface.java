import java.util.Scanner;

public class UserInterface {
    private Scanner reader;
    private Airport airport;

    public UserInterface(Scanner reader, Airport airport) {
        this.reader = reader;
        this.airport = airport;
    }

    public void start() {
        airportPanel();
        flightService();
    }

    private void airportPanel() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");

        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print("> ");
            String command = this.reader.nextLine();

            if (command.equals("x")) {
                break;
            }

            if (command.equals("1")) {
                addAirplane();
            } else if (command.equals("2")) {
                addFlight();
            }
        }

        System.out.println("");
    }

    private void addAirplane() {
        System.out.print("Give plane ID: ");
        String id = this.reader.nextLine();
        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(this.reader.nextLine());
        Plane newPlane = new Plane(id, capacity);
        this.airport.addPlane(newPlane);
    }

    private void addFlight() {
        System.out.print("Give plane ID: ");
        String id = this.reader.nextLine();
        System.out.print("Give departure airport code: ");
        String depCode = this.reader.nextLine();
        System.out.print("Give destination airport code: ");
        String desCode = this.reader.nextLine();
        Plane plane = this.airport.searchPlane(id);
        if (plane != null) {
            Flight newFlight = new Flight(plane, depCode, desCode);
            this.airport.addFlight(newFlight);
        }
    }

    private void flightService() {
        System.out.println("Flight service");
        System.out.println("--------------------");
        System.out.println("");

        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            System.out.print("> ");
            String command = this.reader.nextLine();

            if (command.equals("x")) {
                break;
            }

            if (command.equals("1")) {
                printPlanes();
            } else if (command.equals("2")) {
                printFlights();
            } else if (command.equals("3")) {
                printFlightInfo();
            }
        }

        System.out.println("");
    }

    private void printPlanes() {
        this.airport.printPlanes();
    }

    private void printFlights() {
        this.airport.printFlights();
    }

    private void printFlightInfo() {
        System.out.print("Give plane ID: ");
        String id = this.reader.nextLine();

        Plane plane = this.airport.searchPlane(id);

        if (plane != null) {
            System.out.println(plane);
        }
    }
}
