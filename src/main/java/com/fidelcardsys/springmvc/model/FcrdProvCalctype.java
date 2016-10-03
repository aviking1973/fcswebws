package com.fidelcardsys.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the fcrd_prov_calctype database table.
 * 
 */
@Entity
@Table(name="fcrd_prov_calctype")
@NamedQuery(name="FcrdProvCalctype.findAll", query="SELECT f FROM FcrdProvCalctype f")
public class FcrdProvCalctype implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FcrdProvCalctypePK id;

	@Column(name="CUPONS_COUNTER")
	private int cuponsCounter;

	//bi-directional many-to-one association to FcrdCalcType
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="IDCALCTYPE")
	private FcrdCalcType fcrdCalcType;

	//bi-directional many-to-one association to FcrdProvider
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="IDPROVIDER")
	private FcrdProvider fcrdProvider;

	public FcrdProvCalctype() {
	}

	public FcrdProvCalctypePK getId() {
		return this.id;
	}

	public void setId(FcrdProvCalctypePK id) {
		this.id = id;
	}

	public int getCuponsCounter() {
		return this.cuponsCounter;
	}

	public void setCuponsCounter(int cuponsCounter) {
		this.cuponsCounter = cuponsCounter;
	}

	public FcrdCalcType getFcrdCalcType() {
		return this.fcrdCalcType;
	}

	public void setFcrdCalcType(FcrdCalcType fcrdCalcType) {
		this.fcrdCalcType = fcrdCalcType;
	}

	public FcrdProvider getFcrdProvider() {
		return this.fcrdProvider;
	}

	public void setFcrdProvider(FcrdProvider fcrdProvider) {
		this.fcrdProvider = fcrdProvider;
	}

}