package com.capgemini.talent.quizz.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.capgemini.talent.quizz.dao.ITestRepository;
import com.capgemini.talent.quizz.entities.Test;
import com.capgemini.talent.quizz.services.ITestService;

/**
 * 
 * @author kaitalka
 *
 */

@Controller
public class TestController {
	@Autowired
	private ITestService testService;
	
	@RequestMapping(value="/allTests")
	public String AllTests(Model model){
		List<Test> tests=testService.listeTests();;
		model.addAttribute("tests", tests);
		return "allTests";
	}
		@RequestMapping(value="/saveTest")
		public String saveTest(Test test){
			testService.ajouterTest(test);
			return "testSaved";
			
		}
		
		@RequestMapping(value="/deleteTest")
		public String deleteTest(Long idTest){
			testService.supprimerTest(idTest);
			return "testDeleted";
		}
		
		@RequestMapping(value="/editTest")
		public String editTest(Long idTest,Model model){
			Test test=testService.chercherTest(idTest);
			model.addAttribute("test", test);
			return "testeditform";
		}
		
		
		@RequestMapping(value="/updateTest")
		public String updateTest(Test test){
			testService.ajouterTest(test);
			return "testSaved";
			
		}
		
		

		
		
	
	

}
