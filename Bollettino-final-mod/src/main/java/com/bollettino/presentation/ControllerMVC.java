package com.bollettino.presentation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bollettino.entities.Bollettino;
import com.bollettino.service.ContoAbilitatoService;

import ch.qos.logback.core.model.Model;


@Controller
@RequestMapping("/")
public class ControllerMVC {
	
	@Autowired
	ContoAbilitatoService contoAbilitatoService;
	
	 
	@GetMapping({"/", "home", "index"})
	public String home() {
		return "index.html";
	}
	
	@GetMapping("/dati-bollettino")
	public String datiBollettino() {
		return "dati-bollettino";
	}
	
	/*@PostMapping("/pagamento-bollettino")
	public String pagamentoBollettino() {
		
		return "pagamento-bollettino";
	}*/
	
	@PostMapping("/pagamento-bollettino")
	public String pagamentoBollettino(@ModelAttribute Bollettino formBolletino) {
		
		/*// Access the form data
		String codiceBollettino = formBolletino.getCodiceBollettino();
		double importo = formBolletino.getImporto();
		String causale = formBolletino.getCausale();
		String codiceContoCorrente = formBolletino.getContoCorrente();
		
		//mettere le regular expression per controllare i pattern giusti o attraverso javascript o su java
		
		boolean codiceContoCorrenteExists = contoAbilitatoService.existsContoCorrente(codiceContoCorrente);
		
		if(codiceContoCorrenteExists)
		
		// Creating the models for the index
		
		/*model.addAttribute("codiceBollettino", codiceBollettino);
		model.addAttribute("importo", importo);
		model.addAttribute("",);
		model.addAttribute("",);*/
		/*
		boolean numberExists = checkCodiceContoDestinatarioExistsInDatabase(numberInput);

        if (numberExists) {
            // Number exists, perform desired processing or database operations
            model.addAttribute("result", numberInput);
            
            
            
            return "result";
        } else {
            // Number does not exist, display an error message
            model.addAttribute("error", "Number does not exist in the database");
            return "error";
        }*/
		
		
		return "pagamento-bollettino";
	}
	
	/*@PostMapping("/conferma-pagamento")
	public String confermaPagamento() {
		return "conferma-pagamento";
	}*/
	
	 //@PostMapping("/testi")
	 	//public String addTesto(Bollettino b) {
		 //bs.pagaBollettino(b);
		 //return "redirect:/review";
	 //}
	
}
