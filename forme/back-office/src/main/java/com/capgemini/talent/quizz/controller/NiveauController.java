/**
 * 
 */
package com.capgemini.talent.quizz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.capgemini.talent.quizz.entities.Niveau;
import com.capgemini.talent.quizz.services.INiveauService;



/**
 * @author kaitalka
 *
 */
@Controller
public class NiveauController {
	@Autowired
	private INiveauService niveauService;
	
	
	@RequestMapping(value="/niveaux")
	public String getNiveaux(Model model){
		List<Niveau> niveaux=niveauService.listeNiveaux();
		model.addAttribute("types", niveaux);
		return "niveaux";
		
	}
	
	
	
	@RequestMapping(value="/saveNiveau")
	public String saveNiveau(Niveau niveau){
		niveauService.ajouterNiveau(niveau);
		return "niveauSaved";
		
	}
	
	@RequestMapping(value="/deleteNiveau")
	public String deleteNiveau(Long idNiveau){
		niveauService.supprimerNiveau(idNiveau);
		return "niveauDeleted";
	}
	
	@RequestMapping(value="/editNiveau")
	public String editNiveau(Long idNiveau,Model model){
		Niveau niveau=niveauService.getNiveau(idNiveau);
		model.addAttribute("niveau", niveau);
		return "niveaueditform";
	}
	
	@RequestMapping(value="/updateNiveau")
	public String updateNiveau(Niveau niveau){
		niveauService.ajouterNiveau(niveau);
		return "niveauSaved";
		
	}

}
