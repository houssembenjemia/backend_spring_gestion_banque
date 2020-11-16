package com.grokonez.jwtauthentication.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="domaine")
public class Domaine {
	@Id
	@Column(name="iddomaine")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer iddomaine;
	public Domaine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Domaine(Integer iddomaine, String nomdomaine, Document document) {
		super();
		this.iddomaine = iddomaine;
		this.nomdomaine = nomdomaine;
		this.document = document;
	}
	public Integer getIddomaine() {
		return iddomaine;
	}
	public void setIddomaine(Integer iddomaine) {
		this.iddomaine = iddomaine;
	}
	public String getNomdomaine() {
		return nomdomaine;
	}
	public void setNomdomaine(String nomdomaine) {
		this.nomdomaine = nomdomaine;
	}
	public Document getDocument() {
		return document;
	}
	public void setDocument(Document document) {
		this.document = document;
	}
	private String nomdomaine ;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "document_id", referencedColumnName = "iddocument")
	 Document document;

}
