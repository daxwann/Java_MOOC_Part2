import java.awt.image.renderable.RenderableImage;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (this.owners.containsKey(plate)) {
            return false;
        } else {
            this.owners.put(plate, owner);
            return true;
        }
    }

    public String get(RegistrationPlate plate) {
        if (this.owners.containsKey(plate)) {
            return this.owners.get(plate);
        }

        return null;
    }

    public boolean delete(RegistrationPlate plate) {
        if (this.owners.containsKey(plate)) {
            this.owners.remove(plate);
            return true;
        }

        return false;
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate plate : this.owners.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        Set<String> uniqueOwners = new HashSet<String>(this.owners.values());

        for (String owner : uniqueOwners) {
            System.out.println(owner);
        }
    }
}
