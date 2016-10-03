package com.fidelcardsys.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the fcrd_providers_msgpredefined database table.
 * 
 */
@Entity
@Table(name="fcrd_providers_msgpredefined")
@NamedQuery(name="FcrdProvidersMsgpredefined.findAll", query="SELECT f FROM FcrdProvidersMsgpredefined f")
public class FcrdProvidersMsgpredefined implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int idprovpremsg;

	@Column(name="DT_CREATE")
	private Timestamp dtCreate;

	@Column(name="DT_MODIFY")
	private Timestamp dtModify;

	private String message;

	private String title;

	//bi-directional many-to-one association to FcrdProvider
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="IDPROVIDER")
	private FcrdProvider fcrdProvider;

	public FcrdProvidersMsgpredefined() {
	}

	public int getIdprovpremsg() {
		return this.idprovpremsg;
	}

	public void setIdprovpremsg(int idprovpremsg) {
		this.idprovpremsg = idprovpremsg;
	}

	public Timestamp getDtCreate() {
		return this.dtCreate;
	}

	public void setDtCreate(Timestamp dtCreate) {
		this.dtCreate = dtCreate;
	}

	public Timestamp getDtModify() {
		return this.dtModify;
	}

	public void setDtModify(Timestamp dtModify) {
		this.dtModify = dtModify;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public FcrdProvider getFcrdProvider() {
		return this.fcrdProvider;
	}

	public void setFcrdProvider(FcrdProvider fcrdProvider) {
		this.fcrdProvider = fcrdProvider;
	}

}