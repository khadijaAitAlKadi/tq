package com.capgemini.talent.quizz.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.capgemini.talent.quizz.entities.Choix;
import com.capgemini.talent.quizz.entities.Question;


/**
 * 
 * @author gennaili
 *
 */
@Repository
public interface IChoixRepository extends JpaRepository<Choix, Long>{
	
	List<Choix> findByQuestion(Question q);
	//List<Choix> findByReponseTrue();

}
