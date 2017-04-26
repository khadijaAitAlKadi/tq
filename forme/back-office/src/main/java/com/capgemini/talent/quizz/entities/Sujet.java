package com.capgemini.talent.quizz.entities;


import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/**
 * 
 * @author gennaili
 *
 */

@Entity
@Table(name="Sujet")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Sujet implements Serializable {

	private static final long serialVersionUID = 1L;
    
	@Id
	@GeneratedValue
	@Column(name="ID_SUJET")
    private Long idSujet;
	
	@Column(name="NOM_SUJET")
	private String nomSujet;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@OneToMany(mappedBy ="sujet")
    private Set<Test> tests;
	
    @ManyToMany(mappedBy="sujets")
    private Set<Candidat> candidats;
    
    @OneToMany(mappedBy = "sujet")
	private Set<Question> questions;
    
    
    public Sujet() {
		// Auto-generated constructor stub
	}

	public Sujet(Long idSujet, String nomSujet, String description, Set<Test> tests, Set<Candidat> candidats) {
		super();
		this.idSujet = idSujet;
		this.nomSujet = nomSujet;
		this.description = description;
		this.tests = tests;
		this.candidats = candidats;
	}

	public Long getIdSujet() {
		return idSujet;
	}

	public void setIdSujet(Long idSujet) {
		this.idSujet = idSujet;
	}

	public String getNomSujet() {
		return nomSujet;
	}

	public void setNomSujet(String nomSujet) {
		this.nomSujet = nomSujet;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Test> getTests() {
		return tests;
	}

	public void setTests(Set<Test> tests) {
		this.tests = tests;
	}

	public Set<Candidat> getCandidats() {
		return candidats;
	}

	public void setCandidats(Set<Candidat> candidats) {
		this.candidats = candidats;
	}

	@Override
	public String toString() {
		return "Sujet [idSujet=" + idSujet + ", nomSujet=" + nomSujet + ", description=" + description + ", tests="
				+ tests + ", candidats=" + candidats + "]";
	}
    
	
}
