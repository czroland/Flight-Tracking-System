package flight.tracking.system.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
public class FlightVo extends BaseVo {

    private AirplaneVo airplane;

    private AirportVo departureAirport;

    private AirportVo arrivalAirport;

    private LocalDateTime departureDate;;

    private LocalDateTime arrivalDate;;

    public FlightVo(){
        /*departureDate= LocalDateTime.now();
        arrivalDate = LocalDateTime.now();*/
    }
}
