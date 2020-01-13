import java.util.Scanner;
import java.util.Set;
import java.util.List;

public class UserInterface {
    private Scanner reader;
    private Phonebook phonebook;

    public UserInterface(Scanner reader, Phonebook phonebook) {
        this.reader = reader;
        this.phonebook = phonebook;
    }

    public void start() {
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println("1 add a number");
        System.out.println("2 search for a number");
        System.out.println("3 search for a person by phone number");
        System.out.println("4 add an address");
        System.out.println("5 search for personal information");
        System.out.println("6 delete personal information");
        System.out.println("7 filtered listing");
        System.out.println("x quit");
        System.out.println("");

        while (true) {
            System.out.print("command: ");
            String command = this.reader.nextLine();

            if (command.equals("x")) {
                break;
            }

            handle(command);
            System.out.println("");
        }
    }

    private void handle(String command) {
        if (command.equals("1")) {
            addNumber();
        } else if (command.equals("2")) {
            searchForNumber();
        } else if (command.equals("3")) {
            searchForPerson();
        } else if (command.equals("4")) {
            addAddress();
        } else if (command.equals("5")) {
            searchForPersonalInfo();
        } else if (command.equals("6")) {
            deletePerson();
        } else if (command.equals("7")) {
            filterListing();
        }
    }

    private void addNumber() {
        System.out.print("whose number: ");
        String name = this.reader.nextLine();
        System.out.print("number: ");
        String num = this.reader.nextLine();
        this.phonebook.addNumber(name, num);
    }

    private void searchForNumber() {
        System.out.print("whose number: ");
        String name = this.reader.nextLine();
        Set<String> numbers = this.phonebook.searchForNumber(name);
        if (numbers == null) {
            System.out.println("  not found");
        } else {
            for (String num : numbers) {
                System.out.println(" " + num);
            }
        }
    }

    private void searchForPerson() {
        System.out.print("number: ");
        String num = this.reader.nextLine();
        Person foundPerson = this.phonebook.searchForPerson(num);
        if (foundPerson == null) {
            System.out.println("  not found");
        } else {
            System.out.println(" " + foundPerson.getName());
        }
    }

    private void addAddress() {
        System.out.print("whose address: ");
        String name = this.reader.nextLine();
        System.out.print("street: ");
        String street = this.reader.nextLine();
        System.out.print("city: ");
        String city = this.reader.nextLine();

        Address newAddress = new Address(street, city);
        this.phonebook.addAddress(name, newAddress);
    }

    private void searchForPersonalInfo() {
        System.out.print("whose information: ");
        String name = this.reader.nextLine();

        Person foundPerson = this.phonebook.getPersonByName(name);

        if (foundPerson == null) {
            System.out.println("  not found");
            return;
        }

        printPersonalInfo(foundPerson);
    }

    private void printPersonalInfo(Person foundPerson) {
        Address address = foundPerson.getAddress();
        Set<String> numbers = foundPerson.getNumbers();

        if (address == null) {
            System.out.println("  address unknown");
        } else {
            System.out.println("  address: " + address);
        }

        if (numbers.isEmpty()) {
            System.out.println("  phone number not found");
        } else {
            System.out.println("  phone numbers: ");
            for (String num : numbers) {
                System.out.println("   " + num);
            }
        }
    }

    private void deletePerson() {
        System.out.print("whose information: ");
        String name = this.reader.nextLine();

        this.phonebook.removePerson(name);
    }

    private void filterListing() {
        System.out.print("keyword (if empty, all listed): ");
        String keyword = this.reader.nextLine();

        List<Person> listing = this.phonebook.filter(keyword);

        if (listing.isEmpty()) {
            System.out.println(" keyword not found");
            return;
        }

        for (Person p : listing) {
            System.out.println(" " + p.getName());
            printPersonalInfo(p);
        }
    }
}
