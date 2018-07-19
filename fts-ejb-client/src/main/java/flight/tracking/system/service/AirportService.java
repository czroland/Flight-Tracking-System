package flight.tracking.system.service;


import flight.tracking.system.vo.AirportVo;

import java.util.Collection;
import java.util.List;

public interface AirportService {

    AirportVo getAirportById(Long id);

    AirportVo getAirPortByCode(String code);

    List<AirportVo> getAirportsByCity(String City);

    List<AirportVo> getAirportsByCountry(String City);

    List<AirportVo> getAllAirports();

}
