package com.gcom.view;

import com.gcom.service.metier.EGeneralDataService;
import com.gcom.view.vo.EGeneralDataVO;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.List;

@ManagedBean
@ViewScoped
public class ListEmployeesBean implements Serializable {
    private static final long serialVersionUID = 1L;

    @ManagedProperty("#{eGeneralDataService}")
    private EGeneralDataService eGeneralDataService;

    private List<EGeneralDataVO> listcurrentEmployees;

    public EGeneralDataService geteGeneralDataService() {
        return eGeneralDataService;
    }

    public void seteGeneralDataService(EGeneralDataService eGeneralDataService) {
        this.eGeneralDataService = eGeneralDataService;
    }

    public List<EGeneralDataVO> getListcurrentEmployees() {
        listcurrentEmployees = eGeneralDataService.loadActiveEmployees();
        return listcurrentEmployees;
    }

    public void setListcurrentEmployees(List<EGeneralDataVO> listcurrentEmployees) {
        this.listcurrentEmployees = listcurrentEmployees;
    }
}
