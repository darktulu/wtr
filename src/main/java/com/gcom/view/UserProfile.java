package com.gcom.view;

import com.gcom.service.exceptions.ProfileNotExistException;
import com.gcom.service.metier.EGeneralDataService;
import com.gcom.view.vo.EGeneralDataVO;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

@Component
@Scope("request")
public class UserProfile {
    @Inject
    private transient SessionBean sessionBean;
    @Inject
    private transient EGeneralDataService eGeneralDataService;

    private EGeneralDataVO profile = new EGeneralDataVO();

    public SessionBean getSessionBean() {
        return sessionBean;
    }

    public void setSessionBean(SessionBean sessionBean) {
        this.sessionBean = sessionBean;
    }

    public EGeneralDataService geteGeneralDataService() {
        return eGeneralDataService;
    }

    public void seteGeneralDataService(EGeneralDataService eGeneralDataService) {
        this.eGeneralDataService = eGeneralDataService;
    }

    public EGeneralDataVO getProfile() {
        try {
            profile = eGeneralDataService.findById(sessionBean.getUsername());
        } catch (ProfileNotExistException e) {
            e.printStackTrace();
        }
        return profile;
    }

    public void setProfile(EGeneralDataVO profile) {
        this.profile = profile;
    }
}
