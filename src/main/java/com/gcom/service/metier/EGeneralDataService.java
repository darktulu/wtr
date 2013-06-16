package com.gcom.service.metier;


import com.gcom.service.exceptions.ProfileNotExistException;
import com.gcom.view.vo.EGeneralDataVO;

public interface EGeneralDataService {

	
	public EGeneralDataVO findById(String username) throws ProfileNotExistException;
	
}
