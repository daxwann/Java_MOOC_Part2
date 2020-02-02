
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getRingingYear() {
        return ringingYear;
    }

    @Override
    public boolean equals(Object otherBird) {
        if (otherBird == null) {
            return false;
        }

        if (this.getClass() != otherBird.getClass()) {
            return false;
        }

        Bird compared = (Bird) otherBird;

        if (!this.latinName.equals(compared.getLatinName())) {
            return false;
        }

        return this.ringingYear == compared.getRingingYear();
    }

    @Override
    public int hashCode() {
        return this.latinName.hashCode();
    }

    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
}


