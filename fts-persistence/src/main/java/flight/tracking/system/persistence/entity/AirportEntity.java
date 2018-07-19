package flight.tracking.system.persistence.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "airports")
public class AirportEntity extends BaseEntity {

    private String name;

    @Column(unique = true)
    @Size(min = 3, max = 3)
    private String code;

    private String country;

    private String city;
}
