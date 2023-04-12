import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FlightTest {

    Passenger passenger1;
    Passenger passenger2;
    Flight flight1;
    Flight flight2;
    Flight passengers;
    Airport airport;


    @BeforeEach
    public void setUp(){
        airport = new Airport("Heathrow");
        passenger1 = new Passenger("Subrina", 12345, 44);
        passenger2 = new Passenger("Sarah", 67890, 44);
        flight1 = new Flight("Bali", "BA123");
        flight2 = new Flight("Paris", "PR321");
        flight1.addPassenger(passenger1);
        airport.addFlight(flight1);
    }
//getters and setters tests - flights
    @Test
    public void canGetDestination(){
        assertThat(flight1.getDestination()).isEqualTo("Bali");
    }
    @Test
    public void canGetID(){
        assertThat(flight1.getID()).isEqualTo("BA123");
    }
    @Test
    public void canAddPassenger(){
      flight1.addPassenger(passenger2);
      assertThat(flight1.passengers.size()).isEqualTo(2);
    }
    @Test
    public void canGetFlightList(){
        airport.addFlight(flight2);
        assertThat(airport.flightList.size()).isEqualTo(2);

    }
    @Test
    public void canCancelFlight(){
        assertThat(flight1.cancelFlight()).isEqualTo("BA123 flight is cancelled");
    }

//    @Test
//    public void canDisplayFlights(){
//        airport.displayFlights();
//    }

}
