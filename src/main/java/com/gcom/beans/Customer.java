package com.gcom.beans;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer implements Serializable{
	private static final long serialVersionUID = 1L;
	  private Integer idcustomer;
	  private String name;
	  private String country;
	  private String address;
	  private String ri;
	  private String vat;
	  private String contact;
	  private String linkGed;
	  private String accountManager;
	  private String code;
	  private String manager_idmanager;
	  private Set<Project> projects = new HashSet<Project>(0);
	  private Set<Contract> contracts = new HashSet<Contract>(0);
	
	  public Customer() {
	  }
	
	  public Customer(String name, String country, String address, String ri, String vat, String contact, String linkGed, String accountManager, String code, Set<Project> projects, Set<Contract> contracts) {
	    this.name = name;
	    this.country = country;
	    this.address = address;
	    this.ri = ri;
	    this.vat = vat;
	    this.contact = contact;
	    this.linkGed = linkGed;
	    this.accountManager = accountManager;
	    this.code = code;
	    this.projects = projects;
	    this.contracts = contracts;
	  }
	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  @Column(name="idcustomer", unique=true, nullable=false)
	  public Integer getIdcustomer() { return this.idcustomer; }
	
	  public void setIdcustomer(Integer idcustomer)
	  {
	    this.idcustomer = idcustomer;
	  }
	
	  @Column(name="name", length=100)
	  public String getName() {
	    return this.name;
	  }
	
	  public void setName(String name) {
	    this.name = name;
	  }
	
	  @Column(name="country", length=45)
	  public String getCountry() {
	    return this.country;
	  }
	
	  public void setCountry(String country) {
	    this.country = country;
	  }
	
	  @Column(name="address", length=999)
	  public String getAddress() {
	    return this.address;
	  }
	
	  public void setAddress(String address) {
	    this.address = address;
	  }
	
	  @Column(name="ri", length=45)
	  public String getRi() {
	    return this.ri;
	  }
	
	  public void setRi(String ri) {
	    this.ri = ri;
	  }
	
	  @Column(name="vat", length=45)
	  public String getVat() {
	    return this.vat;
	  }
	
	  public void setVat(String vat) {
	    this.vat = vat;
	  }
	
	  @Column(name="contact", length=999)
	  public String getContact() {
	    return this.contact;
	  }
	
	  public void setContact(String contact) {
	    this.contact = contact;
	  }
	
	  @Column(name="linkGed", length=500)
	  public String getLinkGed() {
	    return this.linkGed;
	  }
	
	  public void setLinkGed(String linkGed) {
	    this.linkGed = linkGed;
	  }
	
	  @Column(name="accountManager", length=999)
	  public String getAccountManager() {
	    return this.accountManager;
	  }
	
	  public void setAccountManager(String accountManager) {
	    this.accountManager = accountManager;
	  }
	
	  @Column(name="code", length=999)
	  public String getCode() {
	    return this.code;
	  }
	
	  public void setCode(String code) {
	    this.code = code;
	  }
	
	  @OneToMany(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="customer")
	  public Set<Project> getProjects() {
	    return this.projects;
	  }
	
	  public void setProjects(Set<Project> projects) {
	    this.projects = projects;
	  }
	
	  @OneToMany(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="customer")
	  public Set<Contract> getContracts() {
	    return this.contracts;
	  }
	
	  public void setContracts(Set<Contract> contracts) {
	    this.contracts = contracts;
	  }

	  @Column(name="manager_idmanager", length=45)
	  public String getManager_idmanager() {
		  return manager_idmanager;
	  }

	  public void setManager_idmanager(String manager_idmanager) {
		  this.manager_idmanager = manager_idmanager;
	  }
	  
	  
}
