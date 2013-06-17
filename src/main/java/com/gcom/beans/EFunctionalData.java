package com.gcom.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "e_functional_data")
public class EFunctionalData implements Serializable {
    private String efId;
    private Integer lob;
    private String functionalLm;
    private String hrLineManager;

    public EFunctionalData() {
    }

    public EFunctionalData(String efId) {
        this.efId = efId;
    }

    public EFunctionalData(String efId, Integer lob, String functionalLm, String hrLineManager) {
        this.efId = efId;
        this.lob = lob;
        this.functionalLm = functionalLm;
        this.hrLineManager = hrLineManager;
    }

    @Id
    @Column(name = "EF_ID", unique = true, nullable = false, length = 200)
    public String getEfId() {
        return this.efId;
    }

    public void setEfId(String efId) {
        this.efId = efId;
    }

    @Column(name = "LOB")
    public Integer getLob() {
        return this.lob;
    }

    public void setLob(Integer lob) {
        this.lob = lob;
    }

    @Column(name = "FUNCTIONAL_LM", length = 500)
    public String getFunctionalLm() {
        return this.functionalLm;
    }

    public void setFunctionalLm(String functionalLm) {
        this.functionalLm = functionalLm;
    }

    @Column(name = "HR_LINE_MANAGER", length = 500)
    public String getHrLineManager() {
        return this.hrLineManager;
    }

    public void setHrLineManager(String hrLineManager) {
        this.hrLineManager = hrLineManager;
    }
}
