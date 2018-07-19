package flight.tracking.system.web.managedbeans.view;

import flight.tracking.system.service.FlightService;
import flight.tracking.system.vo.FlightVo;
import lombok.Data;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

@Data
@ManagedBean(name = "flightBean")
@ViewScoped
public class MBFlight implements Serializable {

    private static final long serialVersionUID = 8802041998799881930L;

    @EJB
    private FlightService flightService;

    private FlightVo selectedFlight;
    private FlightVo newFlight;
    private List<FlightVo> flights = new ArrayList<>();
    private Date startDate;
    private Date endDate;


    @PostConstruct
    public void init() {
        endDate = new Date();
        startDate = new Date();
        selectedFlight = new FlightVo();
        flights = flightService.getAllFlights();
    }
}
