package com.capgemini.talent.quizz.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.capgemini.talent.quizz.entities.Candidat;
import com.capgemini.talent.quizz.entities.Test;

/**
 * 
 * @author kaitalka
 *
 */
public interface ICandidatRepository extends JpaRepository<Candidat, Long>{
	//@Query("select c from candidat c where c.nom like %?1")
	public List<Candidat> findByTests(Test tests);
//	@Query("select c from candidat c ")
//	public List<Candidat> chercherCandidat(String motCle);

}
