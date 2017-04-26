/**
 * 
 */
package com.capgemini.talent.quizz.implServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.talent.quizz.dao.INiveauRepository;
import com.capgemini.talent.quizz.entities.Niveau;
import com.capgemini.talent.quizz.entities.Test;
import com.capgemini.talent.quizz.services.INiveauService;

/**
 * @author kaitalka
 *
 */
@Service
public class NiveauService implements INiveauService {
	@Autowired
	INiveauRepository niveauRepository;

	/* (non-Javadoc)
	 * @see com.capgemini.talent.quizz.services.INiveauService#listeNiveaux()
	 */
	@Override
	@Transactional
	public List<Niveau> listeNiveaux() {
		// TODO Auto-generated method stub
		return niveauRepository.findAll();
	}

	/* (non-Javadoc)
	 * @see com.capgemini.talent.quizz.services.INiveauService#ajouterNiveau(com.capgemini.talent.quizz.entities.Niveau)
	 */
	@Override
	public Niveau ajouterNiveau(Niveau niveau) {
		// TODO Auto-generated method stub
		return niveauRepository.save(niveau);
	}

	/* (non-Javadoc)
	 * @see com.capgemini.talent.quizz.services.INiveauService#supprimerNiveau(java.lang.Long)
	 */
	@Override
	public void supprimerNiveau(Long idNiveau) {
		// TODO Auto-generated method stub
		niveauRepository.delete(idNiveau);
		
	}

	

	/* (non-Javadoc)
	 * @see com.capgemini.talent.quizz.services.INiveauService#modifierNiveau(java.lang.Long)
	 */
	@Override
	public Niveau modifierNiveau(Niveau niveau) {
		// TODO Auto-generated method stub
		return niveauRepository.save(niveau);
	}

	/* (non-Javadoc)
	 * @see com.capgemini.talent.quizz.services.INiveauService#getNiveau()
	 */
	@Override
	public Niveau getNiveau(Long id) {
		// TODO Auto-generated method stub
		return niveauRepository.findByIdNiveau(id);
	}
	
	

}
