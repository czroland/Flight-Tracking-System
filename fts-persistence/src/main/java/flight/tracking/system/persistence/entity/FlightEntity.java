package flight.tracking.system.persistence.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Table(name = "flights")
public class FlightEntity extends BaseEntity {

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "airplane_id")
    private AirplaneEntity airplane;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "departure_airport_id")
    private AirportEntity departureAirport;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "arrival_airport_id")
    private AirportEntity arrivalAirport;

    private LocalDateTime departureDate;

    private LocalDateTime arrivalDate;
}
