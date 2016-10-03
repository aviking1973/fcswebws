package com.fidelcardsys.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the fcrd_calc_type database table.
 * 
 */
@Entity
@Table(name="fcrd_calc_type")
@NamedQuery(name="FcrdCalcType.findAll", query="SELECT f FROM FcrdCalcType f")
public class FcrdCalcType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int idcalctype;

	private String classimg;

	private String description;

	@Column(name="DT_CREATE")
	private Timestamp dtCreate;

	@Column(name="DT_MODIFIED")
	private Timestamp dtModified;

	private String title;

	//bi-directional many-to-one association to FcrdProvCalctype
	@OneToMany(mappedBy="fcrdCalcType")
	private List<FcrdProvCalctype> fcrdProvCalctypes;

	public FcrdCalcType() {
	}

	public int getIdcalctype() {
		return this.idcalctype;
	}

	public void setIdcalctype(int idcalctype) {
		this.idcalctype = idcalctype;
	}

	public String getClassimg() {
		return this.classimg;
	}

	public void setClassimg(String classimg) {
		this.classimg = classimg;
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

	public List<FcrdProvCalctype> getFcrdProvCalctypes() {
		return this.fcrdProvCalctypes;
	}

	public void setFcrdProvCalctypes(List<FcrdProvCalctype> fcrdProvCalctypes) {
		this.fcrdProvCalctypes = fcrdProvCalctypes;
	}

	public FcrdProvCalctype addFcrdProvCalctype(FcrdProvCalctype fcrdProvCalctype) {
		getFcrdProvCalctypes().add(fcrdProvCalctype);
		fcrdProvCalctype.setFcrdCalcType(this);

		return fcrdProvCalctype;
	}

	public FcrdProvCalctype removeFcrdProvCalctype(FcrdProvCalctype fcrdProvCalctype) {
		getFcrdProvCalctypes().remove(fcrdProvCalctype);
		fcrdProvCalctype.setFcrdCalcType(null);

		return fcrdProvCalctype;
	}

}