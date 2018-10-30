import com.designpatterns.transporttoairport.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransportToAirportTest {

    TransportContext transportContext = new TransportContext();

    @Test
    public void addTaxi() {
        transportContext.setTransportStrategy(new Taxi());
        transportContext.amountPeople(3);

        assertEquals(3, transportContext.showAmountPeople());
    }

    @Test
    public void addBus() {
        transportContext.setTransportStrategy(new Bus());
        transportContext.amountPeople(20);

        assertEquals(20, transportContext.showAmountPeople());
    }

    @Test
    public void addBike() {
        transportContext.setTransportStrategy(new Bike());
        transportContext.amountPeople(1);

        assertEquals(1, transportContext.showAmountPeople());
    }

}
