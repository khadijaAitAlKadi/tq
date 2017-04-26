package com.capgemini.talent.quizz.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.capgemini.talent.quizz.dao.ITestRepository;
import com.capgemini.talent.quizz.entities.Test;



@Controller
public class TestController {
	@Autowired
	private ITestRepository testRepository;
	
	@RequestMapping(value="/allTests")
	public String AllTests(Model model){
		List<Test> tests=testRepository.findAll();
		model.addAttribute("tests", tests);
		return "allTests";
	}
		@RequestMapping(value="/saveTest")
		public String saveTest(Test test){
			testRepository.save(test);
			return "testSaved";
			
		}
		
		@RequestMapping(value="/deleteTest")
		public String deleteTest(Long idTest){
			testRepository.delete(idTest);
			return "testDeleted";
		}
		
		@RequestMapping(value="/editTest")
		public String editTest(Long idTest,Model model){
			Test test=testRepository.getOne(idTest);
			model.addAttribute("test", test);
			return "testeditform";
		}
		
		
		@RequestMapping(value="/updateTest")
		public String updateTest(Test test){
			testRepository.save(test);
			return "testSaved";
			
		}
		
		

		
		
	
	

}
