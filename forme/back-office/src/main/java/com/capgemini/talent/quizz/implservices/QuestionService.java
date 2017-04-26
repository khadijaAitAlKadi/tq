package com.capgemini.talent.quizz.implServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.capgemini.talent.quizz.dao.IQuestionRepository;
import com.capgemini.talent.quizz.entities.Question;
import com.capgemini.talent.quizz.entities.Sujet;
import com.capgemini.talent.quizz.services.IQuestionService;


/**
 * 
 * @author gennaili
 *
 */

@Service
public class QuestionService implements IQuestionService{
	@Autowired
    IQuestionRepository questionRepository;
	
	

	@Transactional
	public Question ajouterQuestion(Question question) {
		
		return questionRepository.save(question);
	}

	@Transactional
	public void supprimerQuestion(Long idQuestion) {
		questionRepository.delete(idQuestion);
		
	}

	@Transactional
	public void editerQuestion(Question question) {
		
		questionRepository.save(question);
	}

	
	@Transactional
	public List<Question> getAllQuestions(){
		return questionRepository.findAll();
	}
	
	@Transactional
	public List<Question> getQuestionsBySubject(Sujet sujet) {
		
		return questionRepository.findBySujet(sujet);
	}

	@Override
	public Question getQuestionById(Long idQuestion) {
		
		return questionRepository.findOne(idQuestion);
	}

}
