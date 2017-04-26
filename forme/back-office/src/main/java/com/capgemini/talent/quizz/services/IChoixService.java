package com.capgemini.talent.quizz.services;

import java.util.List;
import com.capgemini.talent.quizz.entities.Choix;
import com.capgemini.talent.quizz.entities.Question;


/**
 * 
 * @author gennaili
 *
 */


public interface IChoixService {
	
	
	public Choix ajouterChoix(Choix choix);
    public void supprimerChoix(Long idChoix);
    public void editerChoix(Choix choix);
    public List<Choix> getAllChoices();
    public List<Choix> getChoicesByQuestion(Question question);
    public Choix getChoixById(Long idChoix);
    // public void supprimerChoixParQuestion(Long idQuestion);
    //public void editerChoix(Question q);
}
