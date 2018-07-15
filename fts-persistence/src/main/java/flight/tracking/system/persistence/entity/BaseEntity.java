package flight.tracking.system.persistence.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
@Data
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = -7723943396649353410L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
