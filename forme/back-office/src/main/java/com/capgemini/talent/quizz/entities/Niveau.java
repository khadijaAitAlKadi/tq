package com.capgemini.talent.quizz.entities;
//repare
import java.io.Serializable;
import java.util.Set;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.ManyToMany;

import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * 
 * @author kaitalka
 *
 */
@Entity
@Table(name="NIVEAU")
public class Niveau implements Serializable{
       /**
       * 
        */
       private static final long serialVersionUID = 1L;
       @Id
       @Column(name="ID_NIVEAU")
       private Long idNiveau;
       @NotEmpty
       private String nomNiveau;
       @ManyToMany(mappedBy="niveaux")
       private Set<Question> questions; 

             
             
             public Niveau() {
                    super();
                    // TODO Auto-generated constructor stub
             }
             public Niveau(Long idNiveau, String nomNiveau, Set<Question> questions) {
                    super();
                    this.idNiveau = idNiveau;
                    this.nomNiveau = nomNiveau;
                    this.questions = questions;
                    
             }
             @Override
             public String toString() {
                    return "Niveau [idNiveau=" + idNiveau + ", nomNiveau=" + nomNiveau + ", questions=" + questions +  "]";
             }
             public String getNomNiveau() {
                    return nomNiveau;
             }
             public void setNomNiveau(String nomNiveau) {
                    this.nomNiveau = nomNiveau;
             }
             public Set<Question> getQuestions() {
                    return questions;
             }
             public void setQuestions(Set<Question> questions) {
                    this.questions = questions;
             }
             
             public Long getIdNiveau() {
                    return idNiveau;
             }  
}
       
