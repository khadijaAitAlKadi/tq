package com.capgemini.talent.quizz.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.talent.quizz.entities.CMRH;
import com.capgemini.talent.quizz.entities.Sujet;
import com.capgemini.talent.quizz.entities.Test;
/**
 * 
 * @author kaitalka
 *
 */
public interface ITestRepository extends JpaRepository<Test, Long>{
	public Test findByIdTest(Long id);
	public List<Test> findBySujet(Sujet sujet);
	public List<Test> findBycmrh(CMRH cmrh);

}
