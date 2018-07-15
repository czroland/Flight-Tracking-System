package flight.tracking.system.persistence.entity;

import flight.tracking.system.persistence.entity.enums.Continents;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Table(name = "airports")
public class AirportEntity extends BaseEntity {

    private String name;

    @Column(unique = true)
    @Size(min = 3, max = 3)
    private String code;

    @Enumerated(EnumType.STRING)
    private Continents continent;

    private String country;

    private String city;
}
