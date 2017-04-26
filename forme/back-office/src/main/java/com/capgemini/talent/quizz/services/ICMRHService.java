package com.capgemini.talent.quizz.services;

import java.util.List;

import com.capgemini.talent.quizz.entities.CMRH;
/**
 * 
 * @author gennaili
 *
 */

public interface ICMRHService {
	 public List<CMRH> getCMRHs();
     public CMRH ajouterCMRH(CMRH cmrh);
     public void editerCMRH(CMRH cmrh);
     public CMRH chercherCMRH(String nom);
}
