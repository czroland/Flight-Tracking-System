package flight.tracking.system.web.converters;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import org.apache.commons.lang.StringUtils;
import org.primefaces.component.calendar.Calendar;
import org.primefaces.util.MessageFactory;


@FacesConverter("localDateTimeConverter")
public class LocalDateTimeConverter implements Converter {

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object modelValue) {
        if (modelValue == null) {
            return "";
        }

        if (modelValue instanceof LocalDateTime) {
            return getFormatter(context, component).format((LocalDateTime) modelValue);
        } else {
            throw new ConverterException(new FacesMessage(modelValue + " is not a valid LocalDateTime"));
        }
    }

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String submittedValue) {
        if (submittedValue == null || submittedValue.isEmpty()) {
            return null;
        }

        try {
            return LocalDateTime.parse(submittedValue,  DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        } catch (DateTimeParseException e) {
            throw new ConverterException(new FacesMessage(submittedValue + " is not a valid date time"), e);
        }
    }

    private DateTimeFormatter getFormatter(FacesContext context, UIComponent component) {

        return DateTimeFormatter.ofPattern(getPattern(component));
    }

    private String getPattern(UIComponent component) {
        String pattern = (String) component.getAttributes().get("pattern");

        if (pattern == null) {
            throw new IllegalArgumentException("pattern attribute is required");
        }

        return pattern;
    }
}
