package flight.tracking.system.service.mapper;


import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.dozer.MappingException;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractEntityVoMapper {

    private final Mapper MAPPER;

    {
        DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
        MAPPER = dozerBeanMapper;
        List<String> mappingFiles = new ArrayList<>();
        mappingFiles.add("dozerJdk8Converters.xml");

        dozerBeanMapper.setMappingFiles(mappingFiles);
    }

    private Mapper getMapper() {
        return MAPPER;
    }

    public <T, U> List<U> map(List<T> var1, Class<U> var2) throws MappingException {
        List<U> vos = new ArrayList<>(var1.size());
        for (T element : var1) {
            vos.add(getMapper().map(element, var2));
        }
        return vos;
    }

    public <T> T map(Object var1, Class<T> var2) throws MappingException {
        return getMapper().map(var1, var2);
    }

    public void map(Object var1, Object var2) throws MappingException {
        getMapper().map(var1, var2);
    }

    public <T> T map(Object var1, Class<T> var2, String var3) throws MappingException {
        return getMapper().map(var1, var2, var3);
    }

    public void map(Object var1, Object var2, String var3) throws MappingException {
        getMapper().map(var1, var2, var3);
    }

}
