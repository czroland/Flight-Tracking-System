package flight.tracking.system.service;


import flight.tracking.system.vo.FlightVo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

public interface FlightService {

    FlightVo getFlightById(Long id);

    FlightVo getFlightByAirplaneId(Long id);

    List<FlightVo> getFlightsByDepartureDateBetween(LocalDateTime from, LocalDateTime to);

    List<FlightVo> getAllFlights();

    void saveFlight(FlightVo flightVo);
}
