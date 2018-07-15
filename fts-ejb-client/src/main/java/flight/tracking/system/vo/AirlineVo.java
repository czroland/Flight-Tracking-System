package flight.tracking.system.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
public class AirlineVo extends BaseVo {

    private String name;
}
