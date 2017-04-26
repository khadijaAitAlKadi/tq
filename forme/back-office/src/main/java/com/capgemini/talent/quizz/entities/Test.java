package com.capgemini.talent.quizz.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author gennaili
 *
 */

@Entity
@Table(name ="Test")
public class Test implements Serializable {
	
	private static final long serialVersionUID = 1L;

	 @Id
	 @GeneratedValue
	 @Column(name="ID_TEST")
     private Long idTest;
	 
	 @ManyToOne
	 private CMRH cmrh;
	 
	 @Column(name="NIVEAU_TEST")
	 private String niveauTest;
	 
	 @ManyToOne
     private Candidat candidat;
	 
	
	 @Column(name="ETAT")
     private String etat;
	 
	 @Column(name="SCORE")
     private String score;
	 
	 @ManyToOne
	 private Sujet sujet;
	 
	 @ManyToMany
	 @JoinTable(name="Test_Candidat",joinColumns={@JoinColumn(name="idTestCandidat")},inverseJoinColumns={@JoinColumn(name="candId")})
	 private Set<Candidat> candidats;
     
	@ManyToMany(mappedBy="tests")
    private Set<Question> questions;
		
    private Long durée;
    private Date dateFermeture;
    
	public Test() {
		super();
		
	}
	public Test(Long idTest, CMRH cmrh, String niveauTest, Candidat candidat, String etat, String score, Sujet sujet,
			Set<Candidat> candidats, Set<Question> questions, Long durée, Date dateFermeture) {
		super();
		this.idTest = idTest;
		this.cmrh = cmrh;
		this.niveauTest = niveauTest;
		this.candidat = candidat;
		this.etat = etat;
		this.score = score;
		this.sujet = sujet;
		this.candidats = candidats;
		this.questions = questions;
		this.durée = durée;
		this.dateFermeture = dateFermeture;
	}
	
	public CMRH getCmrh() {
		return cmrh;
	}
	
	public void setCmrh(CMRH cmrh) {
		this.cmrh = cmrh;
	}
	
	public String getNiveauTest() {
		return niveauTest;
	}
	
	public void setNiveauTest(String niveauTest) {
		this.niveauTest = niveauTest;
	}
	
	public Candidat getCandidat() {
		return candidat;
	}
	
	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}
	
	public String getEtat() {
		return etat;
	}
	
	public void setEtat(String etat) {
		this.etat = etat;
	}
	
	public String getScore() {
		return score;
	}
	
	public void setScore(String score) {
		this.score = score;
	}
	
	public Sujet getSujet() {
		return sujet;
	}
	
	public void setSujet(Sujet sujet) {
		this.sujet = sujet;
	}
	
	public Set<Candidat> getCandidats() {
		return candidats;
	}
	
	public void setCandidats(Set<Candidat> candidats) {
		this.candidats = candidats;
	}
	
	public Set<Question> getQuestions() {
		return questions;
	}
	
	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}
	
	public Long getDurée() {
		return durée;
	}
	
	public void setDurée(Long durée) {
		this.durée = durée;
	}
	
	public Date getDateFermeture() {
		return dateFermeture;
	}
	
	public void setDateFermeture(Date dateFermeture) {
		this.dateFermeture = dateFermeture;
	}
	
	public Long getIdTest() {
		return idTest;
	}
	
	@Override
	public String toString() {
		return "Test [idTest=" + idTest + ", cmrh=" + cmrh + ", niveauTest=" + niveauTest + ", candidat=" + candidat
				+ ", etat=" + etat + ", score=" + score + ", sujet=" + sujet + ", candidats=" + candidats
				+ ", questions=" + questions + ", durée=" + durée + ", dateFermeture=" + dateFermeture + "]";
	}
    
    
	
     
}
