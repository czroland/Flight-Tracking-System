package flight.tracking.system.persistence.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "airlines")
public class AirlineEntity extends BaseEntity {

    private String name;
}
