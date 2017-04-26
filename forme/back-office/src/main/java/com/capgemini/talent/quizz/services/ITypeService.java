/**
 * 
 */
package com.capgemini.talent.quizz.services;

import java.util.List;

import com.capgemini.talent.quizz.entities.TypeQuestion;


/**
 * @author kaitalka
 *
 */
public interface ITypeService {
	
	public List<TypeQuestion> listeTypeQuestions();
	public TypeQuestion getTypeQuestion(Long idTypeQuestion);	
	public TypeQuestion ajouterTypeQuestion(TypeQuestion type);
	public void supprimerTypeQuestion(Long idTypeQuestion);
	public TypeQuestion modifierTypeQuestion(TypeQuestion type);

}
