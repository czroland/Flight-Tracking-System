package flight.tracking.system.service;


import flight.tracking.system.vo.AirplaneVo;

import java.util.Collection;
import java.util.List;

public interface AirplaneService {

    AirplaneVo getAirplaneById(Long id);

    AirplaneVo getAirplaneByCode(String code);

    List<AirplaneVo> getAllAirplanes();
}
