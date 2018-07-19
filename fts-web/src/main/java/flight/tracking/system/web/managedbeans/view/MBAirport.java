package flight.tracking.system.web.managedbeans.view;

import flight.tracking.system.service.AirportService;
import flight.tracking.system.vo.AirportVo;
import lombok.Data;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@ManagedBean(name = "airportBean")
@ViewScoped
public class MBAirport implements Serializable {

    private static final long serialVersionUID = 7244863274528090766L;

    @EJB
    private AirportService airportService;

    private List<AirportVo> airports = new ArrayList<>();

    private AirportVo departureAirport;
    private AirportVo arrivalAirport;


    @PostConstruct
    public void init() {
        departureAirport = new AirportVo();
        arrivalAirport = new AirportVo();

        airports = airportService.getAllAirports();
    }

    public AirportVo findAirportById(Long id) {
        return airportService.getAirportById(id);
    }

}
