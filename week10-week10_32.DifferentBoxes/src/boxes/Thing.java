package boxes;

public class Thing {
    private String name;
    private int weight;

    public Thing(String name, int weight) {
        if (weight < 0) {
            throw new IllegalArgumentException("weight should be non-negative");
        }
        this.name = name;
        this.weight = weight;
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (this.getClass() != object.getClass()) {
            return false;
        }

        Thing compared = (Thing) object;

        return this.name.equals(compared.getName());
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}
