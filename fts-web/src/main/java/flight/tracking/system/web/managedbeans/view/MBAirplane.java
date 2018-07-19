package flight.tracking.system.web.managedbeans.view;

import flight.tracking.system.service.AirplaneService;
import flight.tracking.system.vo.AirplaneVo;
import lombok.Data;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@ManagedBean(name = "airplaneBean")
@ViewScoped
public class MBAirplane implements Serializable{

    private static final long serialVersionUID = 6583069297317499772L;

    @EJB
    private AirplaneService airplaneService;

    private List<AirplaneVo> airplanes = new ArrayList<>();

    private AirplaneVo airplane;

    @PostConstruct
    public void init(){
        airplane = new AirplaneVo();
        airplanes = airplaneService.getAllAirplanes();
    }

    public AirplaneVo findAirplaneById(Long id) {
        return airplaneService.getAirplaneById(id);
    }
}
