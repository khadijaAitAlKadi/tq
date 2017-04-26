/**
 * 
 */
package com.capgemini.talent.quizz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.capgemini.talent.quizz.entities.TypeQuestion;
import com.capgemini.talent.quizz.services.ITypeService;

/**
 * @author kaitalka
 *
 */
public class TypeController {
	
	@Autowired
	private ITypeService typeService;
	
	@RequestMapping(value="/typex")
	public String getTypex(Model model){
		List<TypeQuestion> typex=typeService.listeTypeQuestions();
		model.addAttribute("types", typex);
		return "typex";
		
	}
	
	
	
	@RequestMapping(value="/saveType")
	public String saveType(TypeQuestion type){
		typeService.ajouterTypeQuestion(type);
		return "typeSaved";
		
	}
	
	@RequestMapping(value="/deleteType")
	public String deleteType(Long idType){
		typeService.supprimerTypeQuestion(idType);
		return "typeDeleted";
	}
	
	@RequestMapping(value="/editType")
	public String editType(Long idType,Model model){
		TypeQuestion type=typeService.getTypeQuestion(idType);
		model.addAttribute("type", type);
		return "typeeditform";
	}
	
	@RequestMapping(value="/updateType")
	public String updateType(TypeQuestion type){
		typeService.ajouterTypeQuestion(type);
		return "typeSaved";
		
	}


}
