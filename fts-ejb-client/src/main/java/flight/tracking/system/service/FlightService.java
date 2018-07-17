package flight.tracking.system.service;


import flight.tracking.system.vo.FlightVo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Locale;

public interface FlightService {

    FlightVo getFlightById(Long id);

    FlightVo getFlightByAirplaneId(Long id);

    Collection<FlightVo> getFlightsByDepartureDateBetween(LocalDateTime from, LocalDateTime to);

    void saveFlight(FlightVo flightVo);
}
