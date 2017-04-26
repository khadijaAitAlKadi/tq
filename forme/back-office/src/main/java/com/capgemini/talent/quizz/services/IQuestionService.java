package com.capgemini.talent.quizz.services;
import java.util.List;
import com.capgemini.talent.quizz.entities.Question;
import com.capgemini.talent.quizz.entities.Sujet;


/**
 * 
 * @author gennaili
 *
 */

public interface IQuestionService {
	
    public Question ajouterQuestion(Question question);
    public void supprimerQuestion(Long idQuestion);
    public void editerQuestion(Question question);
    public List<Question> getAllQuestions();
    
	public List<Question> getQuestionsBySubject(Sujet sujet);
	public Question getQuestionById(Long idQuestion);
}
