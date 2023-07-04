package com.bollettini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bollettini.entities.ContoAbilitato;
import com.bollettini.repo.ContoAbilitatoDAO;

@Service
public class ContoAbilitatoService {

	@Autowired
	private ContoAbilitatoDAO dao;
	
	public List<ContoAbilitato> getContoAbilitato(){
		return dao.findAll();
	}
}
