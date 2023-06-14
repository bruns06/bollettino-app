package com.bollettini.service;

import org.springframework.stereotype.Service;

import com.bollettini.entities.Bollettino;
import com.bollettini.repo.BollettinoDAO;

@Service
public class BollettinoService {
	
	BollettinoDAO bDAO;
	
	public void pagaBollettino(Bollettino b) {
			
		String codiceB = b.getCodiceBollettino();
		String causaleB = b.getCausale();
		double importoB = b.getImporto();
		String codiceContoB = b.getCodiceContoDestinatario();
		
		b.setCodiceBollettino(codiceB);
		b.setCausale(causaleB);
		b.setImporto(importoB);
		b.setCodiceContoDestinatario(codiceContoB);
	
		bDAO.save(b);
		
		}
	
}
