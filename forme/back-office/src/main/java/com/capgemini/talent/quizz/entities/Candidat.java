package com.capgemini.talent.quizz.entities;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * 
 * @author gennaili
 *
 */

@Entity(name="Candidat")
@Table(name="Candidat")

public class Candidat extends Utilisateur implements Serializable{
	private static final long serialVersionUID = 1L;
	
	 @ManyToMany
	 @JoinTable(name= "Niveau_Candidat",joinColumns={@JoinColumn(name="idUtil")},inverseJoinColumns={@JoinColumn(name="idSujet")})
	 private Set<Sujet> sujets;
	 
	 @ManyToMany(mappedBy = "candidats")
	 private Set<Test> tests;
	 
	 @ManyToMany(mappedBy ="candidats")
	 private Set<Role> roles;
	 
	 
}
