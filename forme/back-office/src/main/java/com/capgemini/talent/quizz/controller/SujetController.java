package com.capgemini.talent.quizz.controller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;





import com.capgemini.talent.quizz.entities.Sujet;
import com.capgemini.talent.quizz.services.ISujetService;

/**
 * 
 * @author gennaili
 *
 */
@Controller
public class SujetController {
	
    
	@Autowired
	private ISujetService sujetService;
	
	//lister tous les sujets
	@RequestMapping(value="/allSubjects")
	public String AllSubjects(Model model){
		List<Sujet> sujets=sujetService.getSujets();
		model.addAttribute("sujets", sujets);
		return "AllSubjects";
	}
	
	//ajouter sujet
	@RequestMapping(value="/saveSubject")
	public String saveSubject(Sujet sujet){
		sujetService.ajouterSujet(sujet);
		return "SubjectSaved";
		
	}
	
	//supprimer sujet
	@RequestMapping(value="/deleteSujet")
	public String deleteSubject(Long idSujet){
		sujetService.supprimerSujet(idSujet);;
		return "SubjectDeleted";
	}
	
	//éditer sujet
	@RequestMapping(value="/editSubject")
	public String editSubject(Long idSujet,Model model){
		Sujet sujet=sujetService.lireSujet(idSujet);
		model.addAttribute("sujet", sujet);
		return "SujetEditForm";
	}
	
	//mettre à jour un sujet
	@RequestMapping(value="/updateSubject")
	public String updateSubject(Sujet sujet){
		sujetService.ajouterSujet(sujet);
		return "sujetSaved";
		
	}
	
	//chercher sujet par son nom
	@RequestMapping(value="/searchSubject")
	public String searchSubject(String nomSujet,Model model){
		Sujet sujet=sujetService.chercherSujet(nomSujet);
		model.addAttribute("sujet", sujet);
		return "Sujet";
	}
	  

}


