package flight.tracking.system.web.converters;

import flight.tracking.system.vo.AirplaneVo;
import flight.tracking.system.web.managedbeans.view.MBAirplane;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;

@FacesConverter("airplaneVoConverter")
public class AirplaneVoConverter implements javax.faces.convert.Converter {
    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String submittedValue) {
        if (submittedValue == null || submittedValue.isEmpty()) {
            return null;
        }

        MBAirplane mbAirplane = facesContext.getApplication().evaluateExpressionGet(facesContext, "#{airplaneBean}", MBAirplane.class);
        return mbAirplane.findAirplaneById(Long.valueOf(submittedValue));
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object modelValue) {
        if (modelValue == null) {
            return "";
        }
        if (modelValue instanceof AirplaneVo) {
            return ((AirplaneVo) modelValue).getId().toString();
        } else {
            return "";
        }
    }
}
