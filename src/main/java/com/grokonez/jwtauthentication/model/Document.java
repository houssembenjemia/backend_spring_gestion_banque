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
@Table(name="document")
public class Document {
	@Id
	@Column(name="iddocument")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer iddocument;
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Document(Integer iddocument, String nomdocument, String reference, Set<Domaine> domaine) {
		super();
		this.iddocument = iddocument;
		this.nomdocument = nomdocument;
		this.reference = reference;
		this.domaine = domaine;
	}
	public Integer getIddocument() {
		return iddocument;
	}
	public void setIddocument(Integer iddocument) {
		this.iddocument = iddocument;
	}
	public String getNomdocument() {
		return nomdocument;
	}
	public void setNomdocument(String nomdocument) {
		this.nomdocument = nomdocument;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public Set<Domaine> getDomaine() {
		return domaine;
	}
	public void setDomaine(Set<Domaine> domaine) {
		this.domaine = domaine;
	}
	private String nomdocument ;
	private String reference ;
	@OneToMany(mappedBy = "document")
	@JsonIgnore
    Set<Domaine> domaine;
	

}
