import java.util.ArrayList;

public class Flight {

    String destination;
    int ID;
    ArrayList <Passenger> passengers;

    ArrayList <Flight> flights;
    public Flight(String destination, int ID, ArrayList passengers){
        this.destination = destination;
        this.ID = ID;
        this.passengers = passengers;
    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ArrayList<Passenger> getPassengers() {
        return this.passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }


    //public void addFlight()

}
