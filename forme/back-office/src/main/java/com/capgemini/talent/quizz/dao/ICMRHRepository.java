package com.capgemini.talent.quizz.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.capgemini.talent.quizz.entities.CMRH;

/**
 * 
 * @author gennaili
 *
 */

public interface ICMRHRepository extends JpaRepository<CMRH, Long>{
	
  
	@Query("select rh from CMRH rh where rh.nom = :nom")
	CMRH findByName(@Param("nom") String rhName);  
	

}
