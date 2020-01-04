import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class Airport {
    private HashMap<String, Plane> planes;
    private HashMap<String, ArrayList<Flight>> flights;

    public Airport() {
        this.planes = new HashMap<String, Plane>();
        this.flights = new HashMap<String, ArrayList<Flight>>();
    }

    public void addPlane(Plane plane) {
        if (this.planes.containsKey(plane.getId())) {
            System.out.println("Plane model already exists");
        } else {
            this.planes.put(plane.getId(), plane);
        }
    }

    public void addFlight(Flight flight) {
        if ((this.flights.containsKey(flight.getFlightPlaneId()))) {
            this.flights.get(flight.getFlightPlaneId()).add(flight);
        } else {
            this.flights.put(flight.getFlightPlaneId(), new ArrayList<Flight>());
        }
    }

    public void printFlights() {
        
    }

    public void printPlanes() {
        ArrayList<String> sortedIds = new ArrayList<String>(this.planes.keySet());

        Collections.sort(sortedIds);

        for (String id : sortedIds) {
            System.out.println(this.planes.get(id));
        }
    }

    public Plane searchPlane(String id) {
        if (this.planes.containsKey(id)) {
            return this.planes.get(id);
        }

        return null;
    }
}
