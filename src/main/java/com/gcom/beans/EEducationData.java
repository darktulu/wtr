/*     */ package com.gcom.beans;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.GeneratedValue;
/*     */ import javax.persistence.GenerationType;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.Table;
/*     */ import javax.persistence.Temporal;
/*     */ import javax.persistence.TemporalType;
/*     */ 
/*     */ @Entity
/*     */ @Table(name="e_education_data")
/*     */ public class EEducationData
/*     */   implements Serializable
/*     */ {
/*     */   private Integer idEducation;
/*     */   private String resurceId;
/*     */   private String type;
/*     */   private String nameInstitut;
/*     */   private String addressInstitut;
/*     */   private String courseStudy;
/*     */   private Date dateFrom;
/*     */   private Date dateTo;
/*     */   private boolean certification;
/*     */ 
/*     */   public EEducationData()
/*     */   {
/*     */   }
/*     */ 
/*     */   public EEducationData(String resurceId, String type, String nameInstitut, String addressInstitut, String courseStudy, Date dateFrom, Date dateTo, boolean certification)
/*     */   {
/*  35 */     this.resurceId = resurceId;
/*  36 */     this.type = type;
/*  37 */     this.nameInstitut = nameInstitut;
/*  38 */     this.addressInstitut = addressInstitut;
/*  39 */     this.courseStudy = courseStudy;
/*  40 */     this.dateFrom = dateFrom;
/*  41 */     this.dateTo = dateTo;
/*  42 */     this.certification = certification;
/*     */   }
/*  49 */   @Id
/*     */   @GeneratedValue(strategy=GenerationType.IDENTITY)
/*     */   @Column(name="Id_Education", unique=true, nullable=false)
/*     */   public Integer getIdEducation() { return this.idEducation; }
/*     */ 
/*     */   public void setIdEducation(Integer idEducation)
/*     */   {
/*  53 */     this.idEducation = idEducation;
/*     */   }
/*     */ 
/*     */   @Column(name="RESURCE_ID", nullable=false, length=500)
/*     */   public String getResurceId() {
/*  58 */     return this.resurceId;
/*     */   }
/*     */ 
/*     */   public void setResurceId(String resurceId) {
/*  62 */     this.resurceId = resurceId;
/*     */   }
/*     */ 
/*     */   @Column(name="Type", nullable=false, length=100)
/*     */   public String getType() {
/*  67 */     return this.type;
/*     */   }
/*     */ 
/*     */   public void setType(String type) {
/*  71 */     this.type = type;
/*     */   }
/*     */ 
/*     */   @Column(name="Name_Institut", nullable=false, length=100)
/*     */   public String getNameInstitut() {
/*  76 */     return this.nameInstitut;
/*     */   }
/*     */ 
/*     */   public void setNameInstitut(String nameInstitut) {
/*  80 */     this.nameInstitut = nameInstitut;
/*     */   }
/*     */ 
/*     */   @Column(name="Address_Institut", nullable=false, length=500)
/*     */   public String getAddressInstitut() {
/*  85 */     return this.addressInstitut;
/*     */   }
/*     */ 
/*     */   public void setAddressInstitut(String addressInstitut) {
/*  89 */     this.addressInstitut = addressInstitut;
/*     */   }
/*     */ 
/*     */   @Column(name="Course_Study", nullable=false, length=100)
/*     */   public String getCourseStudy() {
/*  94 */     return this.courseStudy;
/*     */   }
/*     */ 
/*     */   public void setCourseStudy(String courseStudy) {
/*  98 */     this.courseStudy = courseStudy;
/*     */   }
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="Date_From", nullable=false, length=10)
/*     */   public Date getDateFrom() {
/* 104 */     return this.dateFrom;
/*     */   }
/*     */ 
/*     */   public void setDateFrom(Date dateFrom) {
/* 108 */     this.dateFrom = dateFrom;
/*     */   }
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="Date_To", nullable=false, length=10)
/*     */   public Date getDateTo() {
/* 114 */     return this.dateTo;
/*     */   }
/*     */ 
/*     */   public void setDateTo(Date dateTo) {
/* 118 */     this.dateTo = dateTo;
/*     */   }
/*     */ 
/*     */   @Column(name="Certification", nullable=false)
/*     */   public boolean isCertification() {
/* 123 */     return this.certification;
/*     */   }
/*     */ 
/*     */   public void setCertification(boolean certification) {
/* 127 */     this.certification = certification;
/*     */   }
/*     */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.EEducationData
 * JD-Core Version:    0.6.2
 */