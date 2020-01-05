public class Flight {
    private Plane plane;
    private String departureCode;
    private String destinationCode;

    public Flight(Plane plane, String depCode, String desCode) {
        this.plane = plane;
        this.departureCode = depCode;
        this.destinationCode = desCode;
    }

    public String getFlightPlaneId() {
        return this.plane.getId();
    }

    public String getAirportCodes() {
        return "(" + this.departureCode + "-" + this.destinationCode + ")";
    }

    public String toString() {
        return this.plane.toString() + " " + getAirportCodes();
    }
}
