/*     */ package com.gcom.beans;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.FetchType;
/*     */ import javax.persistence.GeneratedValue;
/*     */ import javax.persistence.GenerationType;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.JoinTable;
/*     */ import javax.persistence.OneToMany;
/*     */ import javax.persistence.Table;
/*     */ import javax.persistence.Temporal;
/*     */ import javax.persistence.TemporalType;
/*     */ import org.hibernate.annotations.Cascade;
/*     */ 
/*     */ @Entity
/*     */ @Table(name="salaryhistory")
/*     */ public class SalaryHistory
/*     */   implements Serializable
/*     */ {
/*     */ 
/*     */   @Id
/*     */   @GeneratedValue(strategy=GenerationType.AUTO)
/*     */   private Integer id;
/*     */ 
/*     */   @Column(name="username", nullable=false, length=300)
/*     */   private String username;
/*     */ 
/*     */   @Column(name="fullname", nullable=false, length=300)
/*     */   private String fullname;
/*     */ 
/*     */   @Column(name="year")
/*     */   private Integer year;
/*     */ 
/*     */   @Column(name="month")
/*     */   private Integer month;
/*     */ 
/*     */   @Column(name="workedDays")
/*     */   private Integer workedDays;
/*     */ 
/*     */   @Column(name="base_salary", precision=22, scale=0)
/*     */   private double baseSalary;

            @Column(name="brut_salary", precision=22, scale=0)
/*     */   private double brutSalary;
/*     */ 
/*     */   @Column(name="salaire_net", precision=22, scale=0)
/*     */   private double salaireNet;
/*     */ 
/*     */   @Column(name="contract", length=300)
/*     */   private String contract;
/*     */ 
/*     */   @Column(name="situation_familiale", length=300)
/*     */   private String situationFamiliale;
/*     */ 
/*     */   @Column(name="nombre_enfants")
/*     */   private Integer nombreEnfants;
/*     */ 
/*     */   @Column(name="paixDebut", length=300)
/*     */   private String paixDebut;
/*     */ 
/*     */   @Column(name="paixFin", length=300)
/*     */   private String paixFin;
/*     */ 
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="congeDebut", length=10)
/*     */   private Date congeDebut;
/*     */ 
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="congeFin", length=10)
/*     */   private Date congeFin;
/*     */ 
/*     */   @Column(name="cnss", precision=22, scale=0)
/*     */   private double cnss;
/*     */ 
/*     */   @Column(name="taux_cnss", precision=22, scale=0)
/*     */   private double tauxCNSS;
/*     */ 
/*     */   @Column(name="amo", precision=22, scale=0)
/*     */   private double amo;
/*     */ 
/*     */   @Column(name="taux_amo", precision=22, scale=0)
/*     */   private double tauxAMO;
/*     */ 
/*     */   @Column(name="seniority", precision=22, scale=0)
/*     */   private double seniority;
/*     */ 
/*     */   @Column(name="jobe_title", length=300)
/*     */   private String jobeTitle;
/*     */ 
/*     */   @Column(name="ir", precision=22, scale=0)
/*     */   private double ir;
/*     */ 
/*     */   @OneToMany(fetch=FetchType.LAZY)
/*     */   @Cascade({org.hibernate.annotations.CascadeType.ALL})
/*     */   @JoinTable(name="SalaryHistory_EPrimeHistory", joinColumns={@javax.persistence.JoinColumn(name="SALARY_ID")}, inverseJoinColumns={@javax.persistence.JoinColumn(name="EPRIME_ID")})
/* 100 */   private List<EPrimeHistory> listPrime = new ArrayList();
/*     */ 
/*     */   @OneToMany(fetch=FetchType.EAGER)
/*     */   @Cascade({org.hibernate.annotations.CascadeType.ALL})
/*     */   @JoinTable(name="SalaryHistory_EIndemHistory", joinColumns={@javax.persistence.JoinColumn(name="SALARY_ID")}, inverseJoinColumns={@javax.persistence.JoinColumn(name="EINDEM_ID")})
/* 105 */   private List<EIndemHistory> listIndem = new ArrayList();
/*     */ 
/*     */   public Integer getId()
/*     */   {
/* 111 */     return this.id;
/*     */   }
/*     */ 
/*     */   public void setId(Integer id) {
/* 115 */     this.id = id;
/*     */   }
/*     */ 
/*     */   public String getUsername() {
/* 119 */     return this.username;
/*     */   }
/*     */ 
/*     */   public void setUsername(String username) {
/* 123 */     this.username = username;
/*     */   }
/*     */ 
/*     */   public Integer getYear() {
/* 127 */     return this.year;
/*     */   }
/*     */ 
/*     */   public void setYear(Integer year) {
/* 131 */     this.year = year;
/*     */   }
/*     */ 
/*     */   public Integer getMonth() {
/* 135 */     return this.month;
/*     */   }
/*     */ 
/*     */   public void setMonth(Integer month) {
/* 139 */     this.month = month;
/*     */   }
/*     */ 
/*     */   public double getBaseSalary() {
/* 143 */     return this.baseSalary;
/*     */   }
/*     */ 
/*     */   public void setBaseSalary(double baseSalary) {
/* 147 */     this.baseSalary = baseSalary;
/*     */   }
/*     */ 
/*     */   public double getSalaireNet() {
/* 151 */     return this.salaireNet;
/*     */   }
/*     */ 
/*     */   public void setSalaireNet(double salaireNet) {
/* 155 */     this.salaireNet = salaireNet;
/*     */   }
/*     */ 
/*     */   public String getContract() {
/* 159 */     return this.contract;
/*     */   }
/*     */ 
/*     */   public void setContract(String contract) {
/* 163 */     this.contract = contract;
/*     */   }
/*     */ 
/*     */   public String getSituationFamiliale() {
/* 167 */     return this.situationFamiliale;
/*     */   }
/*     */ 
/*     */   public void setSituationFamiliale(String situationFamiliale) {
/* 171 */     this.situationFamiliale = situationFamiliale;
/*     */   }
/*     */ 
/*     */   public Integer getNombreEnfants() {
/* 175 */     return this.nombreEnfants;
/*     */   }
/*     */ 
/*     */   public void setNombreEnfants(Integer nombreEnfants) {
/* 179 */     this.nombreEnfants = nombreEnfants;
/*     */   }
/*     */ 
/*     */   public double getCnss()
/*     */   {
/* 185 */     return this.cnss;
/*     */   }
/*     */ 
/*     */   public void setCnss(double cnss) {
/* 189 */     this.cnss = cnss;
/*     */   }
/*     */ 
/*     */   public double getTauxCNSS() {
/* 193 */     return this.tauxCNSS;
/*     */   }
/*     */ 
/*     */   public void setTauxCNSS(double tauxCNSS) {
/* 197 */     this.tauxCNSS = tauxCNSS;
/*     */   }
/*     */ 
/*     */   public double getAmo() {
/* 201 */     return this.amo;
/*     */   }
/*     */ 
/*     */   public void setAmo(double amo) {
/* 205 */     this.amo = amo;
/*     */   }
/*     */ 
/*     */   public double getTauxAMO() {
/* 209 */     return this.tauxAMO;
/*     */   }
/*     */ 
/*     */   public void setTauxAMO(double tauxAMO) {
/* 213 */     this.tauxAMO = tauxAMO;
/*     */   }
/*     */ 
/*     */   public double getSeniority() {
/* 217 */     return this.seniority;
/*     */   }
/*     */ 
/*     */   public void setSeniority(double seniority) {
/* 221 */     this.seniority = seniority;
/*     */   }
/*     */ 
/*     */   public String getJobeTitle() {
/* 225 */     return this.jobeTitle;
/*     */   }
/*     */ 
/*     */   public void setJobeTitle(String jobeTitle) {
/* 229 */     this.jobeTitle = jobeTitle;
/*     */   }
/*     */ 
/*     */   public double getIr() {
/* 233 */     return this.ir;
/*     */   }
/*     */ 
/*     */   public void setIr(double ir) {
/* 237 */     this.ir = ir;
/*     */   }
/*     */ 
/*     */   public List<EPrimeHistory> getListPrime() {
/* 241 */     return this.listPrime;
/*     */   }
/*     */ 
/*     */   public void setListPrime(List<EPrimeHistory> listPrime) {
/* 245 */     this.listPrime = listPrime;
/*     */   }
/*     */ 
/*     */   public List<EIndemHistory> getListIndem() {
/* 249 */     return this.listIndem;
/*     */   }
/*     */ 
/*     */   public void setListIndem(List<EIndemHistory> listIndem) {
/* 253 */     this.listIndem = listIndem;
/*     */   }
/*     */ 
/*     */   public String getPaixDebut() {
/* 257 */     return this.paixDebut;
/*     */   }
/*     */ 
/*     */   public void setPaixDebut(String paixDebut) {
/* 261 */     this.paixDebut = paixDebut;
/*     */   }
/*     */ 
/*     */   public String getPaixFin() {
/* 265 */     return this.paixFin;
/*     */   }
/*     */ 
/*     */   public void setPaixFin(String paixFin) {
/* 269 */     this.paixFin = paixFin;
/*     */   }
/*     */ 
/*     */   public Date getCongeDebut() {
/* 273 */     return this.congeDebut;
/*     */   }
/*     */ 
/*     */   public void setCongeDebut(Date congeDebut) {
/* 277 */     this.congeDebut = congeDebut;
/*     */   }
/*     */ 
/*     */   public Date getCongeFin() {
/* 281 */     return this.congeFin;
/*     */   }
/*     */ 
/*     */   public void setCongeFin(Date congeFin) {
/* 285 */     this.congeFin = congeFin;
/*     */   }
/*     */ 
/*     */   public String getFullname() {
/* 289 */     return this.fullname;
/*     */   }
/*     */ 
/*     */   public void setFullname(String fullname) {
/* 293 */     this.fullname = fullname;
/*     */   }
/*     */ 
/*     */   public Integer getWorkedDays() {
/* 297 */     return this.workedDays;
/*     */   }
/*     */ 
/*     */   public void setWorkedDays(Integer workedDays) {
/* 301 */     this.workedDays = workedDays;
/*     */   }
/*     */
public double getBrutSalary() {
	return brutSalary;
}
public void setBrutSalary(double brutSalary) {
	this.brutSalary = brutSalary;
} }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.SalaryHistory
 * JD-Core Version:    0.6.2
 */