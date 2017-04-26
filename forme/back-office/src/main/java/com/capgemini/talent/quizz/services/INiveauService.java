package com.capgemini.talent.quizz.services;

import java.util.List;

import com.capgemini.talent.quizz.entities.Niveau;
import com.capgemini.talent.quizz.entities.Test;



/**
 * 
 * @author kaitalka
 *
 */
public interface INiveauService {
	public List<Niveau> listeNiveaux();	
	public Niveau getNiveau(Long idNiveau);	
	public Niveau ajouterNiveau(Niveau niveau);
	public void supprimerNiveau(Long idNiveau);
	public Niveau modifierNiveau(Niveau niveau);

}
