package com.capgemini.talent.quizz.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.talent.quizz.dao.ITestRepository;
import com.capgemini.talent.quizz.entities.Sujet;
import com.capgemini.talent.quizz.entities.Test;
import com.capgemini.talent.quizz.services.ITestService;

@RestController
@RequestMapping(value="/tests")
public class TestRestService {
	@Autowired
	private ITestService testService;

	@RequestMapping(value="/getTests",method=RequestMethod.GET)
	public List<Test> getTests() {
		return testService.listerTests();
	}

	@RequestMapping(value="/addTest",method=RequestMethod.POST)
	public Test addTest(Test s) {
		return testService.ajouterTest(s);
	}

	@RequestMapping(value="/deleteTest",method=RequestMethod.DELETE)
	public void deleteTest(Long idTest) {
		testService.supprimerTest(idTest);
	}

	@RequestMapping(value="/getTest",method=RequestMethod.GET)
	public List<Test> getTests(Sujet sujet) {
		return testService.chercherTest(sujet);
	}

	@RequestMapping(value="/editTest",method=RequestMethod.PUT)
	public void editTest(Test s) {
		testService.modifierTest(s);
	}

	
	
	

}
