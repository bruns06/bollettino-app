package com.bollettini.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bollettini.entities.Bollettino;
import com.bollettini.service.BollettinoService;
import com.bollettini.service.UtenteService;

public class ControllerMVC {
	
	 @Autowired
	 UtenteService us;
	 
	 @Autowired
	 BollettinoService bs;
	
	 @GetMapping({"/", "home", "index"})
		public String home() {
			return "index.html";
		}
	
	 @GetMapping("testi")
		public String showBollettino() {
			return "pagaBollettino.html";
		}
	 
	 @PostMapping("/pagaBollettino")
	 	public String pagaBollettino(Bollettino b) {
		 bs.pagaBollettino(b);
		 return "pagaBollettino.html";
	 }
	
}
