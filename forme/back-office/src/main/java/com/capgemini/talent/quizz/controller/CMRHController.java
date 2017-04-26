package com.capgemini.talent.quizz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.capgemini.talent.quizz.entities.CMRH;

import com.capgemini.talent.quizz.services.ICMRHService;

@Controller
public class CMRHController {
	   
	   @Autowired
       private ICMRHService cmrhService;
       
	   
	 //ajouter CMRH
		@RequestMapping(value="/saveCMRH")
		public String saveCMRH(CMRH cmrh){
			cmrhService.ajouterCMRH(cmrh);
			return "CMRHSaved";
			
		}
		
	//chercher CMRH par son nom
		@RequestMapping(value="/searchCMRH")
		public String searchCMRH(String nom,Model model){
			CMRH cmrh=cmrhService.chercherCMRH(nom);
			model.addAttribute("cmrh", cmrh);
			return "Sujet";
		}
}
