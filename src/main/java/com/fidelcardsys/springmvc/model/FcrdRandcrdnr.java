package com.fidelcardsys.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the fcrd_randcrdnr database table.
 * 
 */
@Entity
@Table(name="fcrd_randcrdnr")
@NamedQuery(name="FcrdRandcrdnr.findAll", query="SELECT f FROM FcrdRandcrdnr f")
public class FcrdRandcrdnr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int cardnumber;

	@Column(name="DT_CREATE")
	private Timestamp dtCreate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_UPDATE")
	private Date dtUpdate;

	@Column(name="FLG_CRDNRISSUED")
	private int flgCrdnrissued;

	public FcrdRandcrdnr() {
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

	public Date getDtUpdate() {
		return this.dtUpdate;
	}

	public void setDtUpdate(Date dtUpdate) {
		this.dtUpdate = dtUpdate;
	}

	public int getFlgCrdnrissued() {
		return this.flgCrdnrissued;
	}

	public void setFlgCrdnrissued(int flgCrdnrissued) {
		this.flgCrdnrissued = flgCrdnrissued;
	}

}