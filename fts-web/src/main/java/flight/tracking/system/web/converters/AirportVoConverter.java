package flight.tracking.system.web.converters;

import flight.tracking.system.vo.AirportVo;
import flight.tracking.system.web.managedbeans.view.MBAirport;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;

@FacesConverter("airportVoConverter")
public class AirportVoConverter implements javax.faces.convert.Converter {
    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String submittedValue) {
        if (submittedValue == null || submittedValue.isEmpty()) {
            return null;
        }

        MBAirport mbAirport = facesContext.getApplication().evaluateExpressionGet(facesContext, "#{airportBean}", MBAirport.class);
        return mbAirport.findAirportById(Long.valueOf(submittedValue));
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object modelValue) {
        if (modelValue == null) {
            return "";
        }
        if (modelValue instanceof AirportVo) {
            return ((AirportVo) modelValue).getId().toString();
        } else {
            return "";
        }
    }
}
