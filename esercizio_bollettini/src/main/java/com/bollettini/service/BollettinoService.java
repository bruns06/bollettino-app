package com.bollettini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bollettini.entities.Bollettino;
import com.bollettini.repo.BollettinoDAO;

@Service
public class BollettinoService {

	@Autowired
	private BollettinoDAO dao;
	
	public List<Bollettino> getBollettino(){
		return dao.findAll();
	}
}
