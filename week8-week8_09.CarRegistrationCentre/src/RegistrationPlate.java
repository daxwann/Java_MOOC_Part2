
public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    public String getRegCode() {
        return this.regCode;
    }

    public String getCountry() {
        return this.country;
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }

    @Override
    public boolean equals(Object compared) {
        if (compared == null) {
            return false;
        }

        if (getClass() != compared.getClass()) {
            return false;
        }

        RegistrationPlate comparedPlate = (RegistrationPlate) compared;

        if (!this.toString().equals(comparedPlate.toString())) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        if (this.regCode == null || this.country == null) {
            return 7;
        }

        return this.country.hashCode() + this.regCode.hashCode();
    }
}
