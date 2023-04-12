import java.util.ArrayList;

public class Airport {

    private String name;

    ArrayList<Flight> flightList;

//    constructor
    public Airport(String name){
        this.name = name;
        this.flightList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(ArrayList<Flight> flightList) {
        this.flightList = flightList;
    }
//    getters

//    method
    public void addFlight(Flight flight){
        flightList.add(flight);

    }
}
