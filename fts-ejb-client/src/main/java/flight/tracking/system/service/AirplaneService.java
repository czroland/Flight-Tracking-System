package flight.tracking.system.service;


import flight.tracking.system.vo.AirplaneVo;

import java.util.Collection;

public interface AirplaneService {

    AirplaneVo getAirplaneById(Long id);

    AirplaneVo getAirplaneByCode(String code);

    Collection<AirplaneVo> getAllAirplanes(String City);
}
