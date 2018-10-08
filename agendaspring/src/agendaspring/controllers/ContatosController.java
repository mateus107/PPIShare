package agendaspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContatosController {

	
	@RequestMapping("/contatos/form")
	public String form() {
		System.out.println("DRACARYS!!");
		return "contatos/form"; 
		
		
		
	}
	
	
}
