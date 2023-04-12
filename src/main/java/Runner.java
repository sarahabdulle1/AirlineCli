public class Runner {
    public static void main(String[] args) {


        Passenger passenger;
        Airport airport;
        Flight flight;



        Passenger passenger1 = new Passenger("Anna", 321, 44);
        Passenger passenger2 = new Passenger("Leya", 456, 44);
        Flight flight1 = new Flight("Oman", "OM123");
        Flight flight2 = new Flight("Dubai", "DXB123");
        Flight flight3 = new Flight("Venice", "VEN123");
        Airport airport1 = new Airport("Heathrow");

//  Running methods

    flight1.addPassenger(passenger1);
    flight1.addPassenger(passenger2);
        System.out.println(flight1.getPassengers());

// adding flights to airport flightList
    airport1.addFlight(flight1);
    airport1.addFlight(flight2);
    airport1.addFlight(flight3);

        System.out.println(airport1.flightList.size());
    }
}