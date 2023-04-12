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

    // Method to display flights

//    public String displayFlights(Airport airportName
////        for (int i = 0; i <= flightList.size(); i++){
////            airportName[i] = flightList.get(i)
////    }

    public void displayFlights(){
        for(int i = 0; i <= flightList.size(); i++) {
            System.out.println(String.format("The flights today: %s", flightList.get(i).getDestination(), flightList.get(i).getID()));
        }
    }

}
