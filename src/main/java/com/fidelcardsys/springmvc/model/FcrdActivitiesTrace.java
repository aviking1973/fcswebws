package com.fidelcardsys.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the fcrd_activities_traces database table.
 * 
 */
@Entity
@Table(name="fcrd_activities_traces")
@NamedQuery(name="FcrdActivitiesTrace.findAll", query="SELECT f FROM FcrdActivitiesTrace f")
public class FcrdActivitiesTrace implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int idactivitytrace;

	private int cardcupons;

	private int cardnumber;

	private int cardpoints;

	@Column(name="DT_CREATE")
	private Timestamp dtCreate;

	private int fidelityused;

	@Column(name="INVOICE_AMOUNT")
	private int invoiceAmount;

	@Column(name="INVOICE_NUMBER")
	private int invoiceNumber;

	//bi-directional many-to-one association to FcrdClient
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="IDCLIENT")
	private FcrdClient fcrdClient;

	//bi-directional many-to-one association to FcrdProvider
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="IDPROVIDER")
	private FcrdProvider fcrdProvider;

	public FcrdActivitiesTrace() {
	}

	public int getIdactivitytrace() {
		return this.idactivitytrace;
	}

	public void setIdactivitytrace(int idactivitytrace) {
		this.idactivitytrace = idactivitytrace;
	}

	public int getCardcupons() {
		return this.cardcupons;
	}

	public void setCardcupons(int cardcupons) {
		this.cardcupons = cardcupons;
	}

	public int getCardnumber() {
		return this.cardnumber;
	}

	public void setCardnumber(int cardnumber) {
		this.cardnumber = cardnumber;
	}

	public int getCardpoints() {
		return this.cardpoints;
	}

	public void setCardpoints(int cardpoints) {
		this.cardpoints = cardpoints;
	}

	public Timestamp getDtCreate() {
		return this.dtCreate;
	}

	public void setDtCreate(Timestamp dtCreate) {
		this.dtCreate = dtCreate;
	}

	public int getFidelityused() {
		return this.fidelityused;
	}

	public void setFidelityused(int fidelityused) {
		this.fidelityused = fidelityused;
	}

	public int getInvoiceAmount() {
		return this.invoiceAmount;
	}

	public void setInvoiceAmount(int invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public int getInvoiceNumber() {
		return this.invoiceNumber;
	}

	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public FcrdClient getFcrdClient() {
		return this.fcrdClient;
	}

	public void setFcrdClient(FcrdClient fcrdClient) {
		this.fcrdClient = fcrdClient;
	}

	public FcrdProvider getFcrdProvider() {
		return this.fcrdProvider;
	}

	public void setFcrdProvider(FcrdProvider fcrdProvider) {
		this.fcrdProvider = fcrdProvider;
	}

}