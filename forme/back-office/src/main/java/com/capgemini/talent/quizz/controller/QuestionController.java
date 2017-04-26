package com.capgemini.talent.quizz.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;



import com.capgemini.talent.quizz.entities.Question;
import com.capgemini.talent.quizz.entities.Sujet;
import com.capgemini.talent.quizz.services.IQuestionService;


/**
 * 
 * @author gennaili
 *
 */
@Controller
public class QuestionController {
	 
	@Autowired
	private IQuestionService questionService;
	
       //lister toutes les questions
	    @RequestMapping(value="/allQuestions")
	    public String AllQuestions(Model model){
	    List<Question> questions=questionService.getAllQuestions();
		model.addAttribute("questions", questions);
		return "AllSubjects";
	   }
		
		//ajouter question
		@RequestMapping(value="/saveQuestion")
		public String saveQuestion(Question question){
			questionService.ajouterQuestion(question);
			return "QuestionSaved";
			
		}
		
		//supprimer question
		@RequestMapping(value="/deleteQuestion")
		public String deleteSubject(Long idQuestion){
			questionService.supprimerQuestion(idQuestion);;
			return "QuestionDeleted";
		}
		
		//éditer question
		@RequestMapping(value="/editQuestion")
		public String editQuestion (Long idQuestion,Model model){
			Question question = questionService.getQuestionById(idQuestion);
			model.addAttribute("question", question );
			return "QuestionEditForm";
		} 
		
		//mettre à jour une question
		@RequestMapping(value="/updateQuestion")
		public String updateSubject(Question question){
			questionService.ajouterQuestion(question);
			return "questionSaved";
			
		}
		
		//chercher question par sujet
		@RequestMapping(value="/searchQuestion")
		public String searchQuestion(Sujet sujet,Model model){
			List<Question> questions=questionService.getQuestionsBySubject(sujet);
			model.addAttribute("questions", questions);
			return "Questions";
		}
    
  
}
