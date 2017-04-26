package com.capgemini.talent.quizz.implServices;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.talent.quizz.dao.ICandidatRepository;
import com.capgemini.talent.quizz.entities.Candidat;
import com.capgemini.talent.quizz.entities.Test;
import com.capgemini.talent.quizz.services.ICandidatService;
/**
 * 
 * @author kaitalka
 *
 */
@Service
public class CandidatService implements ICandidatService{
    
	@Autowired
	ICandidatRepository candidatRepository;
	
	

	@Transactional
	public Candidat ajouterCandidat(Candidat s){
		return candidatRepository.save(s);
	}

	@Transactional
	public void supprimerCandidat(Long idCandidat) {
		candidatRepository.delete(idCandidat);
		
	}

	@Transactional
	public List<Candidat> chercherCandidats(Test test) {
		return candidatRepository.findByTests(test);
	}

	@Transactional
	public void modifierCandidat(Candidat s) {
		candidatRepository.save(s);
		
	}

	@Override
	public Candidat chercherCandidat(Long idCandidat) {
		// TODO Auto-generated method stub
		return candidatRepository.findOne(idCandidat);
	}

	@Override
	public List<Candidat> listerCandidats(Test test) {
		// TODO Auto-generated method stub
		return candidatRepository.findByTests(test);
	}

	/* (non-Javadoc)
	 * @see com.capgemini.talent.quizz.services.ICandidatService#listerCandidats()
	 */
	@Override
	public List<Candidat> listerCandidats() {
		// TODO Auto-generated method stub
		return candidatRepository.findAll();
	}

	/* (non-Javadoc)
	 * @see com.capgemini.talent.quizz.services.ICandidatService#modifierCandidat(com.capgemini.talent.quizz.entities.Candidat)
	 */
	

//	@Override
//	public List<Candidat> chercher(String nomCandidat) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
}
