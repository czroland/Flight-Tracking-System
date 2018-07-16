package flight.tracking.system.service;


import flight.tracking.system.vo.AirplaneVo;

public interface AirplaneService {

    AirplaneVo getAirplaneById(Long Id);

    AirplaneVo getAirplaneByCode(String code);
}
