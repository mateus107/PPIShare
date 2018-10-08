package agendaspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import agendaspring.models.Aluno;
import agendaspring.models.Contato;
@Controller
public class HomeController {

	
	@RequestMapping("/") // Não precisa colocar o nome da classe poisa barra relacionada as classes.
	public String home() {
		System.out.println("Chama sagrada! ");
		return "home";
		
	}
	
	@RequestMapping("/contatos")
	public String adicionar(Contato contato) {
		System.out.println("Id: " + contato.getId());
		System.out.println("Nome: " + contato.getNome());
		System.out.println("Endereco: " + contato.getEndereco());
		System.out.println("Email: " + contato.getEmail());
		System.out.println("Email: " + contato.getDataNascimento());
		System.out.println("Chamou o metodo de add");
		return "contatos/ok"; 
	}
	
}
