package com.gcom.service.metier.impl;

import javax.inject.Inject;

import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gcom.beans.EGeneralData;
import com.gcom.repos.EGeneralDataRepos;
import com.gcom.service.exceptions.ProfileNotExistException;
import com.gcom.service.metier.EGeneralDataService;
import com.gcom.view.vo.EGeneralDataVO;

@Service("eGeneralDataService")
public class EGeneralDataServiceImpl implements EGeneralDataService {

	@Inject
	public EGeneralDataRepos eGeneralDataRepos;
	
	@Inject
    private DozerBeanMapper mapper;
	
	@Override
	@Transactional(readOnly = true)
	public EGeneralDataVO findById(String username) throws ProfileNotExistException{
		
		EGeneralData employee = eGeneralDataRepos.findOne(username);
		
		if (employee == null) throw new ProfileNotExistException();
		
		return mapper.map(employee, EGeneralDataVO.class);
	
	}



}
