package flight.tracking.system.service.impl;

import flight.tracking.system.persistence.repository.AirportRepository;
import flight.tracking.system.service.AirlineService;
import flight.tracking.system.service.AirportService;
import flight.tracking.system.service.mapper.AbstractEntityVoMapper;
import flight.tracking.system.vo.AirlineVo;
import flight.tracking.system.vo.AirportVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.interceptor.Interceptors;
import java.util.Collection;

@Stateless(mappedName = "AirportService")
@Local(AirportService.class)
@Interceptors(SpringBeanAutowiringInterceptor.class)
@TransactionManagement(TransactionManagementType.CONTAINER)
public class AirportServiceImpl extends AbstractEntityVoMapper implements AirportService {

    @Autowired
    private AirportRepository airportRepository;

    @Override
    public AirportVo getAirportById(Long id) {
        return map(airportRepository.findById(id), AirportVo.class);
    }

    @Override
    public AirportVo getAirPortByCode(String code) {
        return map(airportRepository.findByCode(code), AirportVo.class);
    }

    @Override
    public Collection<AirportVo> getAirportsByCity(String City) {
        return null;
    }

    @Override
    public Collection<AirportVo> getAirportsByCountry(String City) {
        return null;
    }
}
