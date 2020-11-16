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
@Table(name="admin")
public class Admin {
	@Id
	@Column(name="idadmin")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idadmin;
	
	public Integer getIdadmin() {
		return idadmin;
	}
	public void setIdadmin(Integer idadmin) {
		this.idadmin = idadmin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	private String nom;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "profil_id", referencedColumnName = "idprofil")
	 Profil profil;

	public Profil getProfil() {
		return profil;
	}
	public void setProfil(Profil profil) {
		this.profil = profil;
	}
	@Override
	public String toString() {
		return "Admin [idadmin=" + idadmin + ", nom=" + nom + ", profil=" + profil + "]";
	}
	
}
