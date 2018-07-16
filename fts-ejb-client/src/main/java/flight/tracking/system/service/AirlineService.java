package flight.tracking.system.service;


import flight.tracking.system.vo.AirlineVo;

import java.util.Collection;

public interface AirlineService {

    Collection<AirlineVo> getAllAirlines();
}
