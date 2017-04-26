package com.capgemini.talent.quizz.implServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.capgemini.talent.quizz.dao.ISujetRepository;
import com.capgemini.talent.quizz.entities.Sujet;
import com.capgemini.talent.quizz.services.ISujetService;


/**
 * 
 * @author gennaili
 *
 */


@Service
public class SujetService implements ISujetService{
    
	@Autowired
	ISujetRepository sujetRepository;
	
	
	@Transactional
	public Sujet ajouterSujet(Sujet sujet){
		return sujetRepository.save(sujet);
	}

	@Transactional
	public void supprimerSujet(Long idSujet) {
		sujetRepository.delete(idSujet);
		
	}

	@Transactional
	public Sujet chercherSujet(String nomSujet) {
		return sujetRepository.findByNomSujetIgnoreCase(nomSujet);
	}

	@Transactional
	public void editerSujet(Sujet sujet) {
		sujetRepository.save(sujet);
		
	}

	@Override
	public Sujet lireSujet(Long idSujet) {
		
		return sujetRepository.findOne(idSujet);
	}
	
	//pr si y aura une erreur,y aura pas un prob au niv de la base de donnée
		@Transactional
		public List<Sujet> getSujets(){
			return sujetRepository.findAll();
		}
		
}
