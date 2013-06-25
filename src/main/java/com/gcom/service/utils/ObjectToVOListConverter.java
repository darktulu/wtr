package com.gcom.service.utils;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Service;

@Service("objectToVOListConverter")
public class ObjectToVOListConverter<C,CVO> {

	@Inject
	private DozerBeanMapper mapper;

	public List<CVO> convert(List<C> listC,Class<CVO> CV){
		
		List<CVO> listCVO = new ArrayList<CVO>();
		
		for (C c : listC) {
			listCVO.add(mapper.map(c, CV));
		}
		
		return listCVO;
	}
}
