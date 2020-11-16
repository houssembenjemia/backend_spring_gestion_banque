package com.grokonez.jwtauthentication.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="profil")
public class Profil {
	@Id
	@Column(name="idprofil")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idprofil;
    private String nom ;
	private String prenom ;
	private String unite ;
	private String fonction ;
	private String mdp ;
	private String role ;
	private String login ;
	@OneToMany(mappedBy = "profil")
	@JsonIgnore
    Set<Admin> admins;
	
	@OneToMany(mappedBy = "profil")
	@JsonIgnore
    Set<Valideur> valideurs;

	public Integer getIdprofil() {
		return idprofil;
	}

	public void setIdprofil(Integer idprofil) {
		this.idprofil = idprofil;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getUnite() {
		return unite;
	}

	public void setUnite(String unite) {
		this.unite = unite;
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Set<Admin> getAdmins() {
		return admins;
	}

	public void setAdmins(Set<Admin> admins) {
		this.admins = admins;
	}

	public Set<Valideur> getValideurs() {
		return valideurs;
	}

	public void setValideurs(Set<Valideur> valideurs) {
		this.valideurs = valideurs;
	}

	public Profil(Integer idprofil, String nom, String prenom, String unite, String fonction, String mdp, String role,
			String login, Set<Admin> admins, Set<Valideur> valideurs) {
		super();
		this.idprofil = idprofil;
		this.nom = nom;
		this.prenom = prenom;
		this.unite = unite;
		this.fonction = fonction;
		this.mdp = mdp;
		this.role = role;
		this.login = login;
		this.admins = admins;
		this.valideurs = valideurs;
	}

	public Profil() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	



}
