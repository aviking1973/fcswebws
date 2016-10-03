package com.fidelcardsys.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the fcrd_prov_calctype database table.
 * 
 */
@Embeddable
public class FcrdProvCalctypePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int idprovider;

	@Column(insertable=false, updatable=false)
	private int idcalctype;

	public FcrdProvCalctypePK() {
	}
	public int getIdprovider() {
		return this.idprovider;
	}
	public void setIdprovider(int idprovider) {
		this.idprovider = idprovider;
	}
	public int getIdcalctype() {
		return this.idcalctype;
	}
	public void setIdcalctype(int idcalctype) {
		this.idcalctype = idcalctype;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FcrdProvCalctypePK)) {
			return false;
		}
		FcrdProvCalctypePK castOther = (FcrdProvCalctypePK)other;
		return 
			(this.idprovider == castOther.idprovider)
			&& (this.idcalctype == castOther.idcalctype);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idprovider;
		hash = hash * prime + this.idcalctype;
		
		return hash;
	}
}