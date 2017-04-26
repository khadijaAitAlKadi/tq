package com.capgemini.talent.quizz.dao;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.capgemini.talent.quizz.entities.Question;
import com.capgemini.talent.quizz.entities.Sujet;


/**
 * 
 * @author gennaili
 *
 */


@Repository
public interface IQuestionRepository extends JpaRepository<Question, Long>{
	List<Question> findBySujet(Sujet sujet);
}
