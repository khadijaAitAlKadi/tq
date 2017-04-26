package com.capgemini.talent.quizz.rest;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.talent.quizz.entities.Candidat;
import com.capgemini.talent.quizz.entities.Choix;
import com.capgemini.talent.quizz.entities.Question;
import com.capgemini.talent.quizz.entities.Sujet;
import com.capgemini.talent.quizz.entities.Test;
import com.capgemini.talent.quizz.services.ICandidatService;
import com.capgemini.talent.quizz.services.IChoixService;
import com.capgemini.talent.quizz.services.IQuestionService;
import com.capgemini.talent.quizz.services.ISujetService;
import com.capgemini.talent.quizz.services.ITestService;

/**
 * 
 * @author gennaili
 *
 */


/**
 * 
 * @author kaitalka
 *
 */
@RestController
public class TalentQuizzRestController {
   
	@Autowired
	private ISujetService sujetService;
	@Autowired
	private IQuestionService questionService;
	@Autowired
	private IChoixService choixService;
	@Autowired
	private ICandidatService candidatService;
	@Autowired
	private ITestService testService;
	    // Ajouter Sujet
		@RequestMapping(value = "/sujet/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
		public String saveSubject(@RequestBody Sujet sujet) {
			sujetService.ajouterSujet(sujet);
			return "OK";
		}
		
		// récupérer un sujet par son id
		@RequestMapping(value = "/sujet/get", method = RequestMethod.GET)
		public Sujet showSubject(Long idSujet) {
			return sujetService.lireSujet(idSujet);
		}

		//récupérer tous les sujets
		@RequestMapping(value = "/sujet/getList", method = RequestMethod.GET)
		public List<Sujet> listSubjects() {
			return sujetService.getSujets();
		}

		// éditer un sujet
		@RequestMapping(value = "/sujet/edit", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
		public String modifySubject(@RequestBody Sujet sujet) {
			sujetService.editerSujet(sujet);
			return "OK";
		}

		// Supprimer un sujet par son id
		@RequestMapping(value = "/sujet/delete", method = RequestMethod.GET)
		public String deleteSubject(Long idSujet) {
			sujetService.supprimerSujet(idSujet);
			return "OK";
		}
		
		//Ajouter Question
		@RequestMapping(value = "/question/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
		public String saveQuestion(@RequestBody Question question) {
			questionService.ajouterQuestion(question);
			return "OK";
		}
		
		// éditer une question
				@RequestMapping(value = "/question/edit", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
				public String modifyQuestion(@RequestBody Question question) {
					questionService.editerQuestion(question);
					return "OK";
				}

		//Supprimer une question par son id
				@RequestMapping(value = "/question/delete", method = RequestMethod.GET)
				public String deleteQuestion(Long idQuestion) {
					questionService.supprimerQuestion(idQuestion);
					return "OK";
				}	
		
		//récupérer toutes les questions
				@RequestMapping(value = "/questions/getQuestions", method = RequestMethod.GET)
				public List<Question> listQuestions() {
					return questionService.getAllQuestions();
				}
	   
		//récupérer les questions par sujet
				@RequestMapping(value = "/questions/getQuestionsBySubject", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
				public List<Question> listQuestionsBySubject(@RequestBody Sujet sujet) {
					return questionService.getQuestionsBySubject(sujet);
				}
	
		//Ajouter choix
				@RequestMapping(value = "/choix/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
				public String saveChoice(@RequestBody Choix choix) {
					choixService.ajouterChoix(choix);
					return "OK";
				}	
		
	   //éditer choix
				@RequestMapping(value = "/choix/edit", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
				public String modifyChoice(@RequestBody Choix choix) {
					choixService.editerChoix(choix);
					return "OK";
				}
				
	   //supprimer choix 
				@RequestMapping(value = "/choix/delete", method = RequestMethod.GET)
				public String deleteChoice(Long idChoix) {
					choixService.supprimerChoix(idChoix);
					return "OK";
				}
				
	  //récupérer tous les choix
				@RequestMapping(value = "/choix/getChoix", method = RequestMethod.GET)
				public List<Choix> listChoix() {
					return choixService.getAllChoices();
				}
	  
	 //récupérer les choix par question
				@RequestMapping(value = "/choix/getChoixByQuestion", method = RequestMethod.GET)
				public List<Choix> listChoicesByQuestion(Question question) {
					return choixService.getChoicesByQuestion(question);
				}
				
	 //récupérer les candidats
				@RequestMapping(value="/candidats/getCandidats",method=RequestMethod.GET)
				public List<Candidat> getCandidats() {
					return candidatService.listerCandidats();
				}
	 //ajouter un candidat			
				@RequestMapping(value="/candidats/addCandidat",method=RequestMethod.POST ,consumes = MediaType.APPLICATION_JSON_VALUE)
				public Candidat addCandidat(@RequestBody Candidat s) {
					return candidatService.ajouterCandidat(s);
				}
				
				
	//supprimer un candidat
				@RequestMapping(value="/candidats/deleteCandidat",method=RequestMethod.DELETE)
				public void deleteCandidat(Long idCandidat) {
					candidatService.supprimerCandidat(idCandidat);
				}
				
	//recuperer les candidats par test
				@RequestMapping(value="/candidats/getCandidatt",method=RequestMethod.GET)
				public List<Candidat> getCandidats(Test test) {
					return candidatService.chercherCandidats(test);
				}
				
	//recuperer un candidat
				@RequestMapping(value="/candidats/getCandidati",method=RequestMethod.GET)
				public Candidat getCandidat(Long idTest) {
					return candidatService.chercherCandidat(idTest);
				}
				
	//modifier un candidat
				@RequestMapping(value="/candidats/editCandidat",method=RequestMethod.PUT)
				public void editCandidat(Candidat s) {
					candidatService.modifierCandidat(s);
				}
			
	//lister les tests
				@RequestMapping(value="/tests/getTests",method=RequestMethod.GET)
				public List<Test> getTests() {
					return testService.listeTests();
				}	
				
	//ajouter un test
				@RequestMapping(value="/tests/addTest",method=RequestMethod.POST ,consumes = MediaType.APPLICATION_JSON_VALUE)
				public Test addTest(Test s) {
					return testService.ajouterTest(s);
				}
				
	//supprimer un test
				@RequestMapping(value="/tests/deleteTest",method=RequestMethod.DELETE)
				public void deleteTest(Long idTest) {
					testService.supprimerTest(idTest);
				}
				
	//lister les tests par sujet
				@RequestMapping(value="/tests/getTest",method=RequestMethod.GET)
				public List<Test> getTests(Sujet sujet) {
					return testService.chercherTest(sujet);
				}
				
	//modifier un test
				@RequestMapping(value="/tests/editTest",method=RequestMethod.PUT)
				public void editTest(Test s) {
					testService.modifierTest(s);
				}
				
}
