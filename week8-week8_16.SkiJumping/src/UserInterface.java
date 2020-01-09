import java.util.Scanner;

public class UserInterface {
    private Scanner reader;
    private Tournament tournament;

    public UserInterface(Scanner reader, Tournament tournament) {
        this.reader = reader;
        this.tournament = tournament;
    }

    public void start() {
        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        addParticipants();
        Round round = new Round(this.tournament.getParticipants());

        while (true) {
            System.out.println("");
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String command = this.reader.nextLine();
            System.out.println("");

            if (command.equals("jump")) {
                round.start();
                round.nextRound();
            } else {
                break;
            }
        }

        this.tournament.printResults();
    }

    public void addParticipants() {
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");

        while (true) {
            System.out.print("  Participant name: ");
            String name = this.reader.nextLine();

            if (name.isEmpty()) {
                break;
            }

            this.tournament.addParticipant(name);
        }

        System.out.println("");
        System.out.println("The tournament begins!");
    }
}
