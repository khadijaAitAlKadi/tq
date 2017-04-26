package com.capgemini.talent.quizz.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.talent.quizz.entities.Candidat;
import com.capgemini.talent.quizz.entities.Test;
import com.capgemini.talent.quizz.services.ICandidatService;

@RestController
@RequestMapping(value="/candidats")
public class CandidatRestService {
	@Autowired
	private ICandidatService iCandidatService;

	@RequestMapping(value="/getCandidats",method=RequestMethod.GET)
	public List<Candidat> getCandidats() {
		return iCandidatService.listerCandidats();
	}

	@RequestMapping(value="/addCandidat",method=RequestMethod.POST)
	public Candidat addCandidat(@RequestBody Candidat s) {
		return iCandidatService.ajouterCandidat(s);
	}

	@RequestMapping(value="/deleteCandidat",method=RequestMethod.DELETE)
	public void deleteCandidat(Long idCandidat) {
		iCandidatService.supprimerCandidat(idCandidat);
	}

	@RequestMapping(value="/getCandidat",method=RequestMethod.GET)
	public List<Candidat> getCandidat(Test test) {
		return iCandidatService.chercherCandidat(test);
	}

	@RequestMapping(value="/editCandidat",method=RequestMethod.PUT)
	public void editCandidat(Candidat s) {
		iCandidatService.modifierCandidat(s);
	}

}
