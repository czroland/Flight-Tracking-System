package flight.tracking.system.service.impl;

import flight.tracking.system.persistence.entity.FlightEntity;
import flight.tracking.system.persistence.repository.FlightRepository;
import flight.tracking.system.service.FlightService;
import flight.tracking.system.service.mapper.AbstractEntityVoMapper;
import flight.tracking.system.vo.FlightVo;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.interceptor.Interceptors;
import java.time.LocalDateTime;
import java.util.Collection;

@Stateless(mappedName = "FlightService")
@Local(FlightService.class)
@Interceptors(SpringBeanAutowiringInterceptor.class)
@TransactionManagement(TransactionManagementType.CONTAINER)
public class FlightServiceImpl extends AbstractEntityVoMapper implements FlightService {

    private FlightRepository flightRepository;

    @Override
    public FlightVo getFlightById(Long id) {
        return map(flightRepository.findById(id), FlightVo.class);
    }

    @Override
    public FlightVo getFlightByAirplaneId(Long id) {
        return null;
    }

    @Override
    public Collection<FlightVo> getFlightsByDepartureDateBetween(LocalDateTime from, LocalDateTime to) {
        return map(flightRepository.findByDepartureDateBetweenAndOrderByDepartureDateAtDesc(from, to), FlightVo.class);
    }

    @Override
    public Collection<FlightVo> getAllFlights() {
        return map(flightRepository.findAll(), FlightVo.class);
    }

    @Override
    public void saveFlight(FlightVo flightVo) {
        flightRepository.save(map(flightVo, FlightEntity.class));
    }
}
