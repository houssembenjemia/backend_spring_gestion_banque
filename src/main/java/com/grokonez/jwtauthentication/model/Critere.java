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
@Table(name="critere")
public class Critere {

	@Id
	@Column(name="idcritere")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idcritere;
	public Integer getIdcritere() {
		return idcritere;
	}
	public Critere() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setIdcritere(Integer idcritere) {
		this.idcritere = idcritere;
	}
	public Critere(Integer idcritere, String nomcritere, String cas_figure, Checklist checklist) {
		super();
		this.idcritere = idcritere;
		this.nomcritere = nomcritere;
		this.cas_figure = cas_figure;
		this.checklist = checklist;
	}
	public String getNomcritere() {
		return nomcritere;
	}
	public void setNomcritere(String nomcritere) {
		this.nomcritere = nomcritere;
	}
	public String getCas_figure() {
		return cas_figure;
	}
	public void setCas_figure(String cas_figure) {
		this.cas_figure = cas_figure;
	}
	public Checklist getChecklist() {
		return checklist;
	}
	public void setChecklist(Checklist checklist) {
		this.checklist = checklist;
	}
	private String nomcritere ;
	private String cas_figure ;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "checklist_id", referencedColumnName = "idchecklist")
	 Checklist checklist;
}
