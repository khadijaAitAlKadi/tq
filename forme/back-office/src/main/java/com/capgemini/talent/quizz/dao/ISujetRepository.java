package com.capgemini.talent.quizz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.capgemini.talent.quizz.entities.Sujet;



/**
 * 
 * @author gennaili
 *
 */


@Repository
public interface ISujetRepository extends JpaRepository<Sujet, Long> {
	Sujet findByNomSujetIgnoreCase(String nomSujet);
	//findby()
	
	
}
