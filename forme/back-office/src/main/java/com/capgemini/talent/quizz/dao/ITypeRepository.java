/**
 * 
 */
package com.capgemini.talent.quizz.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.talent.quizz.entities.TypeQuestion;

/**
 * @author kaitalka
 *
 */
public interface ITypeRepository extends JpaRepository<TypeQuestion, Long> {
	public List<TypeQuestion> findByIdType(Long idType);

}
