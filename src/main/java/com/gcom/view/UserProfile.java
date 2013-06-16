package com.gcom.view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import com.gcom.beans.EGeneralData;
import com.gcom.service.exceptions.ProfileNotExistException;
import com.gcom.service.metier.EGeneralDataService;
import com.gcom.view.vo.EGeneralDataVO;


@ManagedBean
@RequestScoped
public class UserProfile {
	
	@ManagedProperty("#{sessionBean}")
	public SessionBean sessionBean;
	
	@ManagedProperty("#{eGeneralDataService}")
	public EGeneralDataService eGeneralDataService;
	
	public EGeneralDataVO profile =new EGeneralDataVO();
	

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
