package com.fidelcardsys.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the fcrd_barcodecards_archive database table.
 * 
 */
@Entity
@Table(name="fcrd_barcodecards_archive")
@NamedQuery(name="FcrdBarcodecardsArchive.findAll", query="SELECT f FROM FcrdBarcodecardsArchive f")
public class FcrdBarcodecardsArchive implements Serializable {
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

	public FcrdBarcodecardsArchive() {
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