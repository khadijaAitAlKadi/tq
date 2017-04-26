package com.capgemini.talent.quizz.services;
import java.util.List;
import com.capgemini.talent.quizz.entities.Sujet;



/**
 * 
 * @author gennaili
 *
 */


public interface ISujetService {
       
       public Sujet ajouterSujet(Sujet sujet);
       public void supprimerSujet(Long idSujet);
       public void editerSujet(Sujet sujet);
       public Sujet lireSujet(Long idSujet);
       public List<Sujet> getSujets();
       public Sujet chercherSujet(String nomSujet);
}
