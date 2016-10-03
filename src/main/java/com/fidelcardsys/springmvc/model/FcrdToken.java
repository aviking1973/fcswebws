package com.fidelcardsys.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the fcrd_tokens database table.
 * 
 */
@Entity
@Table(name="fcrd_tokens")
@NamedQuery(name="FcrdToken.findAll", query="SELECT f FROM FcrdToken f")
public class FcrdToken implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;

	private String deviceid;

	@Column(name="DT_CREATE")
	private Timestamp dtCreate;

	//bi-directional many-to-one association to FcrdProvider
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="IDPROVIDER")
	private FcrdProvider fcrdProvider;

	public FcrdToken() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeviceid() {
		return this.deviceid;
	}

	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}

	public Timestamp getDtCreate() {
		return this.dtCreate;
	}

	public void setDtCreate(Timestamp dtCreate) {
		this.dtCreate = dtCreate;
	}

	public FcrdProvider getFcrdProvider() {
		return this.fcrdProvider;
	}

	public void setFcrdProvider(FcrdProvider fcrdProvider) {
		this.fcrdProvider = fcrdProvider;
	}

}