package com.gcom.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "acceptance")
public class Acceptance implements Serializable {

	private Integer idacceptance;
	private Paymentterm paymentterm;
	private Date dateAcceptance;
	private String numero;
	private String linkGed;
	private String status;
	private Date dateInvoice;
	private String idInvoice;
	private String typeInvoice;
	private String type;
	private String invoiceStatus;
	private Date duedateInvoice;
	private Set<Acceptancedetails> acceptancedetailses = new HashSet<Acceptancedetails>(0);
	private Set<Payment> payments = new HashSet<Payment>(0);
	private Double vat;
	private String commentAcceptance;
	private String commentInvoice;
	private Double wht;
	private String whtr;
	private Date approveInvoiceDate;
	private Date createInvoiceDate;
	private Date payInvoiceDate;


	public Acceptance() {
	}

	public Acceptance(Paymentterm paymentterm) {
		this.paymentterm = paymentterm;
	}

	 public Acceptance(Date createInvoiceDate, Date payInvoiceDate, Date approveInvoiceDate, Paymentterm paymentterm, Date dateAcceptance, String numero, String linkGed, String status, Date dateInvoice, Date duedateInvoice, String idInvoice, String typeInvoice, String type, String invoiceStatus, Set acceptancedetailses, Set payments ,Double vat) {
	        this.paymentterm = paymentterm;
	        this.dateAcceptance = dateAcceptance;
	        this.numero = numero;
	        this.linkGed = linkGed;
	        this.status = status;
	        this.dateInvoice = dateInvoice;
	        this.duedateInvoice = duedateInvoice;
	        this.idInvoice = idInvoice;
	        this.typeInvoice = typeInvoice;
	        this.type = type;
	        this.invoiceStatus = invoiceStatus;
	        this.acceptancedetailses = acceptancedetailses;
	        this.payments = payments;
	        this.vat = vat;
	        this.createInvoiceDate = createInvoiceDate;
	        this.payInvoiceDate = payInvoiceDate;
	    }

	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idacceptance", unique = true, nullable = false)
	public Integer getIdacceptance() {
		return this.idacceptance;
	}

	public void setIdacceptance(Integer idacceptance) {
		this.idacceptance = idacceptance;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "paymentterm_idpaymentterm", nullable = false)
	public Paymentterm getPaymentterm() {
		return this.paymentterm;
	}

	public void setPaymentterm(Paymentterm paymentterm) {
		this.paymentterm = paymentterm;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dateAcceptance", length = 10)
	public Date getDateAcceptance() {
		return this.dateAcceptance;
	}

	public void setDateAcceptance(Date dateAcceptance) {
		this.dateAcceptance = dateAcceptance;
	}

	@Column(name = "numero", length = 45)
	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
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

	@Temporal(TemporalType.DATE)
	@Column(name = "dateInvoice", length = 10)
	public Date getDateInvoice() {
		return this.dateInvoice;
	}

	public void setDateInvoice(Date dateInvoice) {
		this.dateInvoice = dateInvoice;
	}

	@Column(name = "idInvoice", length = 45)
	public String getIdInvoice() {
		return this.idInvoice;
	}

	public void setIdInvoice(String idInvoice) {
		this.idInvoice = idInvoice;
	}

	@Column(name = "typeInvoice", length = 45)
	public String getTypeInvoice() {
		return this.typeInvoice;
	}

	public void setTypeInvoice(String typeInvoice) {
		this.typeInvoice = typeInvoice;
	}

	@Column(name = "type", length = 200)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "invoiceStatus", length = 45)
	public String getInvoiceStatus() {
		return this.invoiceStatus;
	}

	public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "duedateInvoice", length = 10)
	public Date getDuedateInvoice() {
		return this.duedateInvoice;
	}

	public void setDuedateInvoice(Date duedateInvoice) {
		this.duedateInvoice = duedateInvoice;
	}

	@Column(name = "vat", precision = 22, scale = 0)
	public Double getVat() {
		return this.vat;
	}

	public void setVat(Double vat) {
		this.vat = vat;
	}

	@OneToMany(cascade = { javax.persistence.CascadeType.ALL },  fetch = FetchType.EAGER, mappedBy = "acceptance")
	public Set<Acceptancedetails> getAcceptancedetailses() {
		return this.acceptancedetailses;
	}

	public void setAcceptancedetailses(
			Set<Acceptancedetails> acceptancedetailses) {
		this.acceptancedetailses = acceptancedetailses;
	}

	@OneToMany(cascade = { javax.persistence.CascadeType.ALL }, fetch = FetchType.LAZY, mappedBy = "acceptance")
	public Set<Payment> getPayments() {
		return this.payments;
	}

	public void setPayments(Set<Payment> payments) {
		this.payments = payments;
	}

	
	@Column(name = "commentAcceptance", length = 9999)
	public String getCommentAcceptance() {
		return commentAcceptance;
	}

	public void setCommentAcceptance(String commentAcceptance) {
		this.commentAcceptance = commentAcceptance;
	}
    
	@Column(name = "commentInvoice", length = 9999)
	public String getCommentInvoice() {
		return commentInvoice;
	}

	public void setCommentInvoice(String commentInvoice) {
		this.commentInvoice = commentInvoice;
	}
    
	@Column(name = "wht", precision = 22, scale = 0)
	public Double getWht() {
		return wht;
	}

	public void setWht(Double wht) {
		this.wht = wht;
	}
    
	@Column(name = "whtr", length = 9999)
	public String getWhtr() {
		return whtr;
	}

	public void setWhtr(String whtr) {
		this.whtr = whtr;
	}
    
	@Temporal(TemporalType.DATE)
	@Column(name = "approveInvoiceDate", length = 10)
	public Date getApproveInvoiceDate() {
		return approveInvoiceDate;
	}

	public void setApproveInvoiceDate(Date approveInvoiceDate) {
		this.approveInvoiceDate = approveInvoiceDate;
	}
    
	@Temporal(TemporalType.DATE)
	@Column(name = "createInvoiceDate", length = 10)
	public Date getCreateInvoiceDate() {
		return createInvoiceDate;
	}

	public void setCreateInvoiceDate(Date createInvoiceDate) {
		this.createInvoiceDate = createInvoiceDate;
	}
    
	@Temporal(TemporalType.DATE)
	@Column(name = "payInvoiceDate", length = 10)
	public Date getPayInvoiceDate() {
		return payInvoiceDate;
	}

	public void setPayInvoiceDate(Date payInvoiceDate) {
		this.payInvoiceDate = payInvoiceDate;
	}
	
	public Double loadTotalPrice() {
        List<Acceptancedetails> details = new ArrayList<Acceptancedetails>(acceptancedetailses);
        Double totalPrice = 0.0;
        for (Acceptancedetails ad : details) {
          
          totalPrice =  BigDecimal.valueOf(totalPrice).add(BigDecimal.valueOf(ad.getTotalPriceAccepted())).doubleValue();
        }
        return totalPrice;
    }
  
	
	public Double loadTotalPriceTTC() {
       
    Double ht = 0.0;
         Double x = 1.0;
        ht = loadTotalPrice();

        Double tax = BigDecimal.valueOf(ht).multiply(BigDecimal.valueOf(vat)).doubleValue();
        Double tax1 = BigDecimal.valueOf(ht).add(BigDecimal.valueOf(tax)).doubleValue();
        Double tax2;
         if (wht == null || (whtr!=null && whtr.equalsIgnoreCase("yes"))) {
        wht =0.0;
       }
       
       
        tax2 = 1-wht;
        return BigDecimal.valueOf(tax1).multiply(BigDecimal.valueOf(tax2)).doubleValue();
       
                
    }
    
        public Double loadRemainder() {
        Double total = loadTotalPriceTTC();
        Double paid = 0.0;
        List<Payment> ps = new ArrayList<Payment>(payments);
        for (Payment p : ps) {
            paid += p.getAmount();
        }
        Double remainder = total - paid;
        return remainder;
    }
        
        public List<Payment> loadPaymentsList(){
            return new ArrayList<Payment>(payments);
        }


}
