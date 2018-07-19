package flight.tracking.system.service.impl;

import flight.tracking.system.persistence.repository.AirplaneRepository;
import flight.tracking.system.service.AirplaneService;
import flight.tracking.system.service.AirportService;
import flight.tracking.system.service.mapper.AbstractEntityVoMapper;
import flight.tracking.system.vo.AirplaneVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.interceptor.Interceptors;
import java.util.Collection;
import java.util.List;

@Stateless(mappedName = "AirplaneService")
@Local(AirplaneService.class)
@Interceptors(SpringBeanAutowiringInterceptor.class)
@TransactionManagement(TransactionManagementType.CONTAINER)
public class AirplaneServiceImpl extends AbstractEntityVoMapper implements AirplaneService {

    @Autowired
    private AirplaneRepository airplaneRepository;

    @Override
    public AirplaneVo getAirplaneById(Long id) {
        return map(airplaneRepository.findById(id), AirplaneVo.class);
    }

    @Override
    public AirplaneVo getAirplaneByCode(String code) {
        return map(airplaneRepository.findByCode(code), AirplaneVo.class);
    }

    @Override
    public List<AirplaneVo> getAllAirplanes() {
        return map(airplaneRepository.findAll(), AirplaneVo.class);
    }
}
