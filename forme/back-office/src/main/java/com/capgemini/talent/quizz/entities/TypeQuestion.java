package com.capgemini.talent.quizz.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotEmpty;
//type de la qst : qcm, ouverte...
/**
 * 
 * @author kaitalka
 *
 */
@Entity
public class TypeQuestion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Long idType;
	@NotEmpty
	private String nomType;
	@OneToMany(mappedBy="tquestions")
	Set <Question> questions;
	public TypeQuestion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TypeQuestion(Long idType, String nomType, Set<Question> questions) {
		super();
		this.idType = idType;
		this.nomType = nomType;
		this.questions = questions;
	}
	@Override
	public String toString() {
		return "TypeQuestion [idType=" + idType + ", nomType=" + nomType + ", questions=" + questions + "]";
	}
	public String getNomType() {
		return nomType;
	}
	public void setNomType(String nomType) {
		this.nomType = nomType;
	}
	public Set<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}
	public Long getIdType() {
		return idType;
	}
	
	
	

}
