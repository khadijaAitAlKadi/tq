package com.capgemini.talent.quizz.entities;

import java.io.Serializable;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
/**
 * 
 * @author gennaili
 *
 */
@Entity(name="Role")
@Table(name="Role")
public class Role implements Serializable{
	
	private static final long serialVersionUID = 1L;
	 @Id
	 @GeneratedValue
	 @Column(name="ID_ROLE")
     private Long idRole;
	 @Column(name="NOM_ROLE")
     private String nom_Role;
	 @Column(name="DESCRIPTION")
     private String description;
	 
     @ManyToMany
     @JoinTable(name= "Role_Candidat",joinColumns={@JoinColumn(name="idRole")},inverseJoinColumns={@JoinColumn(name="idUtil")})
	 private Set<Candidat> candidats;
     
     
     
     @ManyToMany
     @JoinTable(name= "Role_CMRH",joinColumns={@JoinColumn(name="idRole")},inverseJoinColumns={@JoinColumn(name="idUtil")})
 	 private Set<CMRH> cmrhs;
  
}
