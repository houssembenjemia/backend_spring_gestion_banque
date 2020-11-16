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
@Table(name="valideur")
public class Valideur {
	@Id
	@Column(name="idvalideur")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idvalideur;
	public Valideur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Valideur(Integer idvalideur, String distination, Profil profil) {
		super();
		this.idvalideur = idvalideur;
		this.distination = distination;
		this.profil = profil;
	}
	public Integer getIdvalideur() {
		return idvalideur;
	}
	public void setIdvalideur(Integer idvalideur) {
		this.idvalideur = idvalideur;
	}
	public String getDistination() {
		return distination;
	}
	public void setDistination(String distination) {
		this.distination = distination;
	}
	public Profil getProfil() {
		return profil;
	}
	public void setProfil(Profil profil) {
		this.profil = profil;
	}
	private String distination ;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "profils_id", referencedColumnName = "idprofil")
	 Profil profil;
	
}
