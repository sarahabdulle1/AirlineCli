import java.util.ArrayList;

public class Flight {
    Passenger passenger;
    private String destination;
    private String ID;
    ArrayList <Passenger> passengers;

    ArrayList <Flight> flightList;
    public Flight(String destination, String ID){
        this.destination = destination;
        this.ID = ID;
        this.passengers = new ArrayList<>();
    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public ArrayList<Passenger> getPassengers() {

        return this.passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public ArrayList<Flight> getFlightList(){
        return this.flightList;
    }
//    method
    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }

    public String cancelFlight(){
        return this.getID() + " flight is cancelled";
    }


}
