package com.capgemini.talent.quizz.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.capgemini.talent.quizz.dao.ICandidatRepository;
import com.capgemini.talent.quizz.dao.ICandidatRepository;
import com.capgemini.talent.quizz.entities.Candidat;
import com.capgemini.talent.quizz.entities.Candidat;
import com.capgemini.talent.quizz.entities.Candidat;
import com.capgemini.talent.quizz.entities.Candidat;

@Controller
public class CandidatController {
	@Autowired
	private ICandidatRepository candidatRepository;
	
	@RequestMapping(value="/allCandidats")
	public String AllCandidats(Model model){
		List<Candidat> candidats=candidatRepository.findAll();
		model.addAttribute("candidats", candidats);
		return "allCandidats";
	}
	
	@RequestMapping(value="/saveCandidat")
	public String saveCandidat(Candidat candidat){
		candidatRepository.save(candidat);
		return "candidatSaved";
		
	}
	
	@RequestMapping(value="/deleteCandidat")
	public String deleteCandidat(Long idCandidat){
		candidatRepository.delete(idCandidat);
		return "candidatDeleted";
	}
	
	
	@RequestMapping(value="/editCandidat")
	public String editCandidat(Long idCandidat,Model model){
		Candidat candidat=candidatRepository.getOne(idCandidat);
		model.addAttribute("candidat", candidat);
		return "candidateditform";
	}
	
	@RequestMapping(value="/updateCandidat")
	public String updateCandidat(Candidat candidat){
		candidatRepository.save(candidat);
		return "candidatSaved";
		
	}
}
