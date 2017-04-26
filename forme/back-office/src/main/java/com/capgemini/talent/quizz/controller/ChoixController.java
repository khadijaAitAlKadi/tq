package com.capgemini.talent.quizz.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.capgemini.talent.quizz.entities.Choix;
import com.capgemini.talent.quizz.services.IChoixService;
/**
 * 
 * @author gennaili
 *
 */


public class ChoixController {
	@Autowired
	private IChoixService choixService;
	
	//ajouter choix
			@RequestMapping(value="/saveChoice")
			public String saveChoice(Choix choix){
				choixService.ajouterChoix(choix);
				return "ChoiceSaved";
				
			}
			
	//supprimer choix 
			@RequestMapping(value="/deleteChoice")
			public String deleteChoice(Long idChoix){
				choixService.supprimerChoix(idChoix);;
				return "ChoixDeleted";
			}
			
	//éditer choix 
			@RequestMapping(value="/editChoice")
			public String editChoice(Long idChoix,Model model){
				Choix choix = choixService.getChoixById(idChoix);
				model.addAttribute("choix", choix );
				return "ChoiceEditForm";
			} 
			
	//mettre à jour un choix
			@RequestMapping(value="/updateChoice")
			public String updateChoice(Choix choix){
				choixService.ajouterChoix(choix);
				return "ChoiceSaved";
				
			}
			
			
	
}
