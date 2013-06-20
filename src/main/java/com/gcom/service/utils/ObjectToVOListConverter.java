package com.gcom.service.utils;

import javax.inject.Inject;

import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Service;


@Service("objectToVOListConverter")
public class ObjectToVOListConverter {
	
	@Inject
    private DozerBeanMapper mapper;

}
