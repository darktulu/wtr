package com.gcom.service.utils;

import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@Service("objectToVOListConverter")
public class ObjectToVOListConverter<C, CVO> {
    @Inject
    private DozerBeanMapper mapper;

    public List<CVO> convert(List<C> listC, Class<CVO> CV) {
        List<CVO> listCVO = new ArrayList<CVO>();
        for (C c : listC) {
            listCVO.add(mapper.map(c, CV));
        }
        return listCVO;
    }

    public <CVO> CVO map(Object source, Class<CVO> destination) {
        return mapper.map(source, destination);
    }
}
