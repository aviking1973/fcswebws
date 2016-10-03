package com.fidelcardsys.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the fcrd_clients database table.
 * 
 */
@Entity
@Table(name="fcrd_clients")
@NamedQuery(name="FcrdClient.findAll", query="SELECT f FROM FcrdClient f")
public class FcrdClient implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idclient;

	private int cardnumber;

	@Column(name="DT_CREATE")
	private Timestamp dtCreate;

	@Column(name="DT_MODIFIED")
	private Timestamp dtModified;

	private String email;

	private String facebookid;

	private String firstname;

	@Lob
	@Column(name="GCM_REGID")
	private String gcmRegid;

	private String lastname;

	@Column(name="LOGIN_NAME")
	private String loginName;

	@Column(name="LOGIN_PASSWORD")
	private String loginPassword;

	private String namealias;

	//bi-directional many-to-one association to FcrdActivitiesTrace
	@OneToMany(mappedBy="fcrdClient", cascade={CascadeType.ALL})
	private List<FcrdActivitiesTrace> fcrdActivitiesTraces;

	//bi-directional many-to-one association to FcrdCard
	@OneToMany(mappedBy="fcrdClient")
	private List<FcrdCard> fcrdCards;

	public FcrdClient() {
	}

	public int getIdclient() {
		return this.idclient;
	}

	public void setIdclient(int idclient) {
		this.idclient = idclient;
	}

	public int getCardnumber() {
		return this.cardnumber;
	}

	public void setCardnumber(int cardnumber) {
		this.cardnumber = cardnumber;
	}

	public Timestamp getDtCreate() {
		return this.dtCreate;
	}

	public void setDtCreate(Timestamp dtCreate) {
		this.dtCreate = dtCreate;
	}

	public Timestamp getDtModified() {
		return this.dtModified;
	}

	public void setDtModified(Timestamp dtModified) {
		this.dtModified = dtModified;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFacebookid() {
		return this.facebookid;
	}

	public void setFacebookid(String facebookid) {
		this.facebookid = facebookid;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getGcmRegid() {
		return this.gcmRegid;
	}

	public void setGcmRegid(String gcmRegid) {
		this.gcmRegid = gcmRegid;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPassword() {
		return this.loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getNamealias() {
		return this.namealias;
	}

	public void setNamealias(String namealias) {
		this.namealias = namealias;
	}

	public List<FcrdActivitiesTrace> getFcrdActivitiesTraces() {
		return this.fcrdActivitiesTraces;
	}

	public void setFcrdActivitiesTraces(List<FcrdActivitiesTrace> fcrdActivitiesTraces) {
		this.fcrdActivitiesTraces = fcrdActivitiesTraces;
	}

	public FcrdActivitiesTrace addFcrdActivitiesTrace(FcrdActivitiesTrace fcrdActivitiesTrace) {
		getFcrdActivitiesTraces().add(fcrdActivitiesTrace);
		fcrdActivitiesTrace.setFcrdClient(this);

		return fcrdActivitiesTrace;
	}

	public FcrdActivitiesTrace removeFcrdActivitiesTrace(FcrdActivitiesTrace fcrdActivitiesTrace) {
		getFcrdActivitiesTraces().remove(fcrdActivitiesTrace);
		fcrdActivitiesTrace.setFcrdClient(null);

		return fcrdActivitiesTrace;
	}

	public List<FcrdCard> getFcrdCards() {
		return this.fcrdCards;
	}

	public void setFcrdCards(List<FcrdCard> fcrdCards) {
		this.fcrdCards = fcrdCards;
	}

	public FcrdCard addFcrdCard(FcrdCard fcrdCard) {
		getFcrdCards().add(fcrdCard);
		fcrdCard.setFcrdClient(this);

		return fcrdCard;
	}

	public FcrdCard removeFcrdCard(FcrdCard fcrdCard) {
		getFcrdCards().remove(fcrdCard);
		fcrdCard.setFcrdClient(null);

		return fcrdCard;
	}

}