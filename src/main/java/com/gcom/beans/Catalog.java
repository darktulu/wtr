/*    */ package com.gcom.beans;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.HashSet;
/*    */ import java.util.Set;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.FetchType;
/*    */ import javax.persistence.GeneratedValue;
/*    */ import javax.persistence.GenerationType;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.JoinColumn;
/*    */ import javax.persistence.ManyToOne;
/*    */ import javax.persistence.OneToMany;
/*    */ import javax.persistence.Table;
/*    */ 
/*    */ @Entity
/*    */ @Table(name="catalog")
/*    */ public class Catalog
/*    */   implements Serializable
/*    */ {
/*    */   private Integer idcatalog;
/*    */   private Supplier supplier;
/*    */   private String name;
/*    */   private String currency;
/*    */   private Integer idcontract;
/* 30 */   private Set<Catalogdetail> catalogdetails = new HashSet(0);
/*    */ 
/*    */   public Catalog() {
/*    */   }
/*    */ 
/*    */   public Catalog(Supplier supplier, String name, String currency, Integer idcontract, Set<Catalogdetail> catalogdetails) {
/* 36 */     this.supplier = supplier;
/* 37 */     this.name = name;
/* 38 */     this.currency = currency;
/* 39 */     this.idcontract = idcontract;
/* 40 */     this.catalogdetails = catalogdetails;
/*    */   }
/* 47 */   @Id
/*    */   @GeneratedValue(strategy=GenerationType.IDENTITY)
/*    */   @Column(name="idcatalog", unique=true, nullable=false)
/*    */   public Integer getIdcatalog() { return this.idcatalog; }
/*    */ 
/*    */   public void setIdcatalog(Integer idcatalog)
/*    */   {
/* 51 */     this.idcatalog = idcatalog;
/*    */   }
/*    */   @ManyToOne(fetch=FetchType.LAZY)
/*    */   @JoinColumn(name="supplier_idsupplier")
/*    */   public Supplier getSupplier() {
/* 57 */     return this.supplier;
/*    */   }
/*    */ 
/*    */   public void setSupplier(Supplier supplier) {
/* 61 */     this.supplier = supplier;
/*    */   }
/*    */ 
/*    */   @Column(name="name", length=45)
/*    */   public String getName() {
/* 66 */     return this.name;
/*    */   }
/*    */ 
/*    */   public void setName(String name) {
/* 70 */     this.name = name;
/*    */   }
/*    */ 
/*    */   @Column(name="currency", length=45)
/*    */   public String getCurrency() {
/* 75 */     return this.currency;
/*    */   }
/*    */ 
/*    */   public void setCurrency(String currency) {
/* 79 */     this.currency = currency;
/*    */   }
/*    */ 
/*    */   @Column(name="idcontract")
/*    */   public Integer getIdcontract() {
/* 84 */     return this.idcontract;
/*    */   }
/*    */ 
/*    */   public void setIdcontract(Integer idcontract) {
/* 88 */     this.idcontract = idcontract;
/*    */   }
/*    */ 
/*    */   @OneToMany(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="catalog")
/*    */   public Set<Catalogdetail> getCatalogdetails() {
/* 93 */     return this.catalogdetails;
/*    */   }
/*    */ 
/*    */   public void setCatalogdetails(Set<Catalogdetail> catalogdetails) {
/* 97 */     this.catalogdetails = catalogdetails;
/*    */   }
/*    */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.Catalog
 * JD-Core Version:    0.6.2
 */