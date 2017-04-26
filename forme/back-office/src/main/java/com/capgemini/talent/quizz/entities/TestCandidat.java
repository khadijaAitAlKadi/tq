package com.capgemini.talent.quizz.entities;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * 
 * @author kaitalka
 *
 */
@Entity
@Table(name="TEST_CANDIDAT")
public class TestCandidat implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	private boolean status;
	private Long score;
	@ManyToOne
	private Candidat candidat;
	@ManyToOne
	private Test test;
	
	
	public TestCandidat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TestCandidat(Long id, boolean status, Long score, Candidat candidat, Test test) {
		super();
		this.id = id;
		this.status = status;
		this.score = score;
		this.candidat = candidat;
		this.test = test;
	}
	@Override
	public String toString() {
		return "TestCandidat [id=" + id + ", status=" + status + ", score=" + score + ", candidat=" + candidat
				+ ", test=" + test + "]";
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Long getScore() {
		return score;
	}
	public void setScore(Long score) {
		this.score = score;
	}
	public Candidat getCandidat() {
		return candidat;
	}
	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}
	public Test getTest() {
		return test;
	}
	public void setTest(Test test) {
		this.test = test;
	}
	public Long getId() {
		return id;
	}
	


}
