package com.gcom.service.metier;

import java.util.List;

import com.gcom.service.exceptions.ProfileNotExistException;
import com.gcom.view.vo.EGeneralDataVO;

public interface EGeneralDataService {
    public EGeneralDataVO findById(String username) throws ProfileNotExistException;
    public List<EGeneralDataVO> loadActiveEmployees();
}
