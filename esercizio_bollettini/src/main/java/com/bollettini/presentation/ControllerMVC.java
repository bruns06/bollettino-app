package com.bollettini.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import com.bollettini.service.BollettinoService;
import com.bollettini.service.UtenteService;

public class ControllerMVC {
	
	
	 
	@GetMapping({"/", "home", "index"})
	public String home() {
		return "index.html";
	}
	
	@GetMapping("/dati-bollettino")
	public String datiBollettino() {
		return "dati-bolletino";
	}
	
	 //@PostMapping("/testi")
	 	//public String addTesto(Bollettino b) {
		 //bs.pagaBollettino(b);
		 //return "redirect:/review";
	 //}
	
}
