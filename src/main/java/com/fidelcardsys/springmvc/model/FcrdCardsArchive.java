package com.fidelcardsys.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the fcrd_cards_archive database table.
 * 
 */
@Entity
@Table(name="fcrd_cards_archive")
@NamedQuery(name="FcrdCardsArchive.findAll", query="SELECT f FROM FcrdCardsArchive f")
public class FcrdCardsArchive implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FcrdCardsArchivePK id;

	private int cardcupons;

	private int cardnumber;

	private int cardpoints;

	private int cardtype;

	private String classimg;

	@Column(name="DT_CREATE")
	private Timestamp dtCreate;

	@Column(name="DT_EXPIRY")
	private Timestamp dtExpiry;

	@Column(name="DT_LAST_UPDATE")
	private Timestamp dtLastUpdate;

	private int fidelityused;

	@Column(name="FLG_CONF_PROVIDER")
	private int flgConfProvider;

	private String token;

	public FcrdCardsArchive() {
	}

	public FcrdCardsArchivePK getId() {
		return this.id;
	}

	public void setId(FcrdCardsArchivePK id) {
		this.id = id;
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

	public int getCardtype() {
		return this.cardtype;
	}

	public void setCardtype(int cardtype) {
		this.cardtype = cardtype;
	}

	public String getClassimg() {
		return this.classimg;
	}

	public void setClassimg(String classimg) {
		this.classimg = classimg;
	}

	public Timestamp getDtCreate() {
		return this.dtCreate;
	}

	public void setDtCreate(Timestamp dtCreate) {
		this.dtCreate = dtCreate;
	}

	public Timestamp getDtExpiry() {
		return this.dtExpiry;
	}

	public void setDtExpiry(Timestamp dtExpiry) {
		this.dtExpiry = dtExpiry;
	}

	public Timestamp getDtLastUpdate() {
		return this.dtLastUpdate;
	}

	public void setDtLastUpdate(Timestamp dtLastUpdate) {
		this.dtLastUpdate = dtLastUpdate;
	}

	public int getFidelityused() {
		return this.fidelityused;
	}

	public void setFidelityused(int fidelityused) {
		this.fidelityused = fidelityused;
	}

	public int getFlgConfProvider() {
		return this.flgConfProvider;
	}

	public void setFlgConfProvider(int flgConfProvider) {
		this.flgConfProvider = flgConfProvider;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}