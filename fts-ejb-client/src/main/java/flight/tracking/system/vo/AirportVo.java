package flight.tracking.system.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class AirportVo extends BaseVo{

    private String name;

    private String code;

    private String country;

    private String city;
}
