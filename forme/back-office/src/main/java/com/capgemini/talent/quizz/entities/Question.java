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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * 
 * @author kaitalka
 *
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Question implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name="ID_QUESTION")
	private Long  idQuestion;
	
	@NotEmpty
	private String enonce;
	
	
	
	
	@OneToMany( mappedBy="question")
	private Set<Choix> choix;
	
	
	@ManyToOne
	private TypeQuestion tquestions;
	
	
	@ManyToOne
	private Sujet sujet;
	
	
	
	
	@ManyToMany
    @JoinTable(name="NIVEAU_QUESTION",
        joinColumns=
            @JoinColumn(name="ID_QUESTION", referencedColumnName="ID_QUESTION"),
        inverseJoinColumns=
            @JoinColumn(name="ID_NIVEAU", referencedColumnName="ID_NIVEAU")
        )
	private Set<Niveau> niveaux;

	
	
	@ManyToMany
    @JoinTable(name="QUESTION_TEST",
        joinColumns=
            @JoinColumn(name="ID_QUESTION", referencedColumnName="ID_QUESTION"),
        inverseJoinColumns=
            @JoinColumn(name="ID_TEST", referencedColumnName="ID_TEST")
        )
	private Set<Test> tests;



	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Question(Long idQuestion, String enonce, Set<Choix> choix, TypeQuestion tquestions, Sujet sujet,
			Set<Niveau> niveaux, Set<Test> tests) {
		super();
		this.idQuestion = idQuestion;
		this.enonce = enonce;
		this.choix = choix;
		this.tquestions = tquestions;
		this.sujet = sujet;
		this.niveaux = niveaux;
		this.tests = tests;
	}



	@Override
	public String toString() {
		return "Question [idQuestion=" + idQuestion + ", enonce=" + enonce + ", choix=" + choix + ", tquestions="
				+ tquestions + ", sujet=" + sujet + ", niveaux=" + niveaux + ", tests=" + tests + "]";
	}



	public String getEnonce() {
		return enonce;
	}



	public void setEnonce(String enonce) {
		this.enonce = enonce;
	}



	public Set<Choix> getChoix() {
		return choix;
	}



	public void setChoix(Set<Choix> choix) {
		this.choix = choix;
	}



	public TypeQuestion getTquestions() {
		return tquestions;
	}



	public void setTquestions(TypeQuestion tquestions) {
		this.tquestions = tquestions;
	}



	public Sujet getSujet() {
		return sujet;
	}



	public void setSujet(Sujet sujet) {
		this.sujet = sujet;
	}



	public Set<Niveau> getNiveaux() {
		return niveaux;
	}



	public void setNiveaux(Set<Niveau> niveaux) {
		this.niveaux = niveaux;
	}



	public Set<Test> getTests() {
		return tests;
	}



	public void setTests(Set<Test> tests) {
		this.tests = tests;
	}



	public Long getIdQuestion() {
		return idQuestion;
	}
	
	
	
	
	

}
