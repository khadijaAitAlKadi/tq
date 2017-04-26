package com.capgemini.talent.quizz.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import org.hibernate.validator.constraints.NotEmpty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 
 * @author kaitalka
 *
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Choix implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	private Long idChoix;
	@NotEmpty
	private String choix;
	
	private boolean reponse;
	@ManyToOne
	private Question question;
	
	public Choix() {
		super();
	
	}
	public Choix(Long idChoix, String choix, boolean reponse, Question question) {
		super();
		this.idChoix = idChoix;
		this.choix = choix;
		this.reponse = reponse;
		this.question = question;
	}
	
	public String getChoix() {
		return choix;
	}
	public void setChoix(String choix) {
		this.choix = choix;
	}
	public boolean isReponse() {
		return reponse;
	}
	public void setReponse(boolean reponse) {
		this.reponse = reponse;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public Long getIdChoix() {
		return idChoix;
	}
	
	@Override
	public String toString() {
		return "Choix [idChoix=" + idChoix + ", choix=" + choix + ", reponse=" + reponse + ", question=" + question
				+ "]";
	}
	

}
