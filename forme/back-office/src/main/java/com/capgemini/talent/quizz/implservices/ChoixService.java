package com.capgemini.talent.quizz.implServices;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.capgemini.talent.quizz.dao.IChoixRepository;
import com.capgemini.talent.quizz.entities.Choix;
import com.capgemini.talent.quizz.entities.Question;
import com.capgemini.talent.quizz.services.IChoixService;

/**
 * 
 * @author gennaili
 *
 */

@Service
public class ChoixService implements IChoixService{
    
	@Autowired
    IChoixRepository choixRepository;
	
	@Transactional
	public Choix ajouterChoix(Choix choix) {
		
		return choixRepository.save(choix);
	}


	@Transactional
	public void supprimerChoix(Long idChoix) {
		choixRepository.delete(idChoix);
		
	}


	@Transactional
	public void editerChoix(Choix choix) {
		choixRepository.save(choix);
		
	}
	
	
	@Transactional
	public List<Choix> getAllChoices() {
		
		return choixRepository.findAll();
	}
    
	
	@Transactional
	public List<Choix> getChoicesByQuestion(Question question) {
		
		return choixRepository.findByQuestion(question);
	}


	@Override
	public Choix getChoixById(Long idChoix) {
		
		return choixRepository.findOne(idChoix);
	}
}
	
	
