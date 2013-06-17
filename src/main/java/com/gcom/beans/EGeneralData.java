package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "e_general_data")
public class EGeneralData implements Serializable {
    private String resurceId;
    private String efId;
    private String name;
    private String surname;
    private String idPhoto;
    private String email;
    private Date birthday;
    private String cin;
    private String cnss;
    private String martialStatus;
    private String gender;
    private String cimr;
    private String homeAdress;
    private String businessPhoneNumber;
    private String businessFax;
    private String contactInformation;
    private String emergencyContact;
    private String skypeId;
    private String imId;
    private String bankName;
    private String bankAccount;
    private String status;
    private String passportid;
    private Date passportEpireDate;
    private String driveLiecenceId;
    private String driveLicencetype;
    private String pecName;
    private String pecNumber;
    private String secName;
    private String secNumber;
    private String PMobile;
    private String SMobile;
    private String hmePhoneNumber;
    private String country;
    private String region;
    private String iesourcing;
    private String jobeTitle;
    private String grade;
    private String ladder;
    private String tercel;
    private Date lastModified;
    private String matricule;
    private String matriculeInssurance;
    private String matriculeAxa;
    private String secondaryMailAdresse;

    public EGeneralData() {
    }

    public EGeneralData(String resurceId, String efId) {
        this.resurceId = resurceId;
        this.efId = efId;
    }

    public EGeneralData(String resurceId, String efId, String name,
                        String surname, String idPhoto, String email, Date birthday,
                        String cin, String cnss, String martialStatus, String gender,
                        String cimr, String homeAdress, String businessPhoneNumber,
                        String businessFax, String contactInformation,
                        String emergencyContact, String skypeId, String imId,
                        String bankName, String bankAccount, String status,
                        String passportid, Date passportEpireDate, String driveLiecenceId,
                        String driveLicencetype, String pecName, String pecNumber,
                        String secName, String secNumber, String PMobile, String SMobile,
                        String hmePhoneNumber, String country, String region,
                        String iesourcing, String jobeTitle, String grade, String ladder,
                        String tercel, Date lastModified, String matricule,
                        String matriculeInssurance, String secondaryMailAdresse) {
        this.resurceId = resurceId;
        this.efId = efId;
        this.name = name;
        this.surname = surname;
        this.idPhoto = idPhoto;
        this.email = email;
        this.birthday = birthday;
        this.cin = cin;
        this.cnss = cnss;
        this.martialStatus = martialStatus;
        this.gender = gender;
        this.cimr = cimr;
        this.homeAdress = homeAdress;
        this.businessPhoneNumber = businessPhoneNumber;
        this.businessFax = businessFax;
        this.contactInformation = contactInformation;
        this.emergencyContact = emergencyContact;
        this.skypeId = skypeId;
        this.imId = imId;
        this.bankName = bankName;
        this.bankAccount = bankAccount;
        this.status = status;
        this.passportid = passportid;
        this.passportEpireDate = passportEpireDate;
        this.driveLiecenceId = driveLiecenceId;
        this.driveLicencetype = driveLicencetype;
        this.pecName = pecName;
        this.pecNumber = pecNumber;
        this.secName = secName;
        this.secNumber = secNumber;
        this.PMobile = PMobile;
        this.SMobile = SMobile;
        this.hmePhoneNumber = hmePhoneNumber;
        this.country = country;
        this.region = region;
        this.iesourcing = iesourcing;
        this.jobeTitle = jobeTitle;
        this.grade = grade;
        this.ladder = ladder;
        this.tercel = tercel;
        this.lastModified = lastModified;
        this.matricule = matricule;
        this.matriculeInssurance = matriculeInssurance;
        this.secondaryMailAdresse = secondaryMailAdresse;
    }

    @Id
    @Column(name = "RESURCE_ID", unique = true, nullable = false, length = 500)
    public String getResurceId() {
        return this.resurceId;
    }

    public void setResurceId(String resurceId) {
        this.resurceId = resurceId;
    }

    @Column(name = "EF_ID", nullable = false, length = 200)
    public String getEfId() {
        return this.efId;
    }

    public void setEfId(String efId) {
        this.efId = efId;
    }

    @Column(name = "NAME", length = 500)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "SURNAME", length = 500)
    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Column(name = "ID_PHOTO", length = 100)
    public String getIdPhoto() {
        return this.idPhoto;
    }

    public void setIdPhoto(String idPhoto) {
        this.idPhoto = idPhoto;
    }

    @Column(name = "email", length = 500)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "BIRTHDAY", length = 10)
    public Date getBirthday() {
        return this.birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Column(name = "CIN", length = 100)
    public String getCin() {
        return this.cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    @Column(name = "CNSS", length = 500)
    public String getCnss() {
        return this.cnss;
    }

    public void setCnss(String cnss) {
        this.cnss = cnss;
    }

    @Column(name = "MARTIAL_STATUS", length = 50)
    public String getMartialStatus() {
        return this.martialStatus;
    }

    public void setMartialStatus(String martialStatus) {
        this.martialStatus = martialStatus;
    }

    @Column(name = "GENDER", length = 50)
    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Column(name = "CIMR", length = 200)
    public String getCimr() {
        return this.cimr;
    }

    public void setCimr(String cimr) {
        this.cimr = cimr;
    }

    @Column(name = "HOME_ADRESS", length = 500)
    public String getHomeAdress() {
        return this.homeAdress;
    }

    public void setHomeAdress(String homeAdress) {
        this.homeAdress = homeAdress;
    }

    @Column(name = "BUSINESS_PHONE_NUMBER", length = 100)
    public String getBusinessPhoneNumber() {
        return this.businessPhoneNumber;
    }

    public void setBusinessPhoneNumber(String businessPhoneNumber) {
        this.businessPhoneNumber = businessPhoneNumber;
    }

    @Column(name = "BUSINESS_FAX", length = 100)
    public String getBusinessFax() {
        return this.businessFax;
    }

    public void setBusinessFax(String businessFax) {
        this.businessFax = businessFax;
    }

    @Column(name = "CONTACT_INFORMATION", length = 500)
    public String getContactInformation() {
        return this.contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    @Column(name = "EMERGENCY_CONTACT", length = 500)
    public String getEmergencyContact() {
        return this.emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    @Column(name = "SKYPE_ID", length = 100)
    public String getSkypeId() {
        return this.skypeId;
    }

    public void setSkypeId(String skypeId) {
        this.skypeId = skypeId;
    }

    @Column(name = "IM_ID", length = 100)
    public String getImId() {
        return this.imId;
    }

    public void setImId(String imId) {
        this.imId = imId;
    }

    @Column(name = "BANK_NAME", length = 100)
    public String getBankName() {
        return this.bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Column(name = "BANK_ACCOUNT", length = 200)
    public String getBankAccount() {
        return this.bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Column(name = "Status", length = 100)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "passportid", length = 500)
    public String getPassportid() {
        return this.passportid;
    }

    public void setPassportid(String passportid) {
        this.passportid = passportid;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "passportEpireDate", length = 10)
    public Date getPassportEpireDate() {
        return this.passportEpireDate;
    }

    public void setPassportEpireDate(Date passportEpireDate) {
        this.passportEpireDate = passportEpireDate;
    }

    @Column(name = "driveLiecenceID", length = 500)
    public String getDriveLiecenceId() {
        return this.driveLiecenceId;
    }

    public void setDriveLiecenceId(String driveLiecenceId) {
        this.driveLiecenceId = driveLiecenceId;
    }

    @Column(name = "driveLicencetype", length = 500)
    public String getDriveLicencetype() {
        return this.driveLicencetype;
    }

    public void setDriveLicencetype(String driveLicencetype) {
        this.driveLicencetype = driveLicencetype;
    }

    @Column(name = "pec_name", length = 500)
    public String getPecName() {
        return this.pecName;
    }

    public void setPecName(String pecName) {
        this.pecName = pecName;
    }

    @Column(name = "pec_number", length = 500)
    public String getPecNumber() {
        return this.pecNumber;
    }

    public void setPecNumber(String pecNumber) {
        this.pecNumber = pecNumber;
    }

    @Column(name = "sec_name", length = 500)
    public String getSecName() {
        return this.secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }

    @Column(name = "sec_number", length = 500)
    public String getSecNumber() {
        return this.secNumber;
    }

    public void setSecNumber(String secNumber) {
        this.secNumber = secNumber;
    }

    @Column(name = "p_mobile", length = 500)
    public String getPMobile() {
        return this.PMobile;
    }

    public void setPMobile(String PMobile) {
        this.PMobile = PMobile;
    }

    @Column(name = "s_mobile", length = 500)
    public String getSMobile() {
        return this.SMobile;
    }

    public void setSMobile(String SMobile) {
        this.SMobile = SMobile;
    }

    @Column(name = "hme_phone_number", length = 500)
    public String getHmePhoneNumber() {
        return this.hmePhoneNumber;
    }

    public void setHmePhoneNumber(String hmePhoneNumber) {
        this.hmePhoneNumber = hmePhoneNumber;
    }

    @Column(name = "Country", length = 200)
    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Column(name = "Region", length = 200)
    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Column(name = "IEsourcing", length = 200)
    public String getIesourcing() {
        return this.iesourcing;
    }

    public void setIesourcing(String iesourcing) {
        this.iesourcing = iesourcing;
    }

    @Column(name = "jobe_title", length = 200)
    public String getJobeTitle() {
        return this.jobeTitle;
    }

    public void setJobeTitle(String jobeTitle) {
        this.jobeTitle = jobeTitle;
    }

    @Column(name = "Grade", length = 200)
    public String getGrade() {
        return this.grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Column(name = "Ladder", length = 200)
    public String getLadder() {
        return this.ladder;
    }

    public void setLadder(String ladder) {
        this.ladder = ladder;
    }

    @Column(name = "Tercel", length = 50)
    public String getTercel() {
        return this.tercel;
    }

    public void setTercel(String tercel) {
        this.tercel = tercel;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "LastModified", length = 10)
    public Date getLastModified() {
        return this.lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    @Column(name = "matricule", length = 200)
    public String getMatricule() {
        return this.matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    @Column(name = "matricule_inssurance", length = 200)
    public String getMatriculeInssurance() {
        return this.matriculeInssurance;
    }

    public void setMatriculeInssurance(String matriculeInssurance) {
        this.matriculeInssurance = matriculeInssurance;
    }

    @Column(name = "secondary_mail_adresse", length = 200)
    public String getSecondaryMailAdresse() {
        return this.secondaryMailAdresse;
    }

    public void setSecondaryMailAdresse(String secondaryMailAdresse) {
        this.secondaryMailAdresse = secondaryMailAdresse;
    }

    @Column(name = "matricule_axa", length = 200)
    public String getMatriculeAxa() {
        return matriculeAxa;
    }

    public void setMatriculeAxa(String matriculeAxa) {
        this.matriculeAxa = matriculeAxa;
    }
}
