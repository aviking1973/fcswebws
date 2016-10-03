package com.fidelcardsys.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the fcrd_providers database table.
 * 
 */
@Entity
@Table(name="fcrd_providers")
@NamedQuery(name="FcrdProvider.findAll", query="SELECT f FROM FcrdProvider f")
public class FcrdProvider implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int idprovider;

	@Column(name="ACCOUNT_ACTIVATED")
	private int accountActivated;

	@Column(name="ACTIVATION_CODE")
	private String activationCode;

	private String address;

	private String city;

	private String country;

	@Column(name="CUPPONS_LIMIT")
	private int cupponsLimit;

	private String currency;

	@Column(name="DATE_EXP_ACTIVATIONCODE")
	private Timestamp dateExpActivationcode;

	private String description;

	@Column(name="DT_CREATE")
	private Timestamp dtCreate;

	@Column(name="DT_LAST_ATTEMPT")
	private Timestamp dtLastAttempt;

	@Column(name="DT_MODIFIED")
	private Timestamp dtModified;

	private String email;

	@Column(name="EXPIRY_PERIOD")
	private String expiryPeriod;

	private String fidelitytype;

	private String logo;

	private String name;

	@Column(name="NR_ATTEMPTS")
	private int nrAttempts;

	private String password;

	private String phone;

	private String pincode;

	private int pnotifcount;

	@Temporal(TemporalType.DATE)
	private Date pnotiftimeexp;

	@Column(name="POINTS_CURRENCY")
	private BigDecimal pointsCurrency;

	@Column(name="POINTS_LIMIT")
	private int pointsLimit;

	@Column(name="UNBLOCKING_CODE")
	private String unblockingCode;

	private String vatnr;

	//bi-directional many-to-one association to FcrdActivitiesTrace
	@OneToMany(mappedBy="fcrdProvider")
	private List<FcrdActivitiesTrace> fcrdActivitiesTraces;

	//bi-directional many-to-one association to FcrdCard
	@OneToMany(mappedBy="fcrdProvider")
	private List<FcrdCard> fcrdCards;

	//bi-directional many-to-one association to FcrdProvCalctype
	@OneToMany(mappedBy="fcrdProvider")
	private List<FcrdProvCalctype> fcrdProvCalctypes;

	//bi-directional many-to-one association to FcrdProvGroup
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="IDGRP_PROVIDER")
	private FcrdProvGroup fcrdProvGroup;

	//bi-directional many-to-one association to FcrdProvidersLocation
	@OneToMany(mappedBy="fcrdProvider")
	private List<FcrdProvidersLocation> fcrdProvidersLocations;

	//bi-directional many-to-one association to FcrdProvidersMsgpredefined
	@OneToMany(mappedBy="fcrdProvider")
	private List<FcrdProvidersMsgpredefined> fcrdProvidersMsgpredefineds;

	//bi-directional many-to-one association to FcrdToken
	@OneToMany(mappedBy="fcrdProvider")
	private List<FcrdToken> fcrdTokens;

	public FcrdProvider() {
	}

	public int getIdprovider() {
		return this.idprovider;
	}

	public void setIdprovider(int idprovider) {
		this.idprovider = idprovider;
	}

	public int getAccountActivated() {
		return this.accountActivated;
	}

	public void setAccountActivated(int accountActivated) {
		this.accountActivated = accountActivated;
	}

	public String getActivationCode() {
		return this.activationCode;
	}

	public void setActivationCode(String activationCode) {
		this.activationCode = activationCode;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getCupponsLimit() {
		return this.cupponsLimit;
	}

	public void setCupponsLimit(int cupponsLimit) {
		this.cupponsLimit = cupponsLimit;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Timestamp getDateExpActivationcode() {
		return this.dateExpActivationcode;
	}

	public void setDateExpActivationcode(Timestamp dateExpActivationcode) {
		this.dateExpActivationcode = dateExpActivationcode;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getDtCreate() {
		return this.dtCreate;
	}

	public void setDtCreate(Timestamp dtCreate) {
		this.dtCreate = dtCreate;
	}

	public Timestamp getDtLastAttempt() {
		return this.dtLastAttempt;
	}

	public void setDtLastAttempt(Timestamp dtLastAttempt) {
		this.dtLastAttempt = dtLastAttempt;
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

	public String getExpiryPeriod() {
		return this.expiryPeriod;
	}

	public void setExpiryPeriod(String expiryPeriod) {
		this.expiryPeriod = expiryPeriod;
	}

	public String getFidelitytype() {
		return this.fidelitytype;
	}

	public void setFidelitytype(String fidelitytype) {
		this.fidelitytype = fidelitytype;
	}

	public String getLogo() {
		return this.logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNrAttempts() {
		return this.nrAttempts;
	}

	public void setNrAttempts(int nrAttempts) {
		this.nrAttempts = nrAttempts;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPincode() {
		return this.pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public int getPnotifcount() {
		return this.pnotifcount;
	}

	public void setPnotifcount(int pnotifcount) {
		this.pnotifcount = pnotifcount;
	}

	public Date getPnotiftimeexp() {
		return this.pnotiftimeexp;
	}

	public void setPnotiftimeexp(Date pnotiftimeexp) {
		this.pnotiftimeexp = pnotiftimeexp;
	}

	public BigDecimal getPointsCurrency() {
		return this.pointsCurrency;
	}

	public void setPointsCurrency(BigDecimal pointsCurrency) {
		this.pointsCurrency = pointsCurrency;
	}

	public int getPointsLimit() {
		return this.pointsLimit;
	}

	public void setPointsLimit(int pointsLimit) {
		this.pointsLimit = pointsLimit;
	}

	public String getUnblockingCode() {
		return this.unblockingCode;
	}

	public void setUnblockingCode(String unblockingCode) {
		this.unblockingCode = unblockingCode;
	}

	public String getVatnr() {
		return this.vatnr;
	}

	public void setVatnr(String vatnr) {
		this.vatnr = vatnr;
	}

	public List<FcrdActivitiesTrace> getFcrdActivitiesTraces() {
		return this.fcrdActivitiesTraces;
	}

	public void setFcrdActivitiesTraces(List<FcrdActivitiesTrace> fcrdActivitiesTraces) {
		this.fcrdActivitiesTraces = fcrdActivitiesTraces;
	}

	public FcrdActivitiesTrace addFcrdActivitiesTrace(FcrdActivitiesTrace fcrdActivitiesTrace) {
		getFcrdActivitiesTraces().add(fcrdActivitiesTrace);
		fcrdActivitiesTrace.setFcrdProvider(this);

		return fcrdActivitiesTrace;
	}

	public FcrdActivitiesTrace removeFcrdActivitiesTrace(FcrdActivitiesTrace fcrdActivitiesTrace) {
		getFcrdActivitiesTraces().remove(fcrdActivitiesTrace);
		fcrdActivitiesTrace.setFcrdProvider(null);

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
		fcrdCard.setFcrdProvider(this);

		return fcrdCard;
	}

	public FcrdCard removeFcrdCard(FcrdCard fcrdCard) {
		getFcrdCards().remove(fcrdCard);
		fcrdCard.setFcrdProvider(null);

		return fcrdCard;
	}

	public List<FcrdProvCalctype> getFcrdProvCalctypes() {
		return this.fcrdProvCalctypes;
	}

	public void setFcrdProvCalctypes(List<FcrdProvCalctype> fcrdProvCalctypes) {
		this.fcrdProvCalctypes = fcrdProvCalctypes;
	}

	public FcrdProvCalctype addFcrdProvCalctype(FcrdProvCalctype fcrdProvCalctype) {
		getFcrdProvCalctypes().add(fcrdProvCalctype);
		fcrdProvCalctype.setFcrdProvider(this);

		return fcrdProvCalctype;
	}

	public FcrdProvCalctype removeFcrdProvCalctype(FcrdProvCalctype fcrdProvCalctype) {
		getFcrdProvCalctypes().remove(fcrdProvCalctype);
		fcrdProvCalctype.setFcrdProvider(null);

		return fcrdProvCalctype;
	}

	public FcrdProvGroup getFcrdProvGroup() {
		return this.fcrdProvGroup;
	}

	public void setFcrdProvGroup(FcrdProvGroup fcrdProvGroup) {
		this.fcrdProvGroup = fcrdProvGroup;
	}

	public List<FcrdProvidersLocation> getFcrdProvidersLocations() {
		return this.fcrdProvidersLocations;
	}

	public void setFcrdProvidersLocations(List<FcrdProvidersLocation> fcrdProvidersLocations) {
		this.fcrdProvidersLocations = fcrdProvidersLocations;
	}

	public FcrdProvidersLocation addFcrdProvidersLocation(FcrdProvidersLocation fcrdProvidersLocation) {
		getFcrdProvidersLocations().add(fcrdProvidersLocation);
		fcrdProvidersLocation.setFcrdProvider(this);

		return fcrdProvidersLocation;
	}

	public FcrdProvidersLocation removeFcrdProvidersLocation(FcrdProvidersLocation fcrdProvidersLocation) {
		getFcrdProvidersLocations().remove(fcrdProvidersLocation);
		fcrdProvidersLocation.setFcrdProvider(null);

		return fcrdProvidersLocation;
	}

	public List<FcrdProvidersMsgpredefined> getFcrdProvidersMsgpredefineds() {
		return this.fcrdProvidersMsgpredefineds;
	}

	public void setFcrdProvidersMsgpredefineds(List<FcrdProvidersMsgpredefined> fcrdProvidersMsgpredefineds) {
		this.fcrdProvidersMsgpredefineds = fcrdProvidersMsgpredefineds;
	}

	public FcrdProvidersMsgpredefined addFcrdProvidersMsgpredefined(FcrdProvidersMsgpredefined fcrdProvidersMsgpredefined) {
		getFcrdProvidersMsgpredefineds().add(fcrdProvidersMsgpredefined);
		fcrdProvidersMsgpredefined.setFcrdProvider(this);

		return fcrdProvidersMsgpredefined;
	}

	public FcrdProvidersMsgpredefined removeFcrdProvidersMsgpredefined(FcrdProvidersMsgpredefined fcrdProvidersMsgpredefined) {
		getFcrdProvidersMsgpredefineds().remove(fcrdProvidersMsgpredefined);
		fcrdProvidersMsgpredefined.setFcrdProvider(null);

		return fcrdProvidersMsgpredefined;
	}

	public List<FcrdToken> getFcrdTokens() {
		return this.fcrdTokens;
	}

	public void setFcrdTokens(List<FcrdToken> fcrdTokens) {
		this.fcrdTokens = fcrdTokens;
	}

	public FcrdToken addFcrdToken(FcrdToken fcrdToken) {
		getFcrdTokens().add(fcrdToken);
		fcrdToken.setFcrdProvider(this);

		return fcrdToken;
	}

	public FcrdToken removeFcrdToken(FcrdToken fcrdToken) {
		getFcrdTokens().remove(fcrdToken);
		fcrdToken.setFcrdProvider(null);

		return fcrdToken;
	}

}