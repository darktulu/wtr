/*     */ package com.gcom.beans;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.GeneratedValue;
/*     */ import javax.persistence.GenerationType;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.Table;
/*     */ 
/*     */ @Entity
/*     */ @Table(name="e_salary_data")
/*     */ public class ESalaryData
/*     */   implements Serializable
/*     */ {
/*     */   private Integer salaryId;
/*     */   private String resurceId;
/*     */   private Double baseSalary;
/*     */   private String description;
/*     */   private int mois;
/*     */   private int ans;
/*     */ 
/*     */   public ESalaryData()
/*     */   {
/*     */   }
/*     */ 
/*     */   public ESalaryData(String resurceId, int mois, int ans)
/*     */   {
/*  29 */     this.resurceId = resurceId;
/*  30 */     this.mois = mois;
/*  31 */     this.ans = ans;
/*     */   }
/*     */ 
/*     */   public ESalaryData(String resurceId, Double baseSalary, String description, int mois, int ans) {
/*  35 */     this.resurceId = resurceId;
/*  36 */     this.baseSalary = baseSalary;
/*  37 */     this.description = description;
/*  38 */     this.mois = mois;
/*  39 */     this.ans = ans;
/*     */   }
/*  46 */   @Id
/*     */   @GeneratedValue(strategy=GenerationType.IDENTITY)
/*     */   @Column(name="SALARY_ID", unique=true, nullable=false)
/*     */   public Integer getSalaryId() { return this.salaryId; }
/*     */ 
/*     */   public void setSalaryId(Integer salaryId)
/*     */   {
/*  50 */     this.salaryId = salaryId;
/*     */   }
/*     */ 
/*     */   @Column(name="RESURCE_ID", nullable=false, length=500)
/*     */   public String getResurceId() {
/*  55 */     return this.resurceId;
/*     */   }
/*     */ 
/*     */   public void setResurceId(String resurceId) {
/*  59 */     this.resurceId = resurceId;
/*     */   }
/*     */ 
/*     */   @Column(name="BASE_SALARY", precision=22, scale=0)
/*     */   public Double getBaseSalary() {
/*  64 */     return this.baseSalary;
/*     */   }
/*     */ 
/*     */   public void setBaseSalary(Double baseSalary) {
/*  68 */     this.baseSalary = baseSalary;
/*     */   }
/*     */ 
/*     */   @Column(name="DESCRIPTION", length=500)
/*     */   public String getDescription() {
/*  73 */     return this.description;
/*     */   }
/*     */ 
/*     */   public void setDescription(String description) {
/*  77 */     this.description = description;
/*     */   }
/*     */ 
/*     */   @Column(name="mois", nullable=false)
/*     */   public int getMois() {
/*  82 */     return this.mois;
/*     */   }
/*     */ 
/*     */   public void setMois(int mois) {
/*  86 */     this.mois = mois;
/*     */   }
/*     */ 
/*     */   @Column(name="ans", nullable=false)
/*     */   public int getAns() {
/*  91 */     return this.ans;
/*     */   }
/*     */ 
/*     */   public void setAns(int ans) {
/*  95 */     this.ans = ans;
/*     */   }
/*     */ 
/*     */   public String toString()
/*     */   {
/* 100 */     return new StringBuilder().append("ESalaryData [").append(this.salaryId != null ? new StringBuilder().append("salaryId=").append(this.salaryId).append(", ").toString() : "").append(this.resurceId != null ? new StringBuilder().append("resurceId=").append(this.resurceId).append(", ").toString() : "").append(this.baseSalary != null ? new StringBuilder().append("baseSalary=").append(this.baseSalary).append(", ").toString() : "").append(this.description != null ? new StringBuilder().append("description=").append(this.description).append(", ").toString() : "").append("mois=").append(this.mois).append(", ans=").append(this.ans).append("]").toString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.ESalaryData
 * JD-Core Version:    0.6.2
 */