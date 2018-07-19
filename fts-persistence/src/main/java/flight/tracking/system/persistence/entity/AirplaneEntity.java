package flight.tracking.system.persistence.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "airplanes")
public class AirplaneEntity extends BaseEntity {

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "airline_id")
    private AirlineEntity airline;

    @Column(unique = true)
    @Size(min = 3, max = 3)
    private String code;

    private int seats;
}
