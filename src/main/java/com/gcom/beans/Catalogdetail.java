package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "catalogdetail")
public class Catalogdetail implements Serializable {
    private Integer idCatalogDetail;
    private Catalog catalog;
    private String reference;
    private String description;
    private String unit;
    private Double unitPrice;

    public Catalogdetail() {
    }

    public Catalogdetail(Catalog catalog, String reference, String description, String unit, Double unitPrice) {
        this.catalog = catalog;
        this.reference = reference;
        this.description = description;
        this.unit = unit;
        this.unitPrice = unitPrice;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCatalogDetail", unique = true, nullable = false)
    public Integer getIdCatalogDetail() {
        return this.idCatalogDetail;
    }

    public void setIdCatalogDetail(Integer idCatalogDetail) {
        this.idCatalogDetail = idCatalogDetail;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "catalog_idcatalog")
    public Catalog getCatalog() {
        return this.catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    @Column(name = "reference", length = 45)
    public String getReference() {
        return this.reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Column(name = "description", length = 200)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "unit", length = 45)
    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Column(name = "unitPrice", precision = 22, scale = 0)
    public Double getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
