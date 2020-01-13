import java.util.Set;
import java.util.HashSet;

public class Person implements Comparable<Person> {
    private String name;
    private Address address;
    private Set<String> numbers;

    public Person(String name) {
        this.name = name;
        this.numbers = new HashSet<String>();
        this.address = null;
    }

    public void addNumber(String number) {
        this.numbers.add(number);
    }

    public void addAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public Set<String> getNumbers() {
        return this.numbers;
    }

    public Address getAddress() {
        return this.address;
    }

    @Override
    public int compareTo(Person otherPerson) {
        return this.name.compareTo(otherPerson.name);
    }
}
