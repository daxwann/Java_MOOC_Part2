import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Phonebook {
    private Map<String, Person> personByName;
    private Map<String, Person> personByNumber;
    private Map<String, Person> personByAddress;

    public Phonebook() {
        this.personByName = new HashMap<String, Person>();
        this.personByNumber = new HashMap<String, Person>();
        this.personByAddress = new HashMap<String, Person>();
    }

    public void addNumber(String name, String number) {
        if (!this.personByName.containsKey(name) && !this.personByNumber.containsKey(number)) {
            Person newPerson = new Person(name);
            newPerson.addNumber(number);
            this.personByName.put(name, newPerson);
            this.personByNumber.put(number, newPerson);
        } else if (!this.personByNumber.containsKey(number)) {
            Person foundPerson = this.personByName.get(name);
            foundPerson.addNumber(number);
            this.personByNumber.put(number, foundPerson);
        }
    }

    public Person getPersonByName(String name) {
        if (this.personByName.containsKey(name)) {
            return this.personByName.get(name);
        }

        return null;
    }

    public Set<String> searchForNumber(String name) {
        if (this.personByName.containsKey(name)) {
            return this.personByName.get(name).getNumbers();
        }

        return null;
    }

    public Person searchForPerson(String number) {
        if (this.personByNumber.containsKey(number)) {
            return this.personByNumber.get(number);
        }

        return null;
    }

    public void removePerson(String name) {
        if (!this.personByName.containsKey(name)) {
            return;
        }

        Person foundPerson = this.personByName.get(name);
        Set<String> numbers = foundPerson.getNumbers();
        String address = foundPerson.getAddress().toString();

        for (String num : numbers) {
            this.personByNumber.remove(num);
        }

        this.personByAddress.remove(address);

        this.personByName.remove(name);
    }

    public void addAddress(String name, Address address) {
        if (!this.personByName.containsKey(name)) {
            Person newPerson = new Person(name);
            newPerson.addAddress(address);
            this.personByName.put(name, newPerson);
            this.personByAddress.put(address.toString(), newPerson);
        } else {
            Person foundPerson = this.personByName.get(name);
            Address foundAddress = foundPerson.getAddress();

            if (foundAddress != null && foundAddress.toString().equals(address.toString())) {
                return;
            }

            foundPerson.addAddress(address);
            this.personByAddress.put(address.toString(), foundPerson);
        }
    }


    public Set<Person> filter(String keyword) {

    }
}
