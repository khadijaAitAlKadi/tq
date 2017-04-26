/**
 * 
 */
package com.capgemini.talent.quizz.implServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.talent.quizz.dao.ITypeRepository;
import com.capgemini.talent.quizz.entities.TypeQuestion;
import com.capgemini.talent.quizz.services.ITypeService;

/**
 * @author kaitalka
 *
 */
public class TypeService implements ITypeService {

	@Autowired
	private ITypeRepository typeRepository;
	/* (non-Javadoc)
	 * @see com.capgemini.talent.quizz.services.ITypeService#listeTypes()
	 */
	@Override
	public List<TypeQuestion> listeTypeQuestions() {
		// TODO Auto-generated method stub
		return typeRepository.findAll();
	}
	/* (non-Javadoc)
	 * @see com.capgemini.talent.quizz.services.ITypeService#getTypeQuestion(java.lang.Long)
	 */
	@Override
	public TypeQuestion getTypeQuestion(Long idTypeQuestion) {
		// TODO Auto-generated method stub
		return typeRepository.getOne(idTypeQuestion);
	}
	/* (non-Javadoc)
	 * @see com.capgemini.talent.quizz.services.ITypeService#ajouterTypeQuestion(com.capgemini.talent.quizz.entities.TypeQuestion)
	 */
	@Override
	public TypeQuestion ajouterTypeQuestion(TypeQuestion type) {
		// TODO Auto-generated method stub
		return typeRepository.save(type);
	}
	/* (non-Javadoc)
	 * @see com.capgemini.talent.quizz.services.ITypeService#supprimerTypeQuestion(java.lang.Long)
	 */
	@Override
	public void supprimerTypeQuestion(Long idTypeQuestion) {
		// TODO Auto-generated method stub
		typeRepository.delete(idTypeQuestion);
		
	}
	/* (non-Javadoc)
	 * @see com.capgemini.talent.quizz.services.ITypeService#modifierTypeQuestion(com.capgemini.talent.quizz.entities.TypeQuestion)
	 */
	@Override
	public TypeQuestion modifierTypeQuestion(TypeQuestion type) {
		// TODO Auto-generated method stub
		return typeRepository.save(type);
	}

}
