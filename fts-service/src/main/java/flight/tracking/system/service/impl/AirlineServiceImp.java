package flight.tracking.system.service.impl;

import flight.tracking.system.persistence.repository.AirlineRepository;
import flight.tracking.system.service.AirlineService;
import flight.tracking.system.service.mapper.AbstractEntityVoMapper;
import flight.tracking.system.vo.AirlineVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.interceptor.Interceptors;
import java.util.Collection;
import java.util.List;

@Stateless(mappedName = "AirlineService")
@Local(AirlineService.class)
@Interceptors(SpringBeanAutowiringInterceptor.class)
@TransactionManagement(TransactionManagementType.CONTAINER)
public class AirlineServiceImp extends AbstractEntityVoMapper implements AirlineService {

    @Autowired
    private AirlineRepository airlineRepository;

    @Override
    public List<AirlineVo> getAllAirlines() {
        return map(airlineRepository.findAll(), AirlineVo.class);
    }
}
