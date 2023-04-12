import org.junit.jupiter.api.BeforeEach;

public class FlightTest {

    Passenger passenger1;
    Passenger passenger2;
    Flight flight1;
    Flight flight2;

    @BeforeEach
    public void setUp(){
        passenger1 = new Passenger("Subrina", 12345, 44);
        passenger2 = new Passenger("Sarah", 67890, 44);
    }

}
