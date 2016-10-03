package com.fidelcardsys.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the fcrd_barcodecards database table.
 * 
 */
@Entity
@Table(name="fcrd_barcodecards")
@NamedQuery(name="FcrdBarcodecard.findAll", query="SELECT f FROM FcrdBarcodecard f")
public class FcrdBarcodecard implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="`KEY`")
	private int key;

	private String barcodelogo;

	private String barcodenr;

	private String barcodetypes;

	private String barocdename;

	private int flg;

	@Column(name="id_client")
	private int idClient;

	public FcrdBarcodecard() {
	}

	public int getKey() {
		return this.key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public String getBarcodelogo() {
		return this.barcodelogo;
	}

	public void setBarcodelogo(String barcodelogo) {
		this.barcodelogo = barcodelogo;
	}

	public String getBarcodenr() {
		return this.barcodenr;
	}

	public void setBarcodenr(String barcodenr) {
		this.barcodenr = barcodenr;
	}

	public String getBarcodetypes() {
		return this.barcodetypes;
	}

	public void setBarcodetypes(String barcodetypes) {
		this.barcodetypes = barcodetypes;
	}

	public String getBarocdename() {
		return this.barocdename;
	}

	public void setBarocdename(String barocdename) {
		this.barocdename = barocdename;
	}

	public int getFlg() {
		return this.flg;
	}

	public void setFlg(int flg) {
		this.flg = flg;
	}

	public int getIdClient() {
		return this.idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

}