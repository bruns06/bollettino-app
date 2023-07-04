package com.bollettini.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bollettini.entities.Bollettino;
import com.bollettini.entities.ContoAbilitato;
import com.bollettini.entities.Utente;
import com.bollettini.service.BollettinoService;
import com.bollettini.service.ContoAbilitatoService;
import com.bollettini.service.UtenteService;

@RestController
public class ControllerRest {

	@Autowired
	private BollettinoService serviceBollettino;
	@Autowired
	private ContoAbilitatoService serviceContoAbilitato;
	@Autowired
	private UtenteService serviceUtente;
	
	@GetMapping("bollettini")
	public List<Bollettino> getBollettino(){
		return serviceBollettino.getBollettino();
	}
	
	@GetMapping("conti_abilitati")
	public List<ContoAbilitato> getContoAbilitatos(){
		return serviceContoAbilitato.getContoAbilitato();
	}
	
	@GetMapping("utenti")
	public List<Utente> getUtente(){
		return serviceUtente.getUtente();
	}
	
}
