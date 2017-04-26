package com.capgemini.talent.quizz.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.talent.quizz.entities.Niveau;

/**
 * 
 * @author kaitalka
 *
 */
public interface INiveauRepository extends JpaRepository<Niveau, Long> {
	public Niveau findByIdNiveau(Long id);


}
