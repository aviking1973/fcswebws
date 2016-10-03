package com.fidelcardsys.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the fcrd_providers_locations database table.
 * 
 */
@Entity
@Table(name="fcrd_providers_locations")
@NamedQuery(name="FcrdProvidersLocation.findAll", query="SELECT f FROM FcrdProvidersLocation f")
public class FcrdProvidersLocation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int idproviderloc;

	@Column(name="DT_CREATE")
	private Timestamp dtCreate;

	@Column(name="DT_MODIFY")
	private Timestamp dtModify;

	@Column(name="LOCATION_X")
	private String locationX;

	@Column(name="LOCATION_Y")
	private String locationY;

	//bi-directional many-to-one association to FcrdProvider
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="IDPROVIDER")
	private FcrdProvider fcrdProvider;

	public FcrdProvidersLocation() {
	}

	public int getIdproviderloc() {
		return this.idproviderloc;
	}

	public void setIdproviderloc(int idproviderloc) {
		this.idproviderloc = idproviderloc;
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

	public String getLocationX() {
		return this.locationX;
	}

	public void setLocationX(String locationX) {
		this.locationX = locationX;
	}

	public String getLocationY() {
		return this.locationY;
	}

	public void setLocationY(String locationY) {
		this.locationY = locationY;
	}

	public FcrdProvider getFcrdProvider() {
		return this.fcrdProvider;
	}

	public void setFcrdProvider(FcrdProvider fcrdProvider) {
		this.fcrdProvider = fcrdProvider;
	}

}