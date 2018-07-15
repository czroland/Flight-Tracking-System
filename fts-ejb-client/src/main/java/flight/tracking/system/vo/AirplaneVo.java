package flight.tracking.system.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
public class AirplaneVo extends BaseVo {

    private AirlineVo airline;

    private String code;

    private int seats;
}
