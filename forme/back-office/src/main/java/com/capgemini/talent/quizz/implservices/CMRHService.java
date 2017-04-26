package com.capgemini.talent.quizz.implServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.talent.quizz.dao.ICMRHRepository;
import com.capgemini.talent.quizz.entities.CMRH;
import com.capgemini.talent.quizz.services.ICMRHService;
/**
 * 
 * @author gennaili
 *
 */
@Service
public class CMRHService implements ICMRHService{
    
	@Autowired
	ICMRHRepository cmrhRepository;
	
	@Transactional
	public CMRH ajouterCMRH(CMRH cmrh) {
		
		return cmrhRepository.save(cmrh);
	}


	@Transactional
	public void editerCMRH(CMRH cmrh) {
		
		cmrhRepository.save(cmrh);
	}

	@Transactional
	public List<CMRH> getCMRHs() {
		
		return cmrhRepository.findAll();
	}


	@Transactional
	public CMRH chercherCMRH(String nom) {
		
		return cmrhRepository.findByName(nom);
	}

	


}
