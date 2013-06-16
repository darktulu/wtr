/*    */ package com.gcom.beans;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.Table;
/*    */ 
/*    */ @Entity
/*    */ @Table(name="e_functional_data")
/*    */ public class EFunctionalData
/*    */   implements Serializable
/*    */ {
/*    */   private String efId;
/*    */   private Integer lob;
/*    */   private String functionalLm;
/*    */   private String hrLineManager;
/*    */ 
/*    */   public EFunctionalData()
/*    */   {
/*    */   }
/*    */ 
/*    */   public EFunctionalData(String efId)
/*    */   {
/* 25 */     this.efId = efId;
/*    */   }
/*    */ 
/*    */   public EFunctionalData(String efId, Integer lob, String functionalLm, String hrLineManager) {
/* 29 */     this.efId = efId;
/* 30 */     this.lob = lob;
/* 31 */     this.functionalLm = functionalLm;
/* 32 */     this.hrLineManager = hrLineManager;
/*    */   }
/*    */   @Id
/*    */   @Column(name="EF_ID", unique=true, nullable=false, length=200)
/*    */   public String getEfId() {
/* 38 */     return this.efId;
/*    */   }
/*    */ 
/*    */   public void setEfId(String efId) {
/* 42 */     this.efId = efId;
/*    */   }
/*    */ 
/*    */   @Column(name="LOB")
/*    */   public Integer getLob() {
/* 47 */     return this.lob;
/*    */   }
/*    */ 
/*    */   public void setLob(Integer lob) {
/* 51 */     this.lob = lob;
/*    */   }
/*    */ 
/*    */   @Column(name="FUNCTIONAL_LM", length=500)
/*    */   public String getFunctionalLm() {
/* 56 */     return this.functionalLm;
/*    */   }
/*    */ 
/*    */   public void setFunctionalLm(String functionalLm) {
/* 60 */     this.functionalLm = functionalLm;
/*    */   }
/*    */ 
/*    */   @Column(name="HR_LINE_MANAGER", length=500)
/*    */   public String getHrLineManager() {
/* 65 */     return this.hrLineManager;
/*    */   }
/*    */ 
/*    */   public void setHrLineManager(String hrLineManager) {
/* 69 */     this.hrLineManager = hrLineManager;
/*    */   }
/*    */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.EFunctionalData
 * JD-Core Version:    0.6.2
 */