package flight.tracking.system.web.managedbeans.request;

import flight.tracking.system.service.FlightService;
import flight.tracking.system.vo.FlightVo;
import flight.tracking.system.web.managedbeans.view.MBAirplane;
import flight.tracking.system.web.managedbeans.view.MBAirport;
import flight.tracking.system.web.managedbeans.view.MBFlight;
import lombok.Data;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import java.time.ZoneId;

@Data
@ManagedBean(name = "flightManagement")
@RequestScoped
public class MBFlightManagement {

    @EJB
    private FlightService flightService;

    @ManagedProperty(value = "#{flightBean}")
    private MBFlight flight;

    @ManagedProperty(value = "#{airportBean}")
    private MBAirport airport;

    @ManagedProperty(value = "#{airplaneBean}")
    private MBAirplane airplane;

    public void saveFlight() {

    }
}
