package com.gcom.beans;

import javax.faces.model.SelectItem;
import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
@Table(name = "po")
public class Po implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idpo;
    private Supplier supplier;
    private Project project;
    private Contract contract;
    private String numero;
    private Date poDate;
    private String description;
    private String linkGed;
    private String status;
    private String currency;
    private Set<Podetails> podetailses = new HashSet<Podetails>(0);
    private Set<Paymentterm> paymentterms = new HashSet<Paymentterm>(0);
    private Date date1;
    private Date date2;
    private Date date3;
    private Date date4;
    private Date date5;
    private Date dateR;
    private Date dateC;
    private String comment;
    private Company company;

    public Po() {
    }

    public Po(Project project) {
        this.project = project;
    }

    public Po(Supplier supplier, Project project, Contract contract,
              String numero, String comment, Date poDate, String description,
              String linkGed, String status, String currency, Set<Podetails> podetailses,
              Set<Paymentterm> paymentterms, Date date1, Date date2, Date date3, Date date4,
              Date date5, Date dateR, Date dateC) {
        this.supplier = supplier;
        this.project = project;
        this.contract = contract;
        this.numero = numero;
        this.poDate = poDate;
        this.description = description;
        this.linkGed = linkGed;
        this.status = status;
        this.currency = currency;
        this.podetailses = podetailses;
        this.paymentterms = paymentterms;
        this.comment = comment;
        this.date1 = date1;
        this.date2 = date2;
        this.date3 = date3;
        this.date4 = date4;
        this.date5 = date5;
        this.dateR = dateR;
        this.dateC = dateC;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpo", unique = true, nullable = false)
    public Integer getIdpo() {
        return this.idpo;
    }

    public void setIdpo(Integer idpo) {
        this.idpo = idpo;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "supplier_idsupplier")
    public Supplier getSupplier() {
        return this.supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_idproject", nullable = false)
    public Project getProject() {
        return this.project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contract_idcontract")
    public Contract getContract() {
        return this.contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    @Column(name = "numero", length = 45)
    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "poDate", length = 10)
    public Date getPoDate() {
        return this.poDate;
    }

    public void setPoDate(Date poDate) {
        this.poDate = poDate;
    }

    @Column(name = "description", length = 450)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "linkGed", length = 450)
    public String getLinkGed() {
        return this.linkGed;
    }

    public void setLinkGed(String linkGed) {
        this.linkGed = linkGed;
    }

    @Column(name = "status", length = 45)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "currency", length = 45)
    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = FetchType.EAGER, mappedBy = "po")
    public Set<Podetails> getPodetailses() {
        return this.podetailses;
    }

    public void setPodetailses(Set<Podetails> podetailses) {
        this.podetailses = podetailses;
    }

    @OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "po")
    public Set<Paymentterm> getPaymentterms() {
        return this.paymentterms;
    }

    public void setPaymentterms(Set<Paymentterm> paymentterms) {
        this.paymentterms = paymentterms;
    }

    public boolean loadEtatComplete() {
        double sumAccepted = 0;
        double sumPO = 0;
        for (Podetails po : new ArrayList<Podetails>(getPodetailses())) {
            for (Acceptancedetails ad : new ArrayList<Acceptancedetails>(po.getAcceptancedetailses())) {
                sumAccepted += ad.getTotalPriceAccepted();
            }
            sumPO += po.getTotalPrice();
        }
        double remainder = sumPO - sumAccepted;
        if (remainder < 0.01) {
            return true;
        } else {
            return false;
        }
    }

    public double loadRemainingToAccept() {
        double sumAccepted = 0;
        double sumPO = 0;
        for (Podetails po : new ArrayList<Podetails>(getPodetailses())) {
            for (Acceptancedetails ad : new ArrayList<Acceptancedetails>(
                    po.getAcceptancedetailses())) {
                sumAccepted += ad.getTotalPriceAccepted();
            }
            sumPO += po.getTotalPrice();
        }

        return sumPO - sumAccepted;
    }

    public double loadAmountAccepted() {
        double sumAccepted = 0;
        for (Podetails po : new ArrayList<Podetails>(getPodetailses())) {
            for (Acceptancedetails ad : new ArrayList<Acceptancedetails>(
                    po.getAcceptancedetailses())) {
                sumAccepted += ad.getTotalPriceAccepted();
            }
        }

        return sumAccepted;
    }

    public double loadTotal() {
        double t = 0;
        for (Podetails po : new ArrayList<Podetails>(getPodetailses())) {
            t += po.getTotalPrice();
        }
        return t;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "date1", length = 10)
    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "date2", length = 10)
    public Date getDate2() {
        return date2;
    }

    public void setDate2(Date date2) {
        this.date2 = date2;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "date3", length = 10)
    public Date getDate3() {
        return date3;
    }

    public void setDate3(Date date3) {
        this.date3 = date3;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "date4", length = 10)
    public Date getDate4() {
        return date4;
    }

    public void setDate4(Date date4) {
        this.date4 = date4;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "date5", length = 10)
    public Date getDate5() {
        return date5;
    }

    public void setDate5(Date date5) {
        this.date5 = date5;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "dateC", length = 10)
    public Date getDateC() {
        return dateC;
    }

    public void setDateC(Date dateC) {
        this.dateC = dateC;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "dateR", length = 10)
    public Date getDateR() {
        return dateR;
    }

    public void setDateR(Date dateR) {
        this.dateR = dateR;
    }

    @Column(name = "comment", length = 9999)
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<Acceptance> loadAcceptances() {
        List<Acceptance> l = new ArrayList<Acceptance>();
        for (Paymentterm es : new ArrayList<Paymentterm>(paymentterms)) {
            l.addAll(es.getAcceptances());
        }
        return l;
    }

    class FilterComparator implements Comparator<SelectItem> {
        @Override
        public int compare(SelectItem o1, SelectItem o2) {
            return o1.getDescription().compareTo(o2.getDescription());
        }
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_idcompany", nullable = false)
    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
