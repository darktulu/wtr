/*    */ package com.gcom.beans;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.FetchType;
/*    */ import javax.persistence.GeneratedValue;
/*    */ import javax.persistence.GenerationType;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.JoinColumn;
/*    */ import javax.persistence.ManyToOne;
/*    */ import javax.persistence.Table;
/*    */ 
/*    */ @Entity
/*    */ @Table(name="catalogdetail")
/*    */ public class Catalogdetail
/*    */   implements Serializable
/*    */ {
/*    */   private Integer idCatalogDetail;
/*    */   private Catalog catalog;
/*    */   private String reference;
/*    */   private String description;
/*    */   private String unit;
/*    */   private Double unitPrice;
/*    */ 
/*    */   public Catalogdetail()
/*    */   {
/*    */   }
/*    */ 
/*    */   public Catalogdetail(Catalog catalog, String reference, String description, String unit, Double unitPrice)
/*    */   {
/* 32 */     this.catalog = catalog;
/* 33 */     this.reference = reference;
/* 34 */     this.description = description;
/* 35 */     this.unit = unit;
/* 36 */     this.unitPrice = unitPrice;
/*    */   }
/* 43 */   @Id
/*    */   @GeneratedValue(strategy=GenerationType.IDENTITY)
/*    */   @Column(name="idCatalogDetail", unique=true, nullable=false)
/*    */   public Integer getIdCatalogDetail() { return this.idCatalogDetail; }
/*    */ 
/*    */   public void setIdCatalogDetail(Integer idCatalogDetail)
/*    */   {
/* 47 */     this.idCatalogDetail = idCatalogDetail;
/*    */   }
/*    */   @ManyToOne(fetch=FetchType.LAZY)
/*    */   @JoinColumn(name="catalog_idcatalog")
/*    */   public Catalog getCatalog() {
/* 53 */     return this.catalog;
/*    */   }
/*    */ 
/*    */   public void setCatalog(Catalog catalog) {
/* 57 */     this.catalog = catalog;
/*    */   }
/*    */ 
/*    */   @Column(name="reference", length=45)
/*    */   public String getReference() {
/* 62 */     return this.reference;
/*    */   }
/*    */ 
/*    */   public void setReference(String reference) {
/* 66 */     this.reference = reference;
/*    */   }
/*    */ 
/*    */   @Column(name="description", length=200)
/*    */   public String getDescription() {
/* 71 */     return this.description;
/*    */   }
/*    */ 
/*    */   public void setDescription(String description) {
/* 75 */     this.description = description;
/*    */   }
/*    */ 
/*    */   @Column(name="unit", length=45)
/*    */   public String getUnit() {
/* 80 */     return this.unit;
/*    */   }
/*    */ 
/*    */   public void setUnit(String unit) {
/* 84 */     this.unit = unit;
/*    */   }
/*    */ 
/*    */   @Column(name="unitPrice", precision=22, scale=0)
/*    */   public Double getUnitPrice() {
/* 89 */     return this.unitPrice;
/*    */   }
/*    */ 
/*    */   public void setUnitPrice(Double unitPrice) {
/* 93 */     this.unitPrice = unitPrice;
/*    */   }
/*    */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.Catalogdetail
 * JD-Core Version:    0.6.2
 */