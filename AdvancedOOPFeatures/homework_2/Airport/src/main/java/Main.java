import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;

import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println(findPlanesLeavingInTheNextTwoHours(Airport.getInstance()));
    }
    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {
        //TODO Метод должден вернуть список рейсов вылетающих в ближайшие два часа.
        Date now = Date.from(Instant.now());
        Date nowPlusTowHour = Date.from(Instant.now().plusSeconds(7200));

        List<Terminal> terminalList = new ArrayList<>(airport.getTerminals());

        return terminalList.stream().flatMap(terminal -> terminal.getFlights().stream())
                  .filter(flight -> flight.getDate().after(now)
                          && flight.getDate().before(nowPlusTowHour)
                          && flight.getType() == Flight.Type.DEPARTURE)
                .collect(Collectors.toList());
    }
}












