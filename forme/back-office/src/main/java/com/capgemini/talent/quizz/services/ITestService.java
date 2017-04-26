package com.capgemini.talent.quizz.services;

import java.util.List;

import com.capgemini.talent.quizz.entities.CMRH;
import com.capgemini.talent.quizz.entities.Sujet;
import com.capgemini.talent.quizz.entities.Test;
/**
 * 
 * @author kaitalka
 *
 */
public interface ITestService {
	 public List<Test> listeTests();
	 public List<Test> listeTests(Sujet sujet);
	 public List<Test> listeTests(CMRH cmrh);
     public Test ajouterTest(Test s);
     public void supprimerTest(Long idTest);
     public List<Test> chercherTest(Sujet sujet);
     public Test chercherTest(Long idTest);
     public void modifierTest(Test s);

}
