package flight.tracking.system.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class FlightVo extends BaseVo {

    private AirplaneVo airplane;

    private AirportVo departureAirport;

    private AirportVo arrivalAirport;

    private LocalDateTime departureDate;

    private LocalDateTime arrivalDate;
}
