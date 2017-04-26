package com.capgemini.talent.quizz.services;
/**
 * 
 * @author kaitalka
 *
 */
import java.util.List;
import com.capgemini.talent.quizz.entities.Candidat;
import com.capgemini.talent.quizz.entities.Test;



public interface ICandidatService {
	 public List<Candidat> listerCandidats();
	 public List<Candidat> listerCandidats(Test test);
     public Candidat ajouterCandidat(Candidat s);
     public void supprimerCandidat(Long idCandidat);
     public List<Candidat> chercherCandidats(Test test);
     public Candidat chercherCandidat(Long idCandidat);
     public void modifierCandidat(Candidat s);

}
