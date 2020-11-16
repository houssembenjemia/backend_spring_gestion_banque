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
@Table(name="checklist")
public class Checklist {
	@Id
	@Column(name="idchecklist")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long  idchecklist;
	public Checklist() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Checklist(Long idchecklist, String libelle, String critere, String cas_de_figure, String document_exiges,
			String autres_documents, com.grokonez.jwtauthentication.model.Profil profil) {
		super();
		this.idchecklist = idchecklist;
		this.libelle = libelle;
		this.critere = critere;
		this.cas_de_figure = cas_de_figure;
		this.document_exiges = document_exiges;
		this.autres_documents = autres_documents;
		Profil = profil;
	}
	public Long getIdchecklist() {
		return idchecklist;
	}
	public void setIdchecklist(Long idchecklist) {
		this.idchecklist = idchecklist;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getCritere() {
		return critere;
	}
	public void setCritere(String critere) {
		this.critere = critere;
	}
	public String getCas_de_figure() {
		return cas_de_figure;
	}
	public void setCas_de_figure(String cas_de_figure) {
		this.cas_de_figure = cas_de_figure;
	}
	public String getDocument_exiges() {
		return document_exiges;
	}
	public void setDocument_exiges(String document_exiges) {
		this.document_exiges = document_exiges;
	}
	public String getAutres_documents() {
		return autres_documents;
	}
	public void setAutres_documents(String autres_documents) {
		this.autres_documents = autres_documents;
	}
	public Profil getProfil() {
		return Profil;
	}
	public void setProfil(Profil profil) {
		Profil = profil;
	}
	private String libelle ; 
	private String critere ; 
	private String cas_de_figure;
	private String document_exiges;
	private String autres_documents;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "profil_id", referencedColumnName = "idprofil")
	 Profil Profil;
}
