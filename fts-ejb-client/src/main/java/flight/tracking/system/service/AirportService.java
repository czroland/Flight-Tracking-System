package flight.tracking.system.service;


import flight.tracking.system.vo.AirportVo;

import java.util.Collection;

public interface AirportService {

    AirportVo getAirportById(Long id);

    AirportVo getAirPortByCode(String code);

    Collection<AirportVo> getAirportsByCity(String City);

    Collection<AirportVo> getAirportsByCountry(String City);
}
