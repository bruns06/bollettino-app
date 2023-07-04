package com.bollettini.presentation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bollettini.entities.Bollettino;
import com.bollettini.repo.BollettinoDAO;

import ch.qos.logback.core.model.Model;


@Controller
@RequestMapping("/")
public class ControllerMVC {

	@Autowired
	BollettinoDAO dao;
	
		//GET
	
	@GetMapping({"/", "home", "index"})
	public String home() {
		return "index.html";
	}
	
	@GetMapping("/dati-bollettino")
	public String datiBollettino() {
		return "/dati-bollettino";
	}
	
	@GetMapping("/pagamento-bollettino")
	public String pagaBollettino() {
		return "pagamento-bollettino";
	}
	
	@GetMapping("/conferma-pagamento")
	public String confermaBollettino() {
		return "conferma-pagamento";
	}
	
		//POST
	
	@PostMapping("/dati-bollettino-post")
	public String datiBollettinoPost(Bollettino b) {
		return "redirect:/pagamento-bollettino";
	}
	
	@PostMapping("/pagamento-bollettino-post")
	public String pagamentoBollettinoPost(Bollettino b) {
		dao.save(b);
		return "pagamento-bollettino";
	}
	
	@PostMapping("/conferma-pagamento-post")
	public String confermaPagamentoPost(Bollettino b) {
		return "conferma-pagamento";
	}
	
	/*@GetMapping("/pagamento-bollettino")
	public String pagamentoBollettino(@ModelAttribute Bollettino formBolletino, Model model) {
		return "pagamento-bollettino";
	}*/
	
	
	
	 //@PostMapping("/testi")
	 	//public String addTesto(Bollettino b) {
		 //bs.pagaBollettino(b);
		 //return "redirect:/review";
	 //}
	
}
