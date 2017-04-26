package com.capgemini.talent.quizz.entities;

import java.io.Serializable;

import java.util.Set;
import javax.persistence.Entity;

import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author gennaili
 *
 */



@Entity(name="CMRH")
@Table(name="CMRH")
public class CMRH extends Utilisateur implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	@OneToMany(mappedBy = "cmrh")
    private Set<Test> tests;
    
	
	
	@ManyToMany(mappedBy ="cmrhs")
	 private Set<Role> roles;
	
	public CMRH() {
		super();
		
	}

	public CMRH(Long idUtil, String nom, String prenom, String mail, String motDpass) {
		super(idUtil, nom, prenom, mail, motDpass);
		
	}

	public CMRH(Set<Test> tests) {
		super();
		this.tests = tests;
	}

	public Set<Test> getTests() {
		return tests;
	}
     
	public void setTests(Set<Test> tests) {
		this.tests = tests;
	}

	@Override
	public String toString() {
		return "CMRH [tests=" + tests + "]";
	}
	
	
	
	  
	  
}
