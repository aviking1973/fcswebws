package com.fidelcardsys.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the fcrd_prov_groups database table.
 * 
 */
@Entity
@Table(name="fcrd_prov_groups")
@NamedQuery(name="FcrdProvGroup.findAll", query="SELECT f FROM FcrdProvGroup f")
public class FcrdProvGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="IDGRP_PROVIDER")
	private int idgrpProvider;

	private String description;

	@Column(name="DT_CREATE")
	private Timestamp dtCreate;

	@Column(name="DT_MODIFIED")
	private Timestamp dtModified;

	private String title;

	//bi-directional many-to-one association to FcrdProvider
	@OneToMany(mappedBy="fcrdProvGroup")
	private List<FcrdProvider> fcrdProviders;

	public FcrdProvGroup() {
	}

	public int getIdgrpProvider() {
		return this.idgrpProvider;
	}

	public void setIdgrpProvider(int idgrpProvider) {
		this.idgrpProvider = idgrpProvider;
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

	public Timestamp getDtModified() {
		return this.dtModified;
	}

	public void setDtModified(Timestamp dtModified) {
		this.dtModified = dtModified;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<FcrdProvider> getFcrdProviders() {
		return this.fcrdProviders;
	}

	public void setFcrdProviders(List<FcrdProvider> fcrdProviders) {
		this.fcrdProviders = fcrdProviders;
	}

	public FcrdProvider addFcrdProvider(FcrdProvider fcrdProvider) {
		getFcrdProviders().add(fcrdProvider);
		fcrdProvider.setFcrdProvGroup(this);

		return fcrdProvider;
	}

	public FcrdProvider removeFcrdProvider(FcrdProvider fcrdProvider) {
		getFcrdProviders().remove(fcrdProvider);
		fcrdProvider.setFcrdProvGroup(null);

		return fcrdProvider;
	}

}