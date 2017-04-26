package com.capgemini.talent.quizz.entities;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.MappedSuperclass;


/**
 * 
 * @author gennaili
 *
 */

@MappedSuperclass
public class Utilisateur implements Serializable {
	  private static final long serialVersionUID = 1L;
	  @Id
	  @GeneratedValue
	  @Column
      private Long idUtil;
	  @Column(name="NOM")
      private String nom;
	  @Column(name="PRENOM")
      private String prenom;
	  @Column(name="MAIL")
      private String mail;
	  @Column(name="MOT_DE_PASSE")
      private String motDpass;
	  @Column(name="ARCHIVE")
	  private boolean archive=false;
	  
	  
	    
	public Utilisateur() {
		super();
		
	}

	public Utilisateur(Long idUtil, String nom, String prenom, String mail, String motDpass) {
		super();
		this.idUtil = idUtil;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.motDpass = motDpass;
	}

	public Long getIdUtil() {
		return idUtil;
	}

	public void setIdUtil(Long idUtil) {
		this.idUtil = idUtil;
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMotDpass() {
		return motDpass;
	}

	public void setMotDpass(String motDpass) {
		this.motDpass = motDpass;
	}

	@Override
	public String toString() {
		return "Utilisateur [idUtil=" + idUtil + ", nom=" + nom + ", prenom=" + prenom + ", mail=" + mail
				+ ", motDpass=" + motDpass + "]";
	}
      
	
      
}
