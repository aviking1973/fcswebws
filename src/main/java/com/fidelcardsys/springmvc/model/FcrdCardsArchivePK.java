package com.fidelcardsys.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the fcrd_cards_archive database table.
 * 
 */
@Embeddable
public class FcrdCardsArchivePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int idclient;

	private int idprovider;

	public FcrdCardsArchivePK() {
	}
	public int getIdclient() {
		return this.idclient;
	}
	public void setIdclient(int idclient) {
		this.idclient = idclient;
	}
	public int getIdprovider() {
		return this.idprovider;
	}
	public void setIdprovider(int idprovider) {
		this.idprovider = idprovider;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FcrdCardsArchivePK)) {
			return false;
		}
		FcrdCardsArchivePK castOther = (FcrdCardsArchivePK)other;
		return 
			(this.idclient == castOther.idclient)
			&& (this.idprovider == castOther.idprovider);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idclient;
		hash = hash * prime + this.idprovider;
		
		return hash;
	}
}