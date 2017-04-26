package com.capgemini.talent.quizz.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.capgemini.talent.quizz.dao.ICandidatRepository;
import com.capgemini.talent.quizz.dao.ICandidatRepository;
import com.capgemini.talent.quizz.entities.Candidat;
import com.capgemini.talent.quizz.implServices.CandidatService;
import com.capgemini.talent.quizz.services.ICandidatService;

/**
 * 
 * @author kaitalka
 *
 */
@Controller
public class CandidatController {
	@Autowired
	private ICandidatService candidatService;
	
	@RequestMapping(value="/allCandidats")
	public String AllCandidats(Model model){
		List<Candidat> candidats=candidatService.listerCandidats();
		model.addAttribute("candidats", candidats);
		return "allCandidats";
	}
	
	@RequestMapping(value="/saveCandidat")
	public String saveCandidat(Candidat candidat){
		candidatService.ajouterCandidat(candidat);
		return "candidatSaved";
		
	}
	
	@RequestMapping(value="/deleteCandidat")
	public String deleteCandidat(Long idCandidat){
		candidatService.supprimerCandidat(idCandidat);;
		return "candidatDeleted";
	}
	
	
	@RequestMapping(value="/editCandidat")
	public String editCandidat(Long idCandidat,Model model){
		Candidat candidat=(Candidat) candidatService.chercherCandidat(idCandidat);
		model.addAttribute("candidat", candidat);
		return "candidateditform";
	}
	
	@RequestMapping(value="/updateCandidat")
	public String updateCandidat(Candidat candidat){
		candidatService.ajouterCandidat(candidat);
		return "candidatSaved";
		
	}
}
