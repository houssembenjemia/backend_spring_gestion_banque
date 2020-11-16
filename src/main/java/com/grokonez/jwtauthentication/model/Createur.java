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
@Table(name="createur")
public class Createur {
	@Id
	@Column(name="idcreateur")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idcreateur;
	public Createur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Createur(Integer idcreateur, Profil profil) {
		super();
		this.idcreateur = idcreateur;
		this.profil = profil;
	}
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "profilss_id", referencedColumnName = "idprofil")
	 Profil profil;
	public Integer getIdcreateur() {
		return idcreateur;
	}
	public void setIdcreateur(Integer idcreateur) {
		this.idcreateur = idcreateur;
	}
	public Profil getProfil() {
		return profil;
	}
	public void setProfil(Profil profil) {
		this.profil = profil;
	}

	
	
	
}
