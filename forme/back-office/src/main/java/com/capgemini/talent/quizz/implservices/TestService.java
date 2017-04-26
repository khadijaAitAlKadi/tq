package com.capgemini.talent.quizz.implServices;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.talent.quizz.dao.ITestRepository;
import com.capgemini.talent.quizz.entities.CMRH;
import com.capgemini.talent.quizz.entities.Sujet;
import com.capgemini.talent.quizz.entities.Test;
import com.capgemini.talent.quizz.services.ITestService;
/**
 * 
 * @author kaitalka
 *
 */
@Service
public class TestService implements ITestService{
    
	@Autowired
	ITestRepository testRepository;
	
	
	@Transactional
	public List<Test> listeTests(Sujet sujet){
		return testRepository.findBySujet(sujet);
	}
	
	@Transactional
	public Test ajouterTest(Test s){
		return testRepository.save(s);
	}

	@Transactional
	public void supprimerTest(Long idTest) {
	   testRepository.delete(idTest);
		
	}


	@Transactional
	public void modifierTest(Test s) {
		testRepository.save(s);
		
	}

	@Override
	public List<Test> chercherTest(Sujet sujet) {
		return testRepository.findBySujet(sujet);
	}

	@Override
	public List<Test> listeTests() {
		// TODO Auto-generated method stub
		return testRepository.findAll();
	}

	@Override
	public List<Test> listeTests(CMRH cmrh) {
		// TODO Auto-generated method stub
		return testRepository.findBycmrh(cmrh);
	}

	/* (non-Javadoc)
	 * @see com.capgemini.talent.quizz.services.ITestService#chercherTest(java.lang.Long)
	 */
	@Override
	public Test chercherTest(Long idTest) {
		// TODO Auto-generated method stub
		return testRepository.findByIdTest(idTest);
	}

	

	
	
}
