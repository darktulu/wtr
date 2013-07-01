package com.gcom.service.metier.impl;

import com.gcom.beans.EGeneralData;
import com.gcom.beans.status.Status;
import com.gcom.repos.EGeneralDataRepos;
import com.gcom.service.exceptions.ProfileNotExistException;
import com.gcom.service.metier.EGeneralDataService;
import com.gcom.service.utils.ObjectToVOListConverter;
import com.gcom.view.vo.EGeneralDataVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;

@Service("eGeneralDataService")
public class EGeneralDataServiceImpl implements EGeneralDataService {
    @Inject
    public EGeneralDataRepos eGeneralDataRepos;
    @Inject
    private ObjectToVOListConverter<EGeneralData, EGeneralDataVO> egenConverter;

    @Override
    @Transactional(readOnly = true)
    public EGeneralDataVO findById(String username) throws ProfileNotExistException {
        EGeneralData employee = eGeneralDataRepos.findOne(username);
        if (employee == null) {
            throw new ProfileNotExistException();
        }

        return egenConverter.map(employee, EGeneralDataVO.class);
    }

    @Override
    public List<EGeneralDataVO> loadActiveEmployees() {
        return egenConverter.convert(eGeneralDataRepos.findByStatus(Status.ACTIVE.getValue()), EGeneralDataVO.class);
    }
}
