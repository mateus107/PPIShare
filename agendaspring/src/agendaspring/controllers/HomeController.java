package agendaspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {

	
	@RequestMapping("/") // Não precisa colocar o nome da classe poisa barra relacionada as classes.
	public String home() {
		System.out.println("Chama sagrada! ");
		return "home";
		
	}
	

	
	
}
